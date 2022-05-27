/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

/**
 *
 * @author reroes
 */
public class Hospital {

    String nombre;
    int numeroCamas;
    double presupuesto;

    public Hospital(String n, int t, double p) {
        nombre = n;
        numeroCamas = t;
        presupuesto = p;
    }

    public void establecerNombre(String n) {
        nombre = n;
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

    public int obtenerNumeroCamas() {
        return numeroCamas;
    }

    public double obtenerPresupuesto() {
        return presupuesto;
    }
}


/* 
    Agregar valor de objetos de tipo Hospital a un archivo
    Y leer el archivo
 */
