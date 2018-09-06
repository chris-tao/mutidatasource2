package org.white.mutidatasource2.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.white.mutidatasource2.config.DynamicDataSourceContextAware;
import org.white.mutidatasource2.config.DynamicDataSourceContextHolder;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: DynamicDataSourceAOP.java, v 0.1 2018年09月06日 15:50:00 baixiong Exp$
 */
@Aspect
@Component
public class DynamicDataSourceAOP {

    @Before("@annotation(org.white.mutidatasource2.aop.DynamicDataSource)")
    public void changeDataSource(JoinPoint point) {
        Class<?> clazz = point.getTarget().getClass();
        MethodSignature signature = (MethodSignature) point.getSignature();
        try {
            Method method = clazz.getDeclaredMethod(signature.getName(), signature.getParameterTypes());
            if (method.isAnnotationPresent(DynamicDataSource.class)) {
                DynamicDataSource dynamicDataSource = method.getAnnotation(DynamicDataSource.class);
                String dbName = dynamicDataSource.value();
                if (DynamicDataSourceContextAware.names.contains(dbName)) {
                    DynamicDataSourceContextHolder.set(dbName);
                }
            }
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }

    @After("@annotation(org.white.mutidatasource2.aop.DynamicDataSource)")
    public void after() {
        DynamicDataSourceContextHolder.clear();
    }

}
