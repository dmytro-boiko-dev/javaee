package com.dao;

import com.models.LofStatusEntity;
import org.springframework.stereotype.Repository;

import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("lofStatusDAO")
@RequestScoped
public class LofStatusDAO {
    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager entityManager;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<LofStatusEntity> getAllUsers() {
        return entityManager.createQuery("select lse from LofStatusEntity lse").getResultList();
    }
}
