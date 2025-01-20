import java.util.Scanner;

public class updatebit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int oper=sc.nextInt();
        int n=5;
        int pos=2;
        int bitMask=1<<pos;
        if (oper==1){
            int newNumber=bitMask|n;
            System.out.println(newNumber);
        }
        else
        {
            int newbitmask=~(bitMask);
            int newnumber=newbitmask&n;
            System.out.println(newnumber);
        }
    }
}
