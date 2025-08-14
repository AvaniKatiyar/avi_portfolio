class Solution {
    public int countCharacters(String[] words, String chars) {
        HashMap <Character,Integer> charmap=new HashMap<>();
        int result=0;
        //making hashtable for character with "alphabet" as key and "frequency of alphabet" as value 
        for(char c: chars.toCharArray())
        {
            charmap.put(c,charmap.getOrDefault(c,0)+1);
        }
        //loop to iterate through "words" array
        for(String s: words)
        {
            boolean can=true;
          HashMap<Character, Integer> tempmap = new HashMap<>(charmap); // Copy original map
        // we get a words :suppose "cat"
          for(char c: s.toCharArray())
          {
                  // this loop is to check each letter of the words "cat"
           if(!tempmap.containsKey(c) || tempmap.get(c)==0)
           {
            can=false;
            break;
           }
           tempmap.put(c,tempmap.get(c)-1);
          }
          if(can)
          result+=s.length();
        }
        return result;
    }
}