package voting.service;

import voting.model.Dish;

import java.util.List;

public interface DishService{

    void deleteAllByRestaurantMenu(int restaurantMenuId);

    boolean delete(int id, int restaurantMenuId);

    Dish get(int id);

    Dish create(Dish dish);

    Dish update(Dish dish);

    List<Dish> getAllByRestaurantMenu(int restaurantMenuId);

}
