package com.dyh.jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.dyh.test.People;

public class CopyOfJdbcTemplateUserImpl extends JdbcTemplate {

    @Override
    protected Object doInStatement(ResultSet rs) {
        // TODO Auto-generated method stub
        return null;
    }

    public static void main(String[] args) throws SQLException {
        //
        // String sql = "select * from User";
        // JdbcTemplate jt = new CopyOfJdbcTemplateUserImpl();
        // List<People> userList = (List<People>) jt.execute(sql);
    }

    @Override
    protected Object test(String str) {
        // TODO Auto-generated method stub
        return null;
    }

}
