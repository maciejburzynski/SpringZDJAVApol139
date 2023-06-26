package pl.sda.ZDJAVApol139.shelter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ShelterRepository {

    private final IShelterRepository iShelterRepository;

    public void addShelter(Shelter shelter) {
        iShelterRepository.save(shelter);
    }

    public List<Shelter> getAllShelters() {
        return iShelterRepository.findAll();
    }
}
