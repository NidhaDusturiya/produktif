package acara12;
import java.util.Scanner;
public class acara12 {
    public static void main (String[]args) {
    long bilangan = 15L; // nilai bilangan maksimal
    long faktorial = 1L; // variabel untuk menyimpan faktorial
    // looping untuk mencari faktorial pada bilangan
    for (long i = 1L; i <= bilangan; i++)
    { faktorial = 1L;  // inisialisasi faktorial
    //menghitung nilai faktorial
    for (long faktor = 2; faktor <=i; faktor++){
        faktorial *= faktor;
    }
        System.out.println("Faktorial dari " + i + " adalah " + faktorial);
    } 
    }
    
}
