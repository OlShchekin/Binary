package Binary;
import java.util.Scanner;

public class Binary {
            public static void main (String [] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println ("Введите число в двоичной системе счисления:");
            String bin = sc.nextLine();
            int dec = Integer.parseInt(bin, 2);
            System.out.println(dec);
            System.out.println(Integer.toBinaryString(dec)+ "->" + dec);
            sc.close ();
            }
}
