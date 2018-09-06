package org.white.mutidatasource2.aop;

import java.lang.annotation.*;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: DynamicDataSource.java, v 0.1 2018年09月06日 15:21:00 baixiong Exp$
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DynamicDataSource {

    /**
     * dbname
     * @return
     */
    String value();
}
