package ru.ionov.herokudockerdemo.controllers;

import org.springframework.web.bind.annotation.*;
import ru.ionov.herokudockerdemo.domain.User;
import ru.ionov.herokudockerdemo.repositories.UsersRepository;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {

    private final UsersRepository usersRepository;

    public UsersController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @GetMapping("/{id}")
    public User get(@PathVariable int id) {
        return usersRepository.getOne(id);
    }

    @GetMapping
    public List<User> getAll() {
        return usersRepository.findAll();
    }

    @PostMapping
    public User add(User user) {
        return usersRepository.save(user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        usersRepository.deleteById(id);
    }
}
