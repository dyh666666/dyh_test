package com.dyh.jdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.dyh.test.People;

public class JdbcTemplateUserImpl extends JdbcTemplate {

    @Override
    protected Object doInStatement(ResultSet rs) {
        System.out.println("hello");
        return null;
    }

    public static void main(String[] args) throws Exception {

        // String sql = "select * from cd_pay_dictionary";
        // JdbcTemplate jt = new JdbcTemplateUserImpl();
        // List<People> userList = (List<People>) jt.execute(sql);
        JdbcTemplate jt = new JdbcTemplateUserImpl();
        jt.test("");
    }

    @Override
    protected Object test(String str) {
        System.out.println("hello test");
        return null;
    }

}
