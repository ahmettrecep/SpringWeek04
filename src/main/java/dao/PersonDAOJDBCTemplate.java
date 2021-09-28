package dao;

import model.Person;

public interface PersonDAOJDBCTemplate {
    public void insertPerson(Person person) throws Exception;
}
