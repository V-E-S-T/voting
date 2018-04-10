package voting.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "dishes")
public class Dish extends AbstractBaseEntity{

    @Column(name = "dish", nullable = false)
    @NotBlank
    @Size(min = 2, max = 50)
    private String dishName;

    @Column(name = "price", nullable = false)
    @NotNull
    private double price;

    @Column(name = "restaurant_id", nullable = false)
    @NotNull
    private Integer restaurant_id;

    public Dish() {
    }

    public Dish(@NotBlank String dishName, @NotNull double price, Integer restaurant_id) {
        this(null, dishName, price, restaurant_id);
    }

    public Dish(Integer id,  String dishName, double price, Integer restaurant_id) {
        super(id);
        this.dishName = dishName;
        this.price = price;
        this.restaurant_id = restaurant_id;
    }

    public String getDishName() {
        return dishName;
    }

    public double getPrice() {
        return price;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getRestaurant_id() {
        return restaurant_id;
    }

    public void setRestaurant_id(Integer restaurant_id) {
        this.restaurant_id = restaurant_id;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
