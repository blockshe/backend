package com.blockshe.nomeplataforma.repository;

import com.blockshe.nomeplataforma.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
