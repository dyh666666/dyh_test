package com.dyh.jdbcTemplate;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class CopyOfJdbcTemplate {

    // template method
    public final Object execute(StatementCallback action, String sql) throws SQLException {

        Connection con = null;// HsqldbUtil.getConnection();
        Statement stmt = null;
        try {

            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            Object result = action.doInStatement(stmt);
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
                if (!con.isClosed()) {
                    try {
                        con.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }

    abstract String get();

}
