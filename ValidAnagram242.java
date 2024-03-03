public class ValidAnagram242 {
    public static void main(String[] args) {
        String s="rat";//"anagram";
        String t="car";//"nagaram";   
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        int ch[] = new int[26];
        for(char i:s.toCharArray()){
            ch[i-'a']++;
        }

        for(char i:t.toCharArray()){
            ch[i-'a']--;
        }

        for(int i:ch){
            if(i!=0){
                return false;
            }
        }
        return true;
    }
}
