import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First  number: ");
        int num1 =sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 =sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
       // if (num>0){
    //        System.out.println("The given number is positive");
  //      } else if (num==0) {
//            System.out.println("The given number is zero");

      //  }else{
      //      System.out.println("The number is negative.");
      //  }
//if (num%2==0){
  //  System.out.println("The number is EVEN.");
//}else {
  //  System.out.println("The number is ODD.");
//}
        if (num1>num2 && num1>num3){
            System.out.println("Number1 is greater of all.");
        } else if (num2>num1 && num2>num3) {
            System.out.println("the number 2is greatest of all.");
        }else {
            System.out.println("number3 is greatest of all.");
        }
    }
}
