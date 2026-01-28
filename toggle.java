public class toggle {
    public static void toggleCharaters(String str){
        StringBuilder sb= new StringBuilder(str);
        String ans = "";
        
        for(int i =0;i < str.length();i++){
            boolean flag = true;
            char ch = str.charAt(i);//p
            int ascii = (int) ch;//
            if(ascii >= 97) {
                flag = false;
            }
            if(flag == true ){
                ascii+=32;
                char newch=(char)ascii;
                sb.setCharAt(i, newch);
            }

            else{
                ascii-=32;
                char newch=(char)ascii;
                sb.setCharAt(i, newch);
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        String str = "PHYSicS";
        toggleCharaters(str);


    }
}
