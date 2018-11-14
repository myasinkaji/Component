package ir.component.web.controller;

import ir.component.core.dao.model.User;
import ir.component.core.engine.UserDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import javax.annotation.Resource;
import java.io.Serializable;

/**
 * @author Mohammad Yasin Kaji
 */

@Controller("userRegisterController")
@Scope("view")
public class UserRegisterController implements Serializable {

    private User user = new User();
    @Resource
    private UserDao userDao;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void save() {
        userDao.persist(user);
    }

}
