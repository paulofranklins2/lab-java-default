package one.dio.gof.facade;

import one.dio.gof.facade.newsystem.ZipCodeAPI;
import one.dio.gof.facade.oldsystem.CrmService;

public class Facade {
    public void migrateCliente(String name, String zipcode){
        String city = ZipCodeAPI.getInstance().getCity(zipcode);
        String state = ZipCodeAPI.getInstance().getState(zipcode);

        CrmService.saveClient(name, zipcode, city, state);
    }

}
