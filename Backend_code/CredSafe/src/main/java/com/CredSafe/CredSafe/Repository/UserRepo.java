package com.CredSafe.CredSafe.Repository;

import com.CredSafe.CredSafe.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepo extends JpaRepository<UserEntity,Long> {
    Optional<UserEntity> findByEmail(String email);
    Boolean existsByEmail(String email);
}
