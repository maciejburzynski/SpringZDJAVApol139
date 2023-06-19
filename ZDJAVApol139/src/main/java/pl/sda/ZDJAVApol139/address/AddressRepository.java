package pl.sda.ZDJAVApol139.address;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static java.util.stream.Collectors.*;

@Repository
@RequiredArgsConstructor
public class AddressRepository {

    private final IAddressRepository iAddressRepository;

    public Set<Address> findAllAddresses() {
        return StreamSupport.stream(
                        iAddressRepository.findAll().spliterator(), false)
                .collect(toSet());
    }

    public void addAddress(Address address) {
        iAddressRepository.save(address);
    }
}
