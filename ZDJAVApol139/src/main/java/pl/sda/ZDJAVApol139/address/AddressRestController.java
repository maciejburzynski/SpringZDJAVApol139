package pl.sda.ZDJAVApol139.address;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AddressRestController {

    private final AddressService addressService;

    @GetMapping("/addresses")
    public ResponseEntity<Set<Address>> findAllAddresses() {
        return ResponseEntity
                .status(200)
                .body(addressService.findAllAddresses());
    }

    @PostMapping("/addresses")
    public ResponseEntity addAddress(@RequestBody Address address) {
        addressService.addAddress(address);
        return ResponseEntity.status(201).build();
    }

}
