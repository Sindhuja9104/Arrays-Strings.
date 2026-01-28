public class StringCompression {
    
    public static void main(String[] args){
        String str = "aaabbbccdeeeee";
        String ans = ""+str.charAt(0);
        int count=0;
        for(int i = 1;i<=str.length();i++){
            int current =str.charAt(1);
            int prev=str.charAt(i=1);
            if(current == prev){
                count++;
            }
            else{
                ans += count;
                count=1;
                ans += current;
                
            }
        }
    }
}
