package voting.service;

import org.springframework.beans.factory.annotation.Autowired;
import voting.model.Dish;
import voting.repository.DishRepository;

import java.util.List;

public class   DishServiceImpl implements DishService{

    private final DishRepository dishRepository;

    @Autowired
    public DishServiceImpl(DishRepository dishRepository) {
        this.dishRepository = dishRepository;
    }

    @Override
    public Dish get(int id) {
        return dishRepository.get(id);
    }

    @Override
    public Dish create(Dish dish) {
        return dishRepository.save(dish);
    }

    @Override
    public Dish update(Dish dish) {
        return dishRepository.save(dish);
    }

    @Override
    public void deleteAllByRestaurantMenu(int restaurantMenuId) {

        dishRepository.deleteAllByRestaurantMenu(restaurantMenuId);
    }

    @Override
    public boolean delete(int id, int restaurantMenuId) {
        return dishRepository.delete(id, restaurantMenuId);
    }

    @Override
    public List<Dish> getAllByRestaurantMenu(int restaurantMenuId) {
        return dishRepository.getAllByRestaurantMenu(restaurantMenuId);
    }

}
