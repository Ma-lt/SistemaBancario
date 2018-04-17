package logica;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    int id;
    private String nombre;
    private String apellidos;

    public Cliente(){};

    public Cliente(int pId, String pNombre, String pApellidos){
        this.id = pId;
        this.nombre = pNombre;
        this.apellidos = pApellidos;
    }

    public Cuenta crearCuenta(int idCliente, String tipo, String moneda, Double saldoInicial){
        Cuenta nuevaCuenta;

        if(tipo == "Corriente"){
            nuevaCuenta = new CuentaCorriente(idCliente,0,LocalDate.now(), moneda, saldoInicial);
        }else{nuevaCuenta = new CuentaAhorro(idCliente, 1,LocalDate.now(), moneda, saldoInicial);
        }
        return nuevaCuenta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}
