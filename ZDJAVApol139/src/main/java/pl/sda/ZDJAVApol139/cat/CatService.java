package pl.sda.ZDJAVApol139.cat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CatService {

    private final CatRepository catRepository;

    public List<Cat> findAllCats() {

        return catRepository.findAllCats();
    }

    public void addCat(Cat cat) {
        catRepository.addCat(cat);
    }
}
