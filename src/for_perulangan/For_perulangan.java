
package for_perulangan;
import java.util.Scanner;
public class For_perulangan {
    public static void main(String[] args) {
    int angka, fac, i; 
        System.out.println("=====PROGRAM MENGHITUNG NILAI FAKTORIAL DENGAN FOR=====");
        System.out.println("Masukkan bilangan : ");
        
        Scanner input = new Scanner(System.in);
        angka = input.nextInt();
        fac = 1;
        for (i = 1; i <=angka; i++){ // i=1 merupakan inisialisasi, dilanjutkan dengan kondisi, lalu step nilai
        
            fac = fac*i;
        
        System.out.printf("Nilai faktorial bilangan tersebut adalah : %d\n", fac);
    }
    }
    
}
