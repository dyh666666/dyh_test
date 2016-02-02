package com.dyh.jdbcTemplate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class JdbcTemplate {

    public static final String url = "jdbc:mysql://127.0.0.1/pay";
    public static final String name = "com.mysql.jdbc.Driver";
    public static final String user = "dev";
    public static final String password = "dev123";

    // template method
    public final Object execute(String sql) throws Exception {

        Statement stmt = null;
        Connection conn = null;
        try {

            Class.forName(name);// 指定连接类型
            conn = DriverManager.getConnection(url, user, password);// 获取连接
            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery(sql);
            Object result = doInStatement(rs);// abstract method
            return result;
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex;
        } finally {

            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (!conn.isClosed()) {
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    // implements in subclass
    protected abstract Object doInStatement(ResultSet rs);

    protected abstract Object test(String str);
}
