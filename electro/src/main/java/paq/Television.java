package paq;

/**
 *
 * @author ronar
 */
public class Television extends Electrodomestico {

    private int resolucion;
    private boolean sintonizadorTDT;

    //atributos por defecto
    public static final int DEFAULT_RESOLUCION = 20;
    public static final boolean DEFAULT_SINTONIZADOR_TDT = false;

    //constructores
    public Television() {
        super();
    }

    public Television(float precio, float peso) {
        super(precio, peso);
        this.resolucion = Television.DEFAULT_RESOLUCION;
        this.sintonizadorTDT = Television.DEFAULT_SINTONIZADOR_TDT;
    }

    public Television(int resolucion, boolean sintonizadorTDT) {
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //getters
    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    //métodos
    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();

        if (this.resolucion > 40) {
            precioFinal = precioFinal * 1.30f;
        }

        if (this.sintonizadorTDT) {
            precioFinal += 50;
        }
        return precioFinal;
    }
}
