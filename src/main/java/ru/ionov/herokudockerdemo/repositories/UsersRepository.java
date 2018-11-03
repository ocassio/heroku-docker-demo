package ru.ionov.herokudockerdemo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ionov.herokudockerdemo.domain.User;

public interface UsersRepository extends JpaRepository<User, Integer> {
}
