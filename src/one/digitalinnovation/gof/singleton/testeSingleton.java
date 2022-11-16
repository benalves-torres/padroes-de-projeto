package one.digitalinnovation.gof.singleton;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.strategy.*;

public class testeSingleton {
    public static class Main {
        public static void main(String[] args) {

            // Singleton
            Singleton singleton = Singleton.getInstancia();
            System.out.println(singleton);
            singleton = Singleton.getInstancia();
            System.out.println(singleton);

            SingletonEagler eager = SingletonEagler.getInstancia();
            System.out.println(eager);
            eager = SingletonEagler.getInstancia();
            System.out.println(eager);

            SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
            System.out.println(holder);
            holder = SingletonLazyHolder.getInstancia();
            System.out.println(holder);

            // Strategy

            Comportamento normal = new ComportamentoNormal();
            Comportamento defensivo = new ComportamentoDefensivo();
            Comportamento agressivo = new ComportamentoAgressivo();

            Robo robo = new Robo();
            robo.setComportamento(normal);
            robo.mover();
            robo.mover();
            robo.setComportamento(agressivo);
            robo.mover();
            robo.mover();

            //Facade

            Facade facade = new Facade();
            facade.migrarCliente("Venilton", "1978820");
        }
    }
}
