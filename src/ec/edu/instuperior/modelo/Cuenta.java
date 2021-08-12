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
public class Cuenta {
       private String Cedula;
    private String nombres;
    private String salod;
    private String numcuenta;

    public Cuenta() {
    }

    public Cuenta(String Cedula, String nombres, String salod, String numcuenta) {
        this.Cedula = Cedula;
        this.nombres = nombres;
        this.salod = salod;
        this.numcuenta = numcuenta;
    }


}
