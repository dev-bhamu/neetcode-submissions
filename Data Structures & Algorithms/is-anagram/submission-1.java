class Solution {
    public boolean isAnagram(String s, String t) {
      if (s.length() != t.length()) {
            return false;
        }
      HashMap<Character,Integer> hm = new HashMap<>();
      for(char c: s.toCharArray()){
        hm.put(c,hm.getOrDefault(c,0)+1);
      }

       HashMap<Character,Integer> hm1 = new HashMap<>();
      for(char c: t.toCharArray()){
        hm1.put(c,hm1.getOrDefault(c,0)+1);
      }

     return hm.equals(hm1);
    }
}
