package DAO.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.DataSource;

import DAO.userDAO;
import com.sun.org.apache.xpath.internal.objects.XString;
import model.UserDetails;

public class jdbcuserDAO implements userDAO
{
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    public void userRegistration(UserDetails userDetails) {

        String sql = "INSERT INTO register " +
                "(name,email,password,phone) VALUES (?, ?, ?,?)";
        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, userDetails.getUsername());
            ps.setString(2, userDetails.getUseremail());
            ps.setString(3, userDetails.getUserpwd());
            ps.setString(4, userDetails.getUsernumber());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                }


            }
        }
    }
    public UserDetails search(String lemail)
    {
        String sql = "SELECT * FROM register WHERE email = ?";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, lemail);
            UserDetails userDetails = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                userDetails = new UserDetails(
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("password"),
                        rs.getString("phone")
                );
            }
            rs.close();
            ps.close();
            return userDetails;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }




}