package good.boot.hello.annotations;

import java.lang.annotation.*;

/**
 * 检查token
 * Created by jason on 17/5/4.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CheckToken {

}