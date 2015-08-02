package com.vpomo.reportglonass.repository;

import com.vpomo.reportglonass.model.Users;

import java.util.Date;
import java.util.List;
import org.springframework.dao.DataAccessException;

/**
 * Repository interface for <code>Users</code> domain objects
 *
 * @author Pomogalov Vladimir
 */

public interface UsersRepository {
    public List<Users> getAll()  throws DataAccessException;
    public Users getUserLogin(String login) throws DataAccessException;
    public Integer addUser(String login, String password, String passwordTwo, String names, String groupUser) throws DataAccessException;
    public Users newUser(String login, String password, String names, Date dateLastReport, String groupUser) throws DataAccessException;
    public void newDateUser(Users user, Date dateLastReport) throws DataAccessException;
    public List<Users> getUsersGroup(String grUser) throws DataAccessException;
    public void remove(String login) throws DataAccessException;

}
