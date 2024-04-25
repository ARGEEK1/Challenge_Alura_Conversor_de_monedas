import com.google.gson.annotations.SerializedName;

public class Respuesta {

    @SerializedName("result")
    private String resultado;

    @SerializedName("base_code")
    private String moneda;

    @SerializedName("conversion_rates")
    private Tasas tasas;

    public Respuesta(String resultado, String moneda, Tasas tasas) {
        this.resultado = resultado;
        this.moneda = moneda;
        this.tasas = tasas;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Tasas getTasas() {
        return tasas;
    }

    public void setTasas(Tasas tasas) {
        this.tasas = tasas;
    }

    @Override
    public String toString() {
        return "Respuesta{" +
                "resultado='" + resultado + '\'' +
                ", moneda='" + moneda + '\'' +
                ", tasas=" + tasas +
                '}';
    }
}
