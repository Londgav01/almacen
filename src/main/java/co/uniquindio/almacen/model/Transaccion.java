package co.uniquindio.almacen.model;

public class Transaccion {

    private String fecha;
    private String code;
    private Double total;
    private static final Double IVA= 0.16;

    private DetalleTransaccion detalleTransaccion;

    public Transaccion() {
    }

    public Transaccion(String fecha, String code, Double total, DetalleTransaccion detalleTransaccion) {
        this.fecha = fecha;
        this.code = code;
        this.total = total;
        this.detalleTransaccion = detalleTransaccion;
    }

    public DetalleTransaccion getDetalleTransaccion() {
        return detalleTransaccion;
    }

    public void setDetalleTransaccion(DetalleTransaccion detalleTransaccion) {
        this.detalleTransaccion = detalleTransaccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}
