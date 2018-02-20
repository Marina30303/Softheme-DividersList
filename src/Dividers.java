import java.util.Scanner;

/**
 * Created by Марiна on 19.02.2018.
 */
public class Dividers {


    public static void dividers(int input)
    {
        for (int i = 1; i<=input; i++)
        {
            if (input%i==0)
                System.out.println(i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.print("Put your number here: ");
        if(sc.hasNextInt()) {
            i = sc.nextInt();
            dividers(i);
        } else {
            System.out.println("It's not a number! Please, try later!");
        }
    }

}
