package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author falvojr
 */
public class Singleton {
    private static Singleton instancia;

    private Singleton(){
        super();
    }

    public static Singleton getInstancia(){
        if (instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }
}
