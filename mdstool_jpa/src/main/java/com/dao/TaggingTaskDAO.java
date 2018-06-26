package com.dao;

import com.models.TaggingTaskEntity;
import org.springframework.stereotype.Repository;

import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository("taggingTaskDAO")
@RequestScoped
public class TaggingTaskDAO {
    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager entityManager;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<TaggingTaskEntity> getAllUsers() {
        return entityManager.createQuery("select tte from TaggingTaskEntity tte where tte.id=1465").getResultList();
    }
}
