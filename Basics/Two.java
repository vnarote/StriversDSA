import java.util.Scanner;
public class Two {
    public static void studentGrade(int marks){
        if(marks>=90){
            System.out.println("Grade A");
        }
        else{
            if(marks>=70)
            {
                System.out.println("Grade B");
            }
            else
            {
                if(marks>=50)
                {
                    System.out.println("Grade C");
                }
                else
                {
                    if(marks>=35)
                    {
                        System.out.println("Grade D");
                    }
                    else
                    {
                        System.out.println("Fail"); 
                    }        
                }   
            }
        } 
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks=s.nextInt();
        if(marks>=0 && marks<=100)
        {
        studentGrade(marks);
        }
        else
        {
            System.out.println("Invalid input");
        }
    }
}
