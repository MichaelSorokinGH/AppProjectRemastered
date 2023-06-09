package com.example.AppProject.models.repositories;

import com.example.AppProject.models.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    Optional<User> findByPersonalAccount(String personalAccount);
    Optional<User> findByUserAddress(String userAddress);
    Optional<User> findByPhoneNumber(String phoneNumber);


}
