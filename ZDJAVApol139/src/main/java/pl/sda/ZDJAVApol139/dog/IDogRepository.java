package pl.sda.ZDJAVApol139.dog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Optional;

public interface IDogRepository extends JpaRepository<Dog, Long> {

//Custom JPA paramiterized queries
//    Optional<Dog> updateDogById(Long id);


    @Modifying
    @Query(value = "UPDATE Dog SET name = :name, price = :price WHERE id = :id")
    @Transactional// All or nothing
    void updateDog(@Param("id") Long id,
                   @Param("name") String name,
                   @Param("price") BigDecimal price);

}
