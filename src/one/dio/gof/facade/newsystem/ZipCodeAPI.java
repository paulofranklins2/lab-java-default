package one.dio.gof.facade.newsystem;

import one.dio.gof.singleton.SingletonEager;

public class ZipCodeAPI {
    private static ZipCodeAPI instance = new ZipCodeAPI();

    private ZipCodeAPI() {
    }

    public static ZipCodeAPI getInstance() {
        return instance;
    }

    public String getCity(String zipcode) {
        return "Youngstown";
    }

    public String getState(String zipcode) {
        return "Ohio";
    }
}
