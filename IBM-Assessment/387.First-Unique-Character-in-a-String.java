class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap();
        char[] array = s.toCharArray();

        for(int i = 0; i < array.length; i++){
            if(map.containsKey(array[i])){
                int count = map.get(array[i]);
                map.put(array[i], count+1);
            }
            else{
                map.put(array[i], 1);
            }
        }
        for(int i = 0; i < array.length; i++){
            int count = map.get(array[i]);
            if(count == 1){
                return i;
            }
        }
        return -1;
    }
}
