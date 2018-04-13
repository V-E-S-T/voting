package voting.repository;

import org.springframework.beans.factory.annotation.Autowired;
import voting.model.RestaurantMenu;
import voting.repository.jpaRepository.JpaRestaurantRepository;

import java.util.List;

public class RestaurantRepositoryImpl implements RestaurantRepository{

    @Autowired
    private JpaRestaurantRepository jpaRestaurantRepository;

    @Override
    public RestaurantMenu save(RestaurantMenu restaurantMenu) {
        return jpaRestaurantRepository.save(restaurantMenu);
    }

    @Override
    public boolean delete(int id) {
        return jpaRestaurantRepository.delete(id) != 0;
    }

    @Override
    public RestaurantMenu get(int id) {
        return jpaRestaurantRepository.findById(id).orElse(null);
    }

    @Override
    public List<RestaurantMenu> getAll() {
        return jpaRestaurantRepository.findAll();
    }

    @Override
    public void setVoteCount(int id, int vote) {
        jpaRestaurantRepository.setVoteCount(id, vote);
    }
}
