package org.beable.common.extension;

import java.lang.annotation.*;

/**
 * @author qing.wu
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface Extension {

    String bizId() default BizScenario.DEFAULT_BIZ_ID;

    String userCase() default "";

    String scenario() default "";
}
