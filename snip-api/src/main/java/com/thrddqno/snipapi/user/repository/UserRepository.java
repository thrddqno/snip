package com.thrddqno.snipapi.user.repository;

import com.thrddqno.snipapi.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
