package pl.sda.ZDJAVApol139.dog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class DogService {

    private final DogRepository dogRepository;

    public List findAllDogs() {
        return dogRepository.findAllDogs();
    }

    public void addDog(Dog dog) {
        dogRepository.addDog(dog);
    }

//    Set -> no duplicates, no order, fast -> HashSet
//    set.get(20) - impossible
//    List -> Order, possible duplicates, a bit slower -> ArrayList
//    list.get(20)
//    Map -> for some people it's not collection -> HashMap

    public void addDogs(Set<Dog> dogs) {
        dogRepository.addDogs(dogs);
    }

    public Dog findDogById(Long id) {
        return dogRepository
                .findDogById(id)
                .orElseThrow(() ->
                        new DogNotFoundException("Dog with this id: " + id + " doesn't exist"));
    }

}
