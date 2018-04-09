package voting.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
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

    public Dish() {
    }

    public Dish(@NotBlank String dishName, @NotNull double price) {
        this(null, dishName, price);
    }

    public Dish(Integer id,  String dishName, double price) {
        super(id);
        this.dishName = dishName;
        this.price = price;
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

    @Override
    public String toString() {
        return "Dish{" +
                "dishName='" + dishName + '\'' +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
