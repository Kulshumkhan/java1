import java.util.Scanner;

public class bitwise{

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //getbit
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        if ((bitMask & n)==0){
            System.out.println("number is zero");
        }
        else {
            System.out.println("number is one");
        }
    }
}
