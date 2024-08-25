package com.tvm.CRUD.Edit.Service;

import com.tvm.CRUD.Edit.Model.User;
import java.util.Optional;

public interface UserService {

    Optional<User> getUserById(Long id);
    void deleteUserById(Long id);

}