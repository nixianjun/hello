package good.boot.hello.dao.jdbctemplate;

/**
 * Created by jason on 17/5/3.
 */
public interface UserDao {
    /**
     * 新增一个用户
     * @param username
     * @param userjobno
     */
    void create(String username, String userjobno);

    /**
     * 根据name删除一个用户高
     * @param name
     */
    void deleteByName(String name);

    /**
     * 获取用户总量
     */
    Integer getAllUsers();

    /**
     * 删除所有用户
     */
    void deleteAllUsers();
}
