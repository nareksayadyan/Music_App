package am.aca.musicapp.repository.implementations;

import am.aca.musicapp.common.model.User;
import am.aca.musicapp.repository.interfaces.UserRepositoryInterface;

/**
 * Created by Narek on 11.09.2016.
 */
public class UserRepository implements UserRepositoryInterface {
    private static UserRepository userRepository = null;

    private UserRepository() {}

    public static UserRepository getInstance() {
        if (userRepository == null) {
            userRepository = new UserRepository();
        }
        return userRepository;
    }

    @Override
    public User create(User obj) {
        return null;
    }

    @Override
    public User read(User obj) {
        return null;
    }

    @Override
    public User update(User obj) {
        return null;
    }

    @Override
    public void delete(User obj) {

    }
}
