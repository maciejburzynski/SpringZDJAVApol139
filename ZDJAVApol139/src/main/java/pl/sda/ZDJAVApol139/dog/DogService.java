package pl.sda.ZDJAVApol139.dog;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
