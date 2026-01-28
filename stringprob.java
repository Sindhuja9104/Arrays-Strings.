public class stringprob {
    public static void printAllSubString(String str) {
        for(int i = 0;i < str.length();i++){
            for( int j = i+1;j <= str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
    public static void main(String[] args){
    String str = "abcd";
    printAllSubString(str);
}

}



