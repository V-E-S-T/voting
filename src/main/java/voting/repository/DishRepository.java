package voting.repository;

import voting.model.Dish;

public interface DishRepository {

    Dish save(Dish dish);

    boolean delete(int id, int restaurant_id);

}
