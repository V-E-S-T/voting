package voting.model;

import java.util.List;

public class RestaurantMenu {

    private Integer id;

    private String restaurantName;

    private List<Dish> menu;

    public RestaurantMenu() {
    }

    public RestaurantMenu(String restaurantName, List<Dish> menu) {
        this.restaurantName = restaurantName;
        this.menu = menu;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public List<Dish> getMenu() {
        return menu;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public void setMenu(List<Dish> menu) {
        this.menu = menu;
    }
}
