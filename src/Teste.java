import java.text.NumberFormat;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static float media(float a, float b) {
        return (a + b) / 11;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.useLocale(Locale.US);
        float x, y, z;
        x = ler.nextFloat();
        y = ler.nextFloat();
        z = media(x, y);
        System.out.printf("MEDIA = %.5f", z);
    }
}