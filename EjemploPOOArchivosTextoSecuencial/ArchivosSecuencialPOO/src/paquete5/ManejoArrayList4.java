/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;

import paquete1.Empresa;

/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {

    public static void main(String[] args) {
        Empresa emp1 = new Empresa("MacDonals", "Loja");
        Empresa emp2 = new Empresa("Amazon", "Guayaquil");
        Empresa emp3 = new Empresa("Alphabet", "California");
        Empresa emp4 = new Empresa("Facebook", "Angeles");

        // ArrayList
        ArrayList<Empresa> empresas = new ArrayList<>();
        empresas.add(emp1);
        empresas.add(emp2);
        empresas.add(emp3);
        empresas.add(emp4);
        System.out.println("Empresas: ");

        for (int i = 0; i < empresas.size(); i++) {
            System.out.printf("%s - %s \n",
                    empresas.get(i).obtenerNombre(),
                    empresas.get(i).obtenerCiudad());
        }

    }
}
