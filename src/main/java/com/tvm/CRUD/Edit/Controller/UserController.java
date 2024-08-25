package com.tvm.CRUD.Edit.Controller;

import com.tvm.CRUD.Edit.Model.User;
import com.tvm.CRUD.Edit.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @GetMapping("/getall")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping("/save")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        Optional<User> user = userService.getUserById(id);
        if (user != null) {
            userService.deleteUserById(id);
            return "User is deleted!";
        } else {
            return "there is no user in the Id : " + id;
        }
    }
}
