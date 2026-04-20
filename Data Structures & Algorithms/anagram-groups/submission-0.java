class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp= new HashMap<>();
        for(String s:strs ){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String sorteds= new String(c);
            mp.putIfAbsent(sorteds,new ArrayList<>());
            mp.get(sorteds).add(s);
        }

        return new ArrayList<>(mp.values());
        
    }
}
