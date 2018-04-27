package com.db;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class DatabaseOperations {
    private static final String PERSISTENCE_UNIT_NAME = "JSFJPACrud";
    private static EntityManager entityMgrObj = Persistence.
            createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
    private static EntityTransaction transactionObj = entityMgrObj.getTransaction();

    @SuppressWarnings("unchecked")
    public static List getAllSchoolDetails() {
        Query queryObj = entityMgrObj.createQuery("SELECT u FROM UserEntityManager u");
        List schoolList = queryObj.getResultList();
        if (schoolList != null && schoolList.size() > 0) {
            return schoolList;
        } else {
            return null;
        }
    }

}
