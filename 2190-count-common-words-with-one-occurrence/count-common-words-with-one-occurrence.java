class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1 = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();
        int count =0;
        for(String st:words1){
            map1.put(st,map1.getOrDefault(st,0)+1);
        }
        for(String st:words2){
            map2.put(st,map2.getOrDefault(st,0)+1);
        }
        for(Map.Entry<String,Integer> map : map1.entrySet()){
            
            if(map.getValue() ==1){
                if(map2.get(map.getKey())==null){
                    continue;
                }
                if(map2.get(map.getKey()) ==1 ){
                    count++;
                }
            }
        }
        return count;
    }

}