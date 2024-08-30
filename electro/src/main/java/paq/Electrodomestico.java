/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paq;

/**
 *
 * @author luisa
 */
public abstract class Electrodomestico {

    protected float precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;

    // Default values 
    public static final float DEFAULT_PRECIO = 100;
    public static final String DEFAULT_COLOR = "blanco";
    public static final char DEFAULT_CONSUMO_ENERGETICO = 'F';
    public static final float DEFAULT_PESO = 5;

    // Available Energy Consumption
    protected char[] availableConsumptionEnergy = {'A', 'B', 'C', 'D', 'E', 'F'};

    //Available Colors
    protected String[] availableColor = {"blanco", "negro", "rojo", "azul", "gris"};

//Constructores
    public Electrodomestico() {
        this.precioBase = Electrodomestico.DEFAULT_PRECIO;
        this.color = Electrodomestico.DEFAULT_COLOR;
        this.consumoEnergetico = Electrodomestico.DEFAULT_CONSUMO_ENERGETICO;
        this.peso = Electrodomestico.DEFAULT_PESO;
    }

    public Electrodomestico(float precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = Electrodomestico.DEFAULT_COLOR;
        this.consumoEnergetico = Electrodomestico.DEFAULT_CONSUMO_ENERGETICO;
    }

    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }
    //Getters

    public float getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public float getPeso() {
        return peso;
    }

    public char[] getAvailableConsumptionEnergy() {
        return availableConsumptionEnergy;
    }

    public String[] getAvailableColor() {
        return availableColor;
    }

    //Metodos
    private char comprobarConsumoEnergetico(char letra) {
        char resultado = letra;
        byte index = -1;

        for (byte i = 0; i < this.availableConsumptionEnergy.length; i++) {
            if (letra == this.availableConsumptionEnergy[i]) {
                index = i;
                break;
            }
        }

        if (index < 0) {
            resultado = Electrodomestico.DEFAULT_CONSUMO_ENERGETICO;
        }
        return resultado;
    }

    private String comprobarColores(String color) {
        String resultado = color.toLowerCase();
        byte index = -1;
        for (byte i = 0; i < this.availableColor.length; i++) {
            if (color.equalsIgnoreCase(this.availableColor[i])) {
                index = i;
                break;
            }
        }
        if (index < 0) {
            resultado = Electrodomestico.DEFAULT_COLOR;
        }
        return resultado;
    }
}
