import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConversorDeMonedas {

    private static String URL = "https://v6.exchangerate-api.com/v6/86fa382a304dd5ec4522d092/latest/";

    private static Gson gson = new Gson();

    private static PrintlnApp printlnApp = new PrintlnApp();

    public ConversorDeMonedas(){
    }

    public void convertir( Scanner scanner) throws IOException, InterruptedException {

        int opcion;

        do {
            printlnApp.getMensaje();

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirDolarAPesoArgentino(scanner);
                    break;
                case 2:
                    convertirPesoArgentinoADolar(scanner);
                    break;
                case 3:
                    convertirDolarARealBrasilenio(scanner);
                    break;
                case 4:
                    convertirRealBrasilenioADolar(scanner);
                    break;
                case 5:
                    convertirDolarAPesoColombiano(scanner);
                    break;
                case 6:
                    convertirPesoColombianoADolar(scanner);
                    break;

                case 7:
                    System.out.println("Saliendo del Conversor de Moneda. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, elija una opción válida.");
                    break;
            }
        } while (opcion != 7 );

        scanner.close();
    }

    private static void convertirDolarAPesoArgentino(Scanner scanner) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(URL+Moneda.USD)).build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Respuesta respuestaObj = gson.fromJson(response.body(), Respuesta.class);

        System.out.print("Ingrese la cantidad en dólares a convertir: ");

        Float cantidadDolares = scanner.nextFloat();
        Float resultado = cantidadDolares * respuestaObj.getTasas().getARS();
        System.out.println(cantidadDolares + " dólares equivalen a " + resultado + " pesos argentinos.");
    }

    private static void convertirPesoArgentinoADolar(Scanner scanner) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(URL+Moneda.ARS)).build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Respuesta respuestaObj = gson.fromJson(response.body(), Respuesta.class);

        System.out.print("Ingrese la cantidad en pesos argentinos a convertir: ");

        Float cantidadPesosArgentinos = scanner.nextFloat();
        Float resultado = cantidadPesosArgentinos * respuestaObj.getTasas().getUSD();
        System.out.println(cantidadPesosArgentinos + " pesos argentinos equivalen a " + resultado + " dólares.");
    }

    private static void convertirDolarARealBrasilenio(Scanner scanner) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(URL+Moneda.USD)).build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Respuesta respuestaObj = gson.fromJson(response.body(), Respuesta.class);

        System.out.print("Ingrese la cantidad en dólares a convertir: ");

        Float cantidadDolares = scanner.nextFloat();
        Float resultado = cantidadDolares * respuestaObj.getTasas().getBRL();
        System.out.println(cantidadDolares + " dólares equivalen a " + resultado + " reales brasileños.");
    }

    private static void convertirRealBrasilenioADolar(Scanner scanner) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(URL+Moneda.BRL)).build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Respuesta respuestaObj = gson.fromJson(response.body(), Respuesta.class);

        System.out.print("Ingrese la cantidad en reales brasileños a convertir: ");

        Float cantidadRealesBrasilenios = scanner.nextFloat();
        Float resultado = cantidadRealesBrasilenios * respuestaObj.getTasas().getUSD();
        System.out.println(cantidadRealesBrasilenios + " reales brasileños equivalen a " + resultado + " dólares.");
    }

    private static void convertirDolarAPesoColombiano(Scanner scanner) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(URL+Moneda.USD)).build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Respuesta respuestaObj = gson.fromJson(response.body(), Respuesta.class);

        System.out.print("Ingrese la cantidad en dólares a convertir: ");

        Float cantidadDolares = scanner.nextFloat();
        Float resultado = cantidadDolares * respuestaObj.getTasas().getCOP();
        System.out.println(cantidadDolares + " dólares equivalen a " + resultado + " pesos colombianos.");
    }

    private static void convertirPesoColombianoADolar(Scanner scanner) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(URL+Moneda.COP)).build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        Respuesta respuestaObj = gson.fromJson(response.body(), Respuesta.class);

        System.out.print("Ingrese la cantidad en pesos colombianos a convertir: ");

        Float cantidadPesosColombianos = scanner.nextFloat();
        Float resultado = cantidadPesosColombianos * respuestaObj.getTasas().getUSD();
        System.out.println(cantidadPesosColombianos + " pesos colombiano equivalen a " + resultado + " dólares.");
    }

}