package one.dio.gof.singleton;

/**
 * Singleton "Eager"
 *
 * @author Paulo
 */
public class SingletonEager {

    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return instance;
    }
}
