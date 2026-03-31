class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
        int size = n + m - 1;

        char[] ans = new char[size];
        boolean[] modifiable = new boolean[size];

        Arrays.fill(modifiable, true);

        // Step 1: Handle 'T'
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    int pos = i + j;

                    if (ans[pos] != 0 && ans[pos] != str2.charAt(j))
                        return "";

                    ans[pos] = str2.charAt(j);
                    modifiable[pos] = false;
                }
            }
        }

        // Step 2: Fill remaining with 'a'
        for (int i = 0; i < size; i++) {
            if (ans[i] == 0)
                ans[i] = 'a';
        }

        // Step 3: Handle 'F'
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {

                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (ans[i + j] != str2.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    int change = -1;
                    for (int j = 0; j < m; j++) {
                        if (modifiable[i + j])
                            change = i + j;
                    }

                    if (change == -1) return "";

                    ans[change] = 'b';
                    modifiable[change] = false;
                }
            }
        }

        return new String(ans);
    }
}