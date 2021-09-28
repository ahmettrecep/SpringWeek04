package dao;

import model.Person;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class PersonDAONamedJDBCTemplateImpl implements PersonDAONamedJDBCTemplate{

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public NamedParameterJdbcTemplate getNamedParameterJdbcTemplate() {
        return namedParameterJdbcTemplate;
    }

    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    @Override
    public void insertPerson(Person person) throws Exception {

    }
}
