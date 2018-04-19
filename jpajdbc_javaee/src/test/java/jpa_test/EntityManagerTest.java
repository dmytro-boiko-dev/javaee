package jpa_test;

import com.jpa.test.models.UsersEntity;
import com.jpa.utility_functional.EntityManagerUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class EntityManagerTest {
    public static void main(String[] args) {
        EntityManager entityManager = EntityManagerUtil.getEntityManager();
        List<UsersEntity> userEntity = entityManager
                .createQuery("select u from UsersEntity u", UsersEntity.class).getResultList();
        System.out.println(userEntity);
    }
}
