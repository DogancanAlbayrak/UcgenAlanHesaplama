import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {

    int a, b, c, u, alan;

    Scanner veri = new Scanner(System.in);
    System.out.print("1. Kenarı Giriniz : ");
    a = veri.nextInt();
    System.out.print("2. Kenarı Giriniz : ");
    b = veri.nextInt();
    System.out.print("3. Kenarı Giriniz : ");
    c = veri.nextInt();

    u = (a + b + c) / 2;

    alan = (int) Math.sqrt(u * ( u-a ) * (u - b) * (u - c));

    System.out.println("Alan : " + alan);


}
}