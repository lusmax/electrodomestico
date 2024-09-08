package com.mycompany.electro;

import paq.*;

/**
 *
 * @author luisa
 */
public class Electro {

    public static void main(String[] args) {
        Electrodomestico misElectrodomesticos[] = new Electrodomestico[6];

        // crear instancias de Lavadora
        Lavadora miLavadora1 = new Lavadora();
        Lavadora miLavadora2 = new Lavadora(120, 50);
        Lavadora miLavadora3 = new Lavadora(12);

        //Crear instancias de Television
        Television miTelevision1 = new Television();
        Television miTelevision2 = new Television(180, 20);
        Television miTelevision3 = new Television(65, true);

        //Añadir Instancias(objetos) al array misElectrodomesticos
        misElectrodomesticos[0] = miLavadora1;
        misElectrodomesticos[1] = miLavadora2;
        misElectrodomesticos[2] = miLavadora3;
        misElectrodomesticos[3] = miTelevision1;
        misElectrodomesticos[4] = miTelevision2;
        misElectrodomesticos[5] = miTelevision3;
        
        //Recorrer array misElectrodomesticos
        for(Electrodomestico electro : misElectrodomesticos){
            System.out.println(electro.precioFinal());
        }

    }
}
