package pl.sda.ZDJAVApol139.dog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class DogRepository {

    private final IDogRepository iDogRepository;

    public List findAllDogs() {
        return iDogRepository.findAll();
    }

    public void addDog(Dog dog) {
        iDogRepository.save(dog);
    }
}
