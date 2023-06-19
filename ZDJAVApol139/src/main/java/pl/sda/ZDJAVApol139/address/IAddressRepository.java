package pl.sda.ZDJAVApol139.address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IAddressRepository extends PagingAndSortingRepository<Address, Long> {
}
