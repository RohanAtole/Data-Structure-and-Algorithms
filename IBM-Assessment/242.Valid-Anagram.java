class Solution {
    public boolean isAnagram(String s, String t) {

        //for ignore case match
        s = s.toLowerCase();
        t = t.toLowerCase();

        //remove white spaces
        s = s.replace(" ","");
        t = t.replace(" ","");

        //initialise bucket array
        int[] counts = new int[26];

        //for fill the bucket
        for(int i = 0; i < s.length(); i++){
            counts[s.charAt(i)-'a']++;
        }

        //for empty the bucket
        for(int i = 0; i < t.length(); i++){
            counts[t.charAt(i)-'a']--;
        }

        //check if all bucket are empty
        for(int count : counts){
            if(count != 0)
                return false;
        }
        return true;
    }
}
