import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Masukkan umur anda");
        int umur = s.nextInt();

        if(umur >= 17){
            System.out.println("Boleh buat ktp!");
        }else if(umur >=6){
            System.out.println("Boleh buat kartu pelajar!");
        }else{
            System.out.println("Belum boleh buat ktp dan kartu pelajar!");
        }
    }
}
