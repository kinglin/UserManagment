package dao;

import model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by kinglin on 2015/8/18.
 */
public class UserDao {

    JDBCUtil jdbcUtil;
    Connection connection;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public UserDao() {
        jdbcUtil = new JDBCUtil();
        connection = jdbcUtil.getConn();
    }

    public String add(User user){

        if (!find(user).startsWith("u")){
            return "username exist, please change to another one";
        }else {
            try {
                ps = connection.prepareStatement("INSERT INTO MYUSER(ID,USERNAME,PASSWORD) VALUES (?,?,?)");
                ps.setString(1,user.getId());
                ps.setString(2,user.getUsername());
                ps.setString(3,user.getPassword());

                rs = ps.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
                return "database error";
            }
        }
        return user.getId();
    }

    public String find(User user){

        String result = "user "+user.getUsername()+" doesn't exist";

        try {
            ps = connection.prepareStatement("SELECT * FROM MYUSER WHERE USERNAME=?");
            ps.setString(1,user.getUsername());

            rs = ps.executeQuery();
            if (rs.next()){
                result = "your password is wrong";
                String id = rs.getString("ID");
                if (rs.getString("PASSWORD").equals(user.getPassword())){
                    result = id;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public boolean delete(User user){
        return false;
    }

    public boolean update(User user){
        return false;
    }
}
