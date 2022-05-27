/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor {

    public static void main(String[] args) {
        String nombreArchivo = "Hospitales.data";

        // Empresa c1 = new Empresa("Textiles del Ecuador", "Quito");
        Hospital h1 = new Hospital("New Abnterdan", 232, 23414552.12,"1254785");
        Hospital h2 = new Hospital("Grey Sloan Memorial", 584, 4798512.12,"15415");
        Hospital h3 = new Hospital("IESS", 50, 2145.82,"156465");
        Hospital h4 = new Hospital("Isidro Ayora", 82, 14596.82,"5111556");
        Hospital[] hosp2 = {h1, h2, h3, h4};

        EscrituraArchivoSecuencial escritura = new EscrituraArchivoSecuencial(nombreArchivo);
        for (int i = 0; i < hosp2.length; i++) {
            escritura.establecerHospital(hosp2[i]);
            escritura.establecerSalida();
        }
        escritura.cerrarArchivo();
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerHospital();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
