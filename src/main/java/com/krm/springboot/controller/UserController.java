package com.krm.springboot.controller;

import com.krm.springboot.model.UserItem;
import com.krm.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Karan
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/")
    public String index() {
        return "Spring boot database manipulation API";
    }

    @RequestMapping("/add/{id}/{name}")
    public String addUser(@PathVariable("id") Long id, @PathVariable("name") String name) {

        UserItem userItem = new UserItem(id, name);
        userRepository.save(userItem);

        return "User added!";
    }
}
