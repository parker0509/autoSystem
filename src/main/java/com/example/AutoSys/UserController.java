package com.example.AutoSys;

import com.example.AutoSys.domain.User;
import com.example.AutoSys.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping
    public String insert(@RequestBody User user) {
        userService.insert(user);
        return "User inserted successfully";
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody User user) {
        user.setId(id);
        userService.update(user);
        return "User updated successfully";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        userService.delete(id);
        return "User deleted successfully";
    }
}
