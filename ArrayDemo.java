import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int numbers[] = {23,66,95109};
        String names[] ={"honey","anvi"};
        int marks[] = new int[4];
        marks[2] =20;
        //marks[4] =50;//out of bound
        marks[0] =35;
        marks[1] =25;
        marks[3] =65;
        /*for(int i=0;i < marks.length;i++){
            System.out.println(marks[i]);
        }*/

        /*for(int num:marks){
            System.out.println(num );
        }*/


     //to print num*2 with numbers initialied
        /*for(int num: numbers){
            System.out.println(num * 2);
        }*/


     ///to print names in the array
        /*for(String num:names ){
            System.out.println(num);
        }*/



        ///we want to add all the elements of the array
        /*int sum =0;
        for(int n: numbers){
            sum +=n;
        }
        System.out.println("Sumof the Array is: "+sum);*/

  ///to print the min values
        /*int max = Integer.MIN_VALUE;
        //System.out.println(Integer.MIN_VALUE);
        for(int num: numbers){
        if(num > max){
        max = num;
        }
    }
    System.out.println("Maximum value in the array is: "+max);*/


    /*///here we change the numbers in int numbers={23,66,95,109}
        int max = Integer.MIN_VALUE;
        //System.out.println(Integer.MIN_VALUE);
        for(int num: numbers){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Maximum value in the array is: "+max);*/

       /*///here we want num*2 to print
        int max = Integer.MIN_VALUE;
        //System.out.println(Integer.MIN_VALUE);
        for(int updatedArr: numbers){
            updatedArr = num*2;
            if(updatedArr > max){
                max = updatedArr;
            }
        }
        System.out.println("Maximum value in the array is: "+max);*/



        /*/// to execute this comment the initial stmts 
        int numbers[] = {21,42,73,4,55};
        int target = 73;
        for(int i =0;i < numbers.length;i++){
            if(numbers[i] == target){
                System.out.println(i);
            }
        }*/


       ///to print the size of the array and elements 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");

        int size = sc.nextInt();
        int number[] = new int[size];

        //taking element from user
        System.out.print("Enter thne element of the array:");
        for(int i=0;i<size;i++){
            number[i] = sc.nextInt();
        }

        /*//printing the elements
        for(int i =0;i < size;i++){
            System.out.print(number[i]+" ");
        }*/


         //how to find 2nd max value
        /*int firstMax =Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i=0; i < size; i++) {
            if(number[i] >= firstMax){
            secondMax = firstMax;
            firstMax = number[i];
            }
            if(number[i] > secondMax && number[i] < firstMax) {
                secondMax = number[i];
            }
        }
        System.out.println("The first max value is:" + firstMax); 
        System.out.println("The second max value is: "+ secondMax);*/



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