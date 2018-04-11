package voting.repository;

import voting.model.Dish;

import java.util.List;

public interface DishRepository {

    Dish save(Dish dish);

    boolean delete(int id, int restaurant_id);

    Dish get(int id);

    List<Dish> getAllByRestaurantMenu(int restaurantMenuId);

    void deleteAllByRestaurantMenu(int restaurantMenuId);

}
