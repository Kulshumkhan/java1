import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Please Enter the Year:  ");
        int num =input.nextInt();
        if (num%400==0 || (num%4==0 && num%100 != 0)){
            System.out.println("Year enter is leap year. ");
        }else{
            System.out.println("Year is not leap is. ");
        }
    }
}
