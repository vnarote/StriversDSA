//Constraints -1000 <= User Input <= 1000
//Take user input and print the input if it satisfies all the conditions.

import java.util.Scanner;
class One
{
    public static void printNumber(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=s.nextInt();
        if(a>=-1000 && a<=1000){
            System.out.println(a);
        }
        else{
            System.out.println("Invalid input");
        }
        s.close();
    }
    public static void main(String[] args) {
        printNumber();
    } 
}