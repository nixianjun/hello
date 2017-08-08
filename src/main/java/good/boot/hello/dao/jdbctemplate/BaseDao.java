package good.boot.hello.dao.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by jason on 2017/5/4.
 */
@Repository
public class BaseDao {
    @Autowired
    protected JdbcTemplate jdbcTemplate;
}
