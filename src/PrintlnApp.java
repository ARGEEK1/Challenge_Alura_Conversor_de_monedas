public class PrintlnApp {
    private static final String mensaje = """
            ******************************************
            Sea bienvenido/a al Conversor de Moneda =]
            
            1) Dólar => Peso argentino
            2) Peso argentino => Dólar
            3) Dólar => Real brasileño
            4) Real brasileño => Dólar
            5) Dólar => Peso colombiano
            6) Peso colombiano => Dólar
            7) Salir
            Elija una opción válida:
            *******************************************
            """;

    public PrintlnApp() {
    }

    public void getMensaje() {
        System.out.println(mensaje);
    }
}
