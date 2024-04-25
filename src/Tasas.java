import com.google.gson.annotations.SerializedName;

public class Tasas {

    @SerializedName("USD")
    private Float USD;

    @SerializedName("ARS")
    private Float ARS;

    @SerializedName("COP")
    private Float  COP;

    @SerializedName("BRL")
    private Float BRL;

    public Tasas(Float USD, Float ARS, Float COP, Float BRL) {
        this.USD = USD;
        this.ARS = ARS;
        this.COP = COP;
        this.BRL = BRL;
    }

    public Float getUSD() {
        return USD;
    }

    public void setUSD(Float USD) {
        this.USD = USD;
    }

    public Float getARS() {
        return ARS;
    }

    public void setARS(Float ARS) {
        this.ARS = ARS;
    }

    public Float getCOP() {
        return COP;
    }

    public void setCOP(Float COP) {
        this.COP = COP;
    }

    public Float getBRL() {
        return BRL;
    }

    public void setBRL(Float BRL) {
        this.BRL = BRL;
    }

    @Override
    public String toString() {
        return "Tasas{" +
                "USD=" + USD +
                ", ARS=" + ARS +
                ", COP=" + COP +
                ", BRL=" + BRL +
                '}';
    }
}
