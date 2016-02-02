package com.dyh.jdbcTemplate;

import java.sql.SQLException;
import java.sql.Statement;

public interface StatementCallback {
    Object doInStatement(Statement stmt) throws SQLException;
}