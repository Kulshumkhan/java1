import java.util.Scanner;

public class revision2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int array[]  = new int[3];
        array[0] =98;
        array[1] =97;
        array[2] =87;*/
        int size =sc.nextInt();
        int array[] =new int[size];
        for (int i=0;i<size;i++)
        {
            array[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            System.out.print(array[i]+" ");
        }
    }
}
