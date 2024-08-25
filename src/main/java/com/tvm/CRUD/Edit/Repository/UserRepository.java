package com.tvm.CRUD.Edit.Repository;

import com.tvm.CRUD.Edit.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
