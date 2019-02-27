package querydsl;

import com.querydsl.jpa.impl.JPAQuery;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserEntityDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public List<UserEntity> findUserById(final int id){
        final JPAQuery<UserEntity> query = new JPAQuery<>(entityManager);
        final QUserEntity userEntity = QUserEntity.userEntity;

        return query.from(userEntity).where(userEntity.id.eq(1)).fetch();
    }

}
