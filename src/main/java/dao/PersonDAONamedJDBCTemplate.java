package dao;

import model.Person;

public interface PersonDAONamedJDBCTemplate {
    public void insertPerson(Person person) throws Exception;

}
