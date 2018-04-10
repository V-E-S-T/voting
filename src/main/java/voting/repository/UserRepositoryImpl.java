package voting.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import voting.model.User;
import voting.repository.jpaRepository.JpaUserRepository;

import java.util.List;

public class UserRepositoryImpl implements UserRepository{

    private static final Sort SORT_NAME_EMAIL = new Sort(Sort.Direction.ASC, "name", "email");

    @Autowired
    private JpaUserRepository jpaUserRepository;

    @Override
    public User save(User user) {
        return jpaUserRepository.save(user);
    }

    @Override
    public boolean delete(int id) {
        return jpaUserRepository.delete(id) != 0;
    }

    @Override
    public User get(int id) {
        return jpaUserRepository.findById(id).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return jpaUserRepository.findAll(SORT_NAME_EMAIL);
    }
}
