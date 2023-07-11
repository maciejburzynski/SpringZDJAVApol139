package pl.sda.ZDJAVApol139.address;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Set;

import static java.util.Set.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AddressServiceTest {

    @Mock
    AddressRepository addressRepository;

    @InjectMocks
    AddressService addressService;

    @Test
    void shouldReturnSetOfAddressesWhenFindAllAddressesIsInvoked() {
//        given
        Address address = new Address(1L, "Pilsudzkiego", 10, "90-000", "Lodzkie", "Lodz");
        Address address1 = new Address(2L, "Mickiewicza", 65, "90-001", "Lodzkie", "Koluszki");
        Address address2 = new Address(3L, "Mickiewicza", 99, "90-101", "Mazowieckie", "Legionowo");
        Set<Address> expectedAddresses = of(address, address1, address2);

        Mockito.when(addressRepository.findAllAddresses()).thenReturn(expectedAddresses);

//       when

        Set<Address> actualAddresses = addressService.findAllAddresses();

//        then
        assertEquals(expectedAddresses, actualAddresses);

    }
}