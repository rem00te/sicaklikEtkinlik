import java.util.Scanner;

public class base {
    public static void main(String[] args) {
        int sicak;

        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık giriniz : ");
        sicak = input.nextInt();

        if (sicak <= 5) {
            System.out.println("Kayak Yapılabilir");
        } else if (sicak > 5 && sicak <= 15) {
            System.out.println("Sinema gidilebilir");
        } else if (sicak > 15 && sicak <= 25) {
            System.out.println("Piknik Yapılabilir");
        } else  {
            System.out.println("Yüzme yapılabilir");
        }


    }
}
