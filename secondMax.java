public class secondMax {
    public static void main(String[] args) {
        int arr[] = {4,7,9,2,1};
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int num: arr){
            if(num>firstMax){
                secondMax = firstMax;
                firstMax = num;
            }else if (num > secondMax && num< firstMax){
                secondMax = num;
            }
        }
        System.out.println("second max value: "+secondMax);
    }
}