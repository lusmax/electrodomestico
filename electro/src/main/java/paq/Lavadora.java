package paq;

/**
 *
 * @author luisa
 */
public class Lavadora extends Electrodomestico {

    private int carga;

    //default values 
    public static final int DEFAULT_CARGA = 5;

    //Contructores
    public Lavadora() {
        super();
        this.carga = Lavadora.DEFAULT_CARGA;
    }

    public Lavadora(float precio, float peso) {
        super(precio, peso);
        this.carga = Lavadora.DEFAULT_CARGA;
    }
    public Lavadora(int carga) {
        super();
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
    

}
