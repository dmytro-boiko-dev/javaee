package com.dao;

import com.models.TaggingTaskEntity;
//import org.apache.log4j.Logger;
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

    //logging
    //private static final Logger log = Logger.getLogger(TaggingTaskDAO.class);

    @org.springframework.transaction.annotation.Transactional(readOnly = true)
    public List<TaggingTaskEntity> getAllUsers() {
        //log.info("Info message from logger");
        //log.error("Error message from logger");
        return entityManager.createQuery("select tte from TaggingTaskEntity tte").getResultList();

    }
}
