package cinemas.repositories.impl;

import cinemas.models.User;
import cinemas.repositories.UserRepository;
import org.springframework.stereotype.Repository;

public class UserRepositoryImpl extends BaseRepositoryImpl<User, Long> implements UserRepository {
    public UserRepositoryImpl() {
        super(User.class);
    }
}
