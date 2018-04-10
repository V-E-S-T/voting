package voting.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import voting.model.Dish;
import voting.repository.jpaRepository.JpaDishRepository;

@Repository
public class DishRepositoryImpl implements DishRepository{

    @Autowired
    private JpaDishRepository jpaDishRepository;

    @Override
    public Dish save(Dish dish){
        return jpaDishRepository.save(dish);
    }

    @Override
    public boolean delete(int id, int restaurant_id ){
        return jpaDishRepository.delete(id, restaurant_id) != 0;
    }
}
