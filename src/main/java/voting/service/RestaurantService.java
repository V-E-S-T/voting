package voting.service;

import voting.model.RestaurantMenu;

import java.util.List;

public interface RestaurantService {

    RestaurantMenu createRestaurantMenu(RestaurantMenu restaurantMenu);

    void deleteRestaurantMenu(int restaurantMenuId);

    List<RestaurantMenu> getAllRestaurantMenu();

    RestaurantMenu update(RestaurantMenu restaurantMenu);

    RestaurantMenu get(int id);

    void incrementVoteCount(int id, int vote);

}
