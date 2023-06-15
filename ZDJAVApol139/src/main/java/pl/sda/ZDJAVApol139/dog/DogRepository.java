package pl.sda.ZDJAVApol139.dog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
@RequiredArgsConstructor
public class DogRepository {

    private final IDogRepository iDogRepository;

    public List<Dog> findAllDogs() {
        return iDogRepository.findAll();
    }

    public void addDog(Dog dog) {
        iDogRepository.save(dog);
    }

    public void addDogs(Set<Dog> dogs) {
        iDogRepository.saveAll(dogs);
    }

    public Optional<Dog> findDogById(Long id) {
        return iDogRepository.findById(id);
    }


}
