package logica;

import java.time.LocalDate;
import java.util.Random;

public class Transaccion {
    private int numeroOperacion;
    private LocalDate fecha_Transaccion;
    private Tipo_Transaccion tipo_transaccion;
    private Double monto;
    private Boolean comision;

    public void deposito(Double pMonto){}

    public void retiro(Double pMonto){}

    public void compraComercio(Double pMonto){}

    public int getNumeroOperacion() {
        return numeroOperacion;
    }

    public void setNumeroOperacion(int numeroOperacion) {
        this.numeroOperacion = numeroOperacion;
    }

    public LocalDate getFecha_Transaccion() {
        return fecha_Transaccion;
    }

    public void setFecha_Transaccion(LocalDate fecha_Transaccion) {
        this.fecha_Transaccion = fecha_Transaccion;
    }

    public Tipo_Transaccion getTipo_transaccion() {
        return tipo_transaccion;
    }

    public void setTipo_transaccion(Tipo_Transaccion tipo_transaccion) {
        this.tipo_transaccion = tipo_transaccion;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Boolean getComision() {
        return comision;
    }

    public void setComision(Boolean comision) {
        this.comision = comision;
    }

    public void generarTransacciones(){
        Transaccion transaccion;
        Random generadorAleatorios = new Random();
        int numeroDeTransacciones = 1+generadorAleatorios.nextInt(10);
        System.out.println(numeroDeTransacciones);

        for(int i=1; i<= numeroDeTransacciones; i++){
            int tipoTransaccion = generadorAleatorios.nextInt(6);
            switch (tipoTransaccion){
                case 0:
                    System.out.println("Retiro");
                    break;
                case 1:
                    System.out.println("Deposito");
                    break;
                case 2:
                    System.out.println("Pago Intereses");
                    break;
                case 3:
                    System.out.println("Cobro Comision");
                    break;
                case 4:
                    System.out.println("Compra en comercio");
                    break;
                case 5:
                    System.out.println("Retiro en cajero automatico");
                    break;

            }

        }
    }
}
