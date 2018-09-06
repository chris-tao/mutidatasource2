package org.white.mutidatasource2.config;

/**
 * <p></p >
 *
 * @author baixiong
 * @version $Id: DynamicDataSourceContextHolder.java, v 0.1 2018年09月06日 14:54:00 baixiong Exp$
 */
public class DynamicDataSourceContextHolder {

    private static ThreadLocal<String> DBNAME = new ThreadLocal<>();

    public static String get() {
        return DBNAME.get();
    }

    public static void set(String dbName) {
        DBNAME.set(dbName);
    }

    public static void clear() {
        DBNAME.remove();
    }
}
