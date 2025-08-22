class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mag_hash=new HashMap<>();
        for(char c: magazine.toCharArray())
        {
            mag_hash.put(c, mag_hash.getOrDefault(c,0)+1);
        }
        for(char c : ransomNote.toCharArray())
        {
            if(! mag_hash.containsKey(c) || mag_hash.get(c)<=0)
            {
                return false;
            }
            mag_hash.put(c,mag_hash.get(c)-1);
        }
        return true;
    }
}