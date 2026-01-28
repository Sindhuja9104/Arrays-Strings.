public class fibonaciiRecursion {
    public static int fibonacci(int n){
        //base case
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n - 2) + fibonacci(n - 1);

    }
    public static void main(String[] args){
        //fib(n - 2) + fib(n - 1)
        int num = 10;
        for(int i = 0;i <= num;i++){
            System.out.println(fibonacci(i));
  
        }
          }
    

}


