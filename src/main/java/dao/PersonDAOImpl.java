package dao;

import model.Person;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDAOImpl implements PersonDAO {
    private final static String INSERT_PERSON = "insert into person(id,name,surname,birthyear) values(?,?,?,?)";
    private DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void insertPerson(Person person) throws SQLException {
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PERSON);
        preparedStatement.setInt(1,person.getId());
        preparedStatement.setString(2,person.getName());
        preparedStatement.setString(3,person.getSurname());
        preparedStatement.setString(4,person.getBirthYear());
        preparedStatement.executeUpdate();
        preparedStatement.close();
        System.out.println("Person nesnesi veritabanına eklendi.");
    }
}
