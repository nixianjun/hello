package good.boot.hello.dao.jdbctemplate;

import org.springframework.stereotype.Repository;

/**
 * Created by jason on 17/5/3.
 */
@Repository
public class UserDaoImpl extends BaseDao implements UserDao {


    @Override
    public void create(String username, String userjobno) {
//        jdbcTemplate.update("insert into Userinfo(username, userjobno) values(?, ?)", username, userjobno);
    }

    @Override
    public void deleteByName(String username) {
//        jdbcTemplate.update("delete from Userinfo where username = ?", username);
    }

    @Override
    public Integer getAllUsers() {
//        return jdbcTemplate.queryForObject("select count(1) from Userinfo", Integer.class);
        return 1;
    }

    @Override
    public void deleteAllUsers() {
//        jdbcTemplate.update("delete from Userinfo");
    }
}
