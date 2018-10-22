package com.dao;

import com.models.TaggingTaskEntity;
//import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ManagedBean
@Repository("taggingTaskDAO")
@RequestScoped
public class TaggingTaskDAO {
    @PersistenceContext(unitName = "NewPersistenceUnit")
    private EntityManager entityManager;

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<TaggingTaskEntity> getAllUsers() {
        List result = entityManager.createQuery("select tte from TaggingTaskEntity tte").getResultList();
        return result;

    }
}
