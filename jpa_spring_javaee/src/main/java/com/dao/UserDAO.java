package com.dao;

import com.models.UsersEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("userDAO")
public class UserDAO {
    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager entityManager;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<UsersEntity> getAllUsers(){
        return entityManager.createQuery("select u from UsersEntity u").getResultList();
    }


//    new: update and save ne user

    @Transactional(readOnly = false)
    public List<UsersEntity> saveNewUserEntity(UsersEntity newUser){
        entityManager.persist(newUser);
        return getAllUsers();
    }

    @Transactional(readOnly = false)
    public List<UsersEntity> updateNewUserEntity(UsersEntity usersEntity){
        entityManager.merge(usersEntity);
        return getAllUsers();
    }


}
