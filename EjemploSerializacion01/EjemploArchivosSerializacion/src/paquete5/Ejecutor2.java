/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        String nombreArchivo = "Hospitales.data";
        String id_buscar = "1254785";
        Hospital Hospital_buscar;
        LecturaArchivoSecuencial leer = new LecturaArchivoSecuencial(nombreArchivo);
        leer.establecerID(id_buscar);
        leer.establecerHospitales();
        Hospital_buscar = leer.obtenerHospitalID();
        if (Hospital_buscar
                != null) {
            System.out.println(Hospital_buscar);
        } else {
            System.out.println("Profesor no encontrado");
        }
    }
}
