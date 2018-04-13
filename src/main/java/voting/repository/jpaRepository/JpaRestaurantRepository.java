package voting.repository.jpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import voting.model.RestaurantMenu;

import java.util.List;
import java.util.Optional;

@Transactional
public interface JpaRestaurantRepository extends JpaRepository<RestaurantMenu, Integer>{

    @Override
    @Transactional
    RestaurantMenu save(RestaurantMenu restaurantMenu);

    @Transactional
    @Modifying
    @Query("DELETE FROM RestaurantMenu r WHERE r.id=:id")
    int delete(@Param("id") int id);

    @Transactional
    @Modifying
    @Query("UPDATE RestaurantMenu r SET r.vote=:vote WHERE r.id=:id")
    void setVoteCount(@Param("id") int id, @Param("vote") int vote);

    @Override
    Optional<RestaurantMenu> findById(Integer integer);

    @Override
    List<RestaurantMenu> findAll();
}
