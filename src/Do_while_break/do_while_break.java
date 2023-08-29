
package Do_while_break;
import java.util.Scanner;
public class do_while_break {
    public static void main (String [] args) {
    Scanner input = new Scanner (System.in);
    int nilai, b;
        System.out.println("=====PROGRAM LOOP DENGAN BREAK=====");
        b = 0;
        do {
            System.out.print("Masukkan bilangan : ");
            nilai = input.nextInt();
            b += nilai;
            if (b>50) break;
             
        }
        while (true);
        System.out.printf("Angka berhenti pada nilai : %d\n", b);
        
    }
}

