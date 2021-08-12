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
public class Abogado extends Persona {
    private double salario;

    public Abogado() {
    }

    public Abogado(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
   
}
