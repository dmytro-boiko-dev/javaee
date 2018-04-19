package com.dao;

import com.models.TaggingTaskEntity;
import com.models.UsersEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("userDAO")
public class UserDAO {
    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager entityManager;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    //public List<UsersEntity> getAllUsers() {
    public List<TaggingTaskEntity> getAllUsers() {
        //return entityManager.createQuery("select u from UsersEntity u").getResultList();
        //return entityManager.createQuery("select id from TaggingTaskEntity").getResultList();
        return entityManager.createQuery("select tte from TaggingTaskEntity tte").getResultList();
    }
}