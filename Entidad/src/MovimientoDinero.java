public class MovimientoDinero {
    private String monto;
    private String monto_positivo;
    private String monto_negativo;
    private String concepto;
    private String usuario;

    public MovimientoDinero() {
        this.monto = "4000";
        this.monto_positivo = "2000";
        this.monto_negativo = "-2000";
        this.concepto = "compra pc";
        this.usuario = "pepito";
    }

    public MovimientoDinero(String monto, String monto_positivo, String monto_negativo, String concepto, String usuario) {
        this.monto = monto;
        this.monto_positivo = monto_positivo;
        this.monto_negativo = monto_negativo;
        this.concepto = concepto;
        this.usuario = usuario;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getMonto_positivo() {
        return monto_positivo;
    }

    public void setMonto_positivo(String monto_positivo) {
        this.monto_positivo = monto_positivo;
    }

    public String getMonto_negativo() {
        return monto_negativo;
    }

    public void setMonto_negativo(String monto_negativo) {
        this.monto_negativo = monto_negativo;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "monto='" + monto + '\'' +
                ", monto_positivo='" + monto_positivo + '\'' +
                ", monto_negativo='" + monto_negativo + '\'' +
                ", concepto='" + concepto + '\'' +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
