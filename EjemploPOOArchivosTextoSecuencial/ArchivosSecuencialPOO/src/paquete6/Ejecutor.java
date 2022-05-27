/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "Hospitales.txt";

        // Empresa c1 = new Empresa("Textiles del Ecuador", "Quito");
        Hospital h1 = new Hospital("New Abnterdan", 232, 23414552.12);
        Hospital h2 = new Hospital("Grey Sloan Memorial", 584, 4798512.12);
        Hospital h3 = new Hospital("IESS", 50, 2145.82);
        Hospital h4 = new Hospital("Isidro Ayora", 82, 14596.82);

        ArchivoEscritura escritura = new ArchivoEscritura(nombreArchivo);
        escritura.establecerHospital(h1);
        escritura.establecerSalida();
        escritura.establecerHospital(h2);
        escritura.establecerSalida();
        escritura.establecerHospital(h3);
        escritura.establecerSalida();
        escritura.establecerHospital(h4);
        escritura.establecerSalida();

        ArchivoLectura lectura = new ArchivoLectura(nombreArchivo);
        lectura.establecerLista();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
