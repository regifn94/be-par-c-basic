import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan hari ke - : ");
        int hari = input.nextInt();

        switch (hari){
            case 1:
                System.out.println("Hari Minggu");
                break;
            case 2:
                System.out.println("Hari Senin");
                break;
            case 3:
                System.out.println("Hari Selasa");
                break;
            case 4:
                System.out.println("Hari Rabu");
                break;
            case 5:
                System.out.println("Hari Kamis");
                break;
            case 6:
                System.out.println("Hari Jum'at");
                break;
            case 7:
                System.out.println("Hari Sabtu");
                break;
            default:
                System.out.println("Pilih angka 1 - 7");
        }
    }
}
