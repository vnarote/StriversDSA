import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num=s.nextInt();
        if (num>0 && num<=50) {
            switch (num) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                System.out.println("Tuesday");
                    break;
                case 3:
                System.out.println("Wednesday");
                    break;
                case 4:
                System.out.println("Thursday");
                    break;
                case 5:
                System.out.println("Friday");
                    break;
                case 6:
                System.out.println("Saturday");
                    break;
                case 7:
                System.out.println("Sunday");
                    break;
                default:
                System.out.println("Invalid");
                    break;
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
