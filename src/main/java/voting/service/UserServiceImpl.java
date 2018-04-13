package voting.service;

import org.springframework.beans.factory.annotation.Autowired;
import voting.model.User;
import voting.repository.RestaurantRepository;
import voting.repository.UserRepository;

import java.time.LocalTime;
import java.util.List;

public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;
    private final RestaurantRepository restaurantRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, RestaurantRepository restaurantRepository) {
        this.userRepository = userRepository;
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public boolean delete(int userId) {
        return userRepository.delete(userId);
    }

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAll() {
        return userRepository.getAll();
    }

    @Override
    public User get(int id) {
        return userRepository.get(id);
    }

    @Override
    public boolean vote(int id, int restaurantId) {

        if (!LocalTime.now().isAfter(LocalTime.of(11, 00)))
        {

            //User user =
            if(!userRepository.get(id).isVoted())
            {
                //restaurantRepository.setVoteCount(id, );
            }
            userRepository.setrestaurantId(id, restaurantId);
            return true;
        }
        return false;
    }
}
