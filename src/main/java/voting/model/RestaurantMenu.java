package voting.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "restaurantmenu")
public class RestaurantMenu  extends AbstractBaseEntity{

    @Column(name = "restaurantname", nullable = false)
    @NotBlank
    @Size(min = 2, max = 100)
    private String restaurantName;

    @Column(name = "vote", nullable = false)
    @NotNull
    private int vote;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "restaurant_id", referencedColumnName = "id")
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
