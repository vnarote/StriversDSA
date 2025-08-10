import java.util.Scanner;

public class methodoverload {
    
    public void display(int a ,int b,int c){
        
        int d = a+b+c;
        System.out.println("Addition is :"+d);
    }
    public void display(double a , double b , double c){
        double d = a+b+c;
        System.out.println("Addition is :"+d);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        methodoverload m = new methodoverload();

        System.out.println("Enter 3 numbers for addition either integers or decimals");
        String s1=sc.next();
        String s2=sc.next();
        String s3=sc.next();      

        try {
            int a=Integer.parseInt(s1);
            int b=Integer.parseInt(s2);
            int c=Integer.parseInt(s3);
            m.display(a, b, c);
        } catch (NumberFormatException e) {
            System.out.println("Invalid output enter all Integers");
        }
       try{
        double a=Double.parseDouble(s1);
        double b=Double.parseDouble(s2);
        double c=Double.parseDouble(s3);
        m.display(a, b, c);
       } catch(NumberFormatException ee){
        System.out.println("Invalid input enter all Decimals");
       }
       sc.close();
    }
}
