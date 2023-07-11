package pl.sda.ZDJAVApol139.dog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype") OR @Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DependencyInjectionService {
//  per HTTP Request
//  per WebSocketowe
//  per App

//    DI by field
//    @Autowired // Default - singleton
//    DogService dogService;
//-----------------------------------------------------------

//    DogService dogService;
//    DI by constructor
//    @Autowired
//    public DependencyInjectionService(DogService dogService) {
//        this.dogService = dogService;
//    }
//-------------------------------------------------------------

//    DI by setter
//    DogService dogService;
//    @Autowired
//    public void setDogService(DogService dogService) {
//        this.dogService = dogService;
//    }
}
