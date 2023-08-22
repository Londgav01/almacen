package co.uniquindio.almacen.model;

import java.util.ArrayList;
import java.util.List;

public class DetalleTransaccion {
    private int cantidad;
    private double subTotal;
    private List<Producto> listaProductos= new ArrayList<>();

    public DetalleTransaccion() {
    }

    public DetalleTransaccion(int cantidad, double subTotal, List<Producto> listaProductos) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.listaProductos = listaProductos;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

}
