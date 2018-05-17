package com.dao;

import com.models.TaggingTaskEntity;
import com.models.UsersEntity;
import org.springframework.stereotype.Repository;

import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("userDAO")
@RequestScoped
public class UserDAO {
    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager entityManager;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<TaggingTaskEntity> getAllUsers() {
//    public List<UsersEntity> getAllUsers() {
//        return entityManager.createQuery("select ue from UsersEntity ue").getResultList();
        return entityManager.createQuery("select tte from TaggingTaskEntity tte").getResultList();
    }
}