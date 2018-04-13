package voting.service;

import voting.model.User;

import java.util.List;

public interface UserService {

    boolean delete(int userId);

    User update(User user);

    User create(User user);

    List<User> getAll();

    User get(int id);

    boolean vote(int id, int restaurantId);
}
