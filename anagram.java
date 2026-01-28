public class anagram {
    public static  boolean isAnagram(String s1, String s2){
        //base case
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i =0;i < s1.length();i++){
            char ch = s1.charAt(i);
            int index = s2.indexOf(ch);
            if(index==-1){
                return false;
            }
            s2=s2.substring(0,index)+s2.substring(index + 1);
        }
        return s2.isEmpty();
    }
    public static void main(String[] args) {
        String str_1 = "silent";
        String str_2 = "listen";
        System.out.println(isAnagram(str_1,str_2) ? "Anagram" : "Not a Anagram");
    }
}
