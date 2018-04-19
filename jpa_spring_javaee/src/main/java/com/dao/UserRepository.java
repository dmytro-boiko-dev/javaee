package com.dao;

import com.models.UsersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UsersEntity, Long> {
    List<UsersEntity> findByName(@org.springframework.data.repository.query.Param("name") String name);

    List<UsersEntity> findAllUsersAlias();

}
