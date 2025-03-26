import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter the Number: ");
    int num=sc.nextInt();
    numberMultiplication(num);
    }
    public static void numberMultiplication(int num){
        int i=1;
        while (i<=10){
            System.out.println(num+"X"+ i +"="+(num*i));
            i++;
        }
    }
}
