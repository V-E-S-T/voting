package voting.repository;

import voting.model.RestaurantMenu;

import java.util.List;

public interface RestaurantRepository {

    RestaurantMenu save(RestaurantMenu restaurantMenu);

    boolean delete(int id);

    RestaurantMenu get(int id);

    List<RestaurantMenu> getAll();

    void setVoteCount(int id, int vote);
}
