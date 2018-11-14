package ir.component.core.engine;

import ir.component.core.dao.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;

/**
 * @author Mohammad Yasin Kaji
 */

@Repository
@Transactional
public class UserDao extends AbstractDao {

    @Transactional
    public void persist(final User user) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                entityManager.persist(user);
            }
        });
    }
}
