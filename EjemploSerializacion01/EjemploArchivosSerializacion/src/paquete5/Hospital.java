/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable {

    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;

    public Hospital(String n, int t, double p, String id) {
        nombre = n;
        numeroCamas = t;
        presupuesto = p;
        idHospital = id;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerID(String n) {
        idHospital = n;
    }

    public void establecerNumeroCamas(int t) {
        numeroCamas = t;
    }

    public void establecerNumeroCamas(double p) {
        presupuesto = p;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerID() {
        return idHospital;
    }

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
    @Override
    public String toString(){
        String valor = String.format("Nombre: %s - Numero de Camas: %d - Presupuesto:%.2f -"
                + " Id:%s\n", obtenerNombre(), 
                obtenerNumeroCamas(),
                obtenerPresupuesto(),
                obtenerID());
        return valor;
    }
}
