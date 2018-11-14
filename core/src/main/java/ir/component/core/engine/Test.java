package ir.component.core.engine;

import ir.component.core.dao.model.UserProfile;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Mohammad Yasin Kaji
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/dao-context.xml");

        UserProfile user = new UserProfile();
        user.setId(12);
        user.setFirstName("Kaji");

        UserProfileDao userProfileDao = (UserProfileDao) applicationContext.getBean("userProfileDao");
        userProfileDao.persist(user);
    }
}
