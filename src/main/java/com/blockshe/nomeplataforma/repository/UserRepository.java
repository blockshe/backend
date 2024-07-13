package com.blockshe.nomeplataforma.repository;

import com.blockshe.nomeplataforma.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
