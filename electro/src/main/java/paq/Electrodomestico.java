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

}
