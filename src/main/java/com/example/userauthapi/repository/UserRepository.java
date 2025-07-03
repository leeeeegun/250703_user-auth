package com.example.userauthapi.repository;

import com.example.userauthapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // User : 어떤 엔티티를 다룰건지
    // Long : User의 ID 타입 (보통 PK)

    // 커스텀 쿼리를 하단에 작성할 수 있음
    // 사용자 이메일로 조회
    Optional<User> findByEmail(String email);

    // 사용자 이름으로 조회
    Optional<User> findByUsername(String username);
}
