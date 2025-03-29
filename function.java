import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        string();
     int num1=arithmeticOperation();
     int num2=arithmeticOperation();

      int sum= num1+num2;
      System.out.println("Sum of two number: "+sum);
        System.out.println(SumOfTwoNumber(4,7));
    }
//no return given and not taken anything.
    public static void string() {
        System.out.println("Good Morning everyone: ");
    }
//only return given.
    public static int arithmeticOperation() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num=sc.nextInt();
        return num;
    }
    //given parameter and argument md taken number as a return number.
    public static int SumOfTwoNumber(int num1,int num2/*parameter*/){
        return num1+num2;
    }
}
