package voting.repository.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import voting.model.Dish;

@Transactional(readOnly = true)
public interface JpaDishRepository extends JpaRepository<Dish, Integer>{

    @Override
    @Transactional
    Dish save(Dish dish);

    @Modifying
    @Transactional
    @Query("DELETE FROM Dish d WHERE d.id=:id AND d.restaurant_id=:restaurant_id")
    int delete(@Param("id") int id, @Param("restaurant_id") int restaurant_id);

}
