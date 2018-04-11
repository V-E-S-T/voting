package voting.service;

import org.springframework.beans.factory.annotation.Autowired;
import voting.model.RestaurantMenu;
import voting.repository.RestaurantRepository;

import java.util.List;

public class RestaurantServiceImpl implements RestaurantService{


    private final RestaurantRepository restaurantRepository;

    @Autowired
    public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public RestaurantMenu createRestaurantMenu(RestaurantMenu restaurantMenu) {
        return restaurantRepository.save(restaurantMenu);
    }

    @Override
    public void deleteRestaurantMenu(int restaurantMenuId) {

        restaurantRepository.delete(restaurantMenuId);
    }

    @Override
    public List<RestaurantMenu> getAllRestaurantMenu() {
        return restaurantRepository.getAll();
    }

    @Override
    public RestaurantMenu update(RestaurantMenu restaurantMenu) {
        return restaurantRepository.save(restaurantMenu);
    }
}
