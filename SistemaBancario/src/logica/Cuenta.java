package logica;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Cuenta {
    private int id_Cliente;
    private int numero_Cuenta;
    private LocalDate fecha_Apertura;
    private String moneda;
    private Double saldo;
    private ArrayList<Transaccion> transacciones;

    public Cuenta(int id_Cliente, int numero_Cuenta, LocalDate fecha_Apertura, String moneda, Double saldo) {
        this.id_Cliente = id_Cliente;
        this.numero_Cuenta = numero_Cuenta;
        this.fecha_Apertura = fecha_Apertura;
        this.moneda = moneda;
        this.saldo = saldo;
    }

    public void depositar(int pNumero_Cuenta, int pCantidad){

    }

    public void retirar(int pNumero_Cuenta, int pCantidad){

    }

    public abstract void cobroComision();

    public void cobroAdministracion(){}

    public void estadoDeCuenta(){}

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public int getNumero_Cuenta() {
        return numero_Cuenta;
    }

    public void setNumero_Cuenta(int numero_Cuenta) {
        this.numero_Cuenta = numero_Cuenta;
    }

    public LocalDate getFecha_Apertura() {
        return fecha_Apertura;
    }

    public void setFecha_Apertura(LocalDate fecha_Apertura) {
        this.fecha_Apertura = fecha_Apertura;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public ArrayList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(ArrayList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }
}
