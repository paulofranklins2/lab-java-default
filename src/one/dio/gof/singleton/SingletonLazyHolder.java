package one.dio.gof.singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @author Paulo
 */
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instance = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instance;
    }
}
