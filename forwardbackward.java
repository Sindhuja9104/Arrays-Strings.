//print  0 to n numbers forward and backward  order

import java.util.Scanner;
public class forwardbackward {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        //Forward
        System.out.println("Forward:");
        for(int i = 0;i <= n;i++){
            System.out.print(i+" ");
        }
        System.out.println("Backward:");
        for(int i =n;i >= 0;i--){
            System.out.print(i+" ");
        }
    }
}       

