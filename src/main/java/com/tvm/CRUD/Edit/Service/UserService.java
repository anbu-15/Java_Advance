package com.tvm.CRUD.Edit.Service;

import com.tvm.CRUD.Edit.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(Long id);
    List<User> getAllUser();
    User saveUser(User user);
    boolean updateUser(Long id, User user);
    boolean deleteUserById(Long id);
}