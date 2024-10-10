import java.util.Scanner;
import java.util.StringTokenizer;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pilihan ;

        do {
            System.out.println(" Masukkan kalimat yang ingin di hitung :  ");
            String kalimat = scanner.nextLine();

            StringTokenizer tokenizer =  new StringTokenizer(kalimat);

            int jumlahkata = tokenizer.countTokens();

            System.out.println("Jumlah Kata dalam kalimat :" + jumlahkata);

        do {
            System.out.println("apa anda ingin memasukkan kalimat lagi ? (Y/T)");
            pilihan = scanner.nextLine();

            if (!pilihan.equalsIgnoreCase("Y") && !pilihan.equalsIgnoreCase("T")); {
                System.out.println("-Pilihan tidak di ketahui, mohom memasukkan 'Y' atau 'T'-");
            }

        } while (!pilihan.equalsIgnoreCase("Y") && !pilihan.equalsIgnoreCase("T"));

        } while (pilihan.equalsIgnoreCase("Y"));

        System.out.println("Program selesai");
        scanner.close();



    }

    
}