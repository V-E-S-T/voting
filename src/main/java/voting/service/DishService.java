package voting.service;

import voting.model.Dish;
import voting.model.RestaurantMenu;

import java.util.List;

public interface DishService{

    Dish get(int id);

    Dish create(Dish dish);

    Dish update(Dish dish);

    boolean delete(int id);

    List<Dish> getAllByRestaurantMenu(RestaurantMenu restaurantMenu);

    void deleteAllByRestaurantMenu(RestaurantMenu restaurantMenu);

}
