package pl.sda.ZDJAVApol139.shelter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ShelterService {

    private final ShelterRepository shelterRepository;

    public void addShelter(Shelter shelter) {
        shelterRepository.addShelter(shelter);
    }

    public List<Shelter> getAllShelters() {
        return shelterRepository.getAllShelters();
    }
}
