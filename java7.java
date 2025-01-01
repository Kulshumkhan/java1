import java.util.*;
public class java7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
       // if (num==1)
        //{
          //  System.out.println("hello");
        //} else if (num==2) {
          //  System.out.println("namaste");

        //} else if (num==3) {
          //  System.out.println("bonju");
switch (button){
    case 1:
        System.out.println("hello");
        break;
    case 2:
        System.out.println("namaste");
        break;
    case 3:
        System.out.println("bonju");
        break;
    default:
        System.out.println("invalid");
}
        }

    }
