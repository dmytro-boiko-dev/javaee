package com.dao;

import com.models.ClusterEntity;
import org.springframework.stereotype.Repository;

import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("clusterEntity")
@RequestScoped
public class ClusterDAO {
    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager entityManager;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<ClusterEntity> getAllUsers() {
        return entityManager.createQuery("select ce from ClusterEntity ce").getResultList();
    }
}
