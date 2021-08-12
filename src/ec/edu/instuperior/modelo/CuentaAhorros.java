/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.instuperior.modelo;

/**
 *
 * @author LIS
 */
public class CuentaAhorros extends Cuenta {
 private double inversion;

   Socio sc= new Socio();
   
    public CuentaAhorros() {
     
    }
    

    public CuentaAhorros(double inversion, String Cedula, String nombres, String salod, String numcuenta) {
        super(Cedula, nombres, salod, numcuenta);
        this.inversion = inversion;
    }

    public double getInversion() {
        return inversion;
    }

    public void setInversion(double inversion) {
        this.inversion = inversion;
    }

    public Socio getSc() {
        return sc;
    }

    public void setSc(Socio sc) {
        this.sc = sc;
    }
 
}
