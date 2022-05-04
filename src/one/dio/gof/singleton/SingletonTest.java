package one.dio.gof.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        System.out.println(singletonLazy);
        System.out.println(singletonLazy = SingletonLazy.getInstance());

        System.out.println("=============================");

        SingletonEager singletonEager = SingletonEager.getInstance();
        System.out.println(singletonEager);
        System.out.println(singletonEager = SingletonEager.getInstance());

        System.out.println("=============================");

        SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(singletonLazyHolder);
        System.out.println(singletonLazyHolder = SingletonLazyHolder.getInstance());
    }
}
