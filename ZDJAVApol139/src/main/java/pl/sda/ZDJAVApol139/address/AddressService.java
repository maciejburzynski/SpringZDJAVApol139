package pl.sda.ZDJAVApol139.address;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@RequiredArgsConstructor
public class AddressService {

    private final AddressRepository addressRepository;

    public Set<Address> findAllAddresses() {
        return addressRepository.findAllAddresses();
    }

    public void addAddress(Address address) {
        addressRepository.addAddress(address);
    }
}
