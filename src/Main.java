
import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException, InterruptedException {

        ConversorDeMonedas conversorDeMonedas = new ConversorDeMonedas();

        conversorDeMonedas.convertir(scanner);
    }
}