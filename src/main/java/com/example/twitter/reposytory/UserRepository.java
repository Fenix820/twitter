package com.example.twitter.reposytory;

import com.example.twitter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>

{
}
