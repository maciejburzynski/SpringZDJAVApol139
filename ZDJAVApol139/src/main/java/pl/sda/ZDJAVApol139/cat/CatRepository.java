package pl.sda.ZDJAVApol139.cat;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CatRepository {

    private final ICatRepository iCatRepository;

    public List<Cat> findAllCats() {
        return iCatRepository.findAll();
    }

    public void addCat(Cat cat) {
        iCatRepository.save(cat);
    }
}
