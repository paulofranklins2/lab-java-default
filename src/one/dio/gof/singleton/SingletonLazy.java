package one.dio.gof.singleton;

/**
 * Singleton "Lazy"
 *
 * @author Paulo
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
