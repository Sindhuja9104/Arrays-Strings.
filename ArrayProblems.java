//Q:given 2 integers a and b.Swap the two given values using sum and 
//differene method
public class ArrayProblems {
    public static void swap(int a,int b){
        System.out.println("Before swaping: ");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping:");
        System.out.println("a" +  a);
        System.out.println("b" + b);
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 4;
        swap(a , b);
    
    }

    
}
