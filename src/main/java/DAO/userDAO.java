package DAO;

import model.UserDetails;

import javax.sql.DataSource;


public interface userDAO
{
    public void userRegistration(UserDetails userDetails);
    public UserDetails search(String lemail);



}
