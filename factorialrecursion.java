public class factorialrecursion {
    //5!=5*4*3*2*1
    // n*(n-1)*(n-2)*(n-3)......
    public static int factorial (int n){
        //base case
        if(n==0|| n==1){
            return n;

        }
        //recursion case
        return n * factorial(n-1);
    }
    public static void main(String[] args){
        int n =5;
        System.out.println(factorial(n));
    }
}    
