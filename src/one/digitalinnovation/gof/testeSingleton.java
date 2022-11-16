package one.digitalinnovation.gof;

import java.sql.SQLOutput;

public class testeSingleton {
    public static class Main {
        public static void main(String[] args) {
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
        }
    }
}
