import java.util.Scanner;
public class harmonikSayi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("N Sayısınu Giriniz : ");
        int n = inp.nextInt();

        double result = 0;

        for (double i = 1; i <= n; i++){
            result += (1/i);
        }
        System.out.print("Harmonik Sayı Değeri : " + result);
    }
}
