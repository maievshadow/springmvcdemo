package com.maiev.demo.dao;

import com.maiev.demo.mapper.UserMapper;
import com.maiev.demo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

@Component
public class UserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    public User getUserInfo(Integer userId) {
        String sql = "SELECT user_id,mobile FROM card_user WHERE user_id = ?";
        User user = jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setMobile(resultSet.getString("mobile"));
                return user;
            }
        }, userId);

        return user;
    }

    public User getUserInfo2(Integer userId) {
        SqlSession session = sqlSessionFactory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.selectByPrimaryKey(userId);

        return user;
    }


    public User getUserInfo3(Integer userId) {
        SqlSession session = sqlSessionFactory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getInfo(userId);

        return user;
    }
}
