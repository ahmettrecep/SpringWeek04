package dao;

import model.Person;
import org.springframework.jdbc.core.JdbcTemplate;

public class PersonDAOJDBCTemplateImpl implements PersonDAOJDBCTemplate{

    private final static String INSERT_PERSON = "insert into person(id,name,surname,birthyear) values(?,?,?,?)";

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insertPerson(Person person) throws Exception {
        //Paremetre Sırası Önemli!!!!
        Object[] personParams = new Object[]{person.getId(),person.getName(),person.getSurname(),person.getBirthYear()};
        jdbcTemplate.update(INSERT_PERSON, personParams);
        System.out.println("Person nesnesi veritabanına eklendi.#JDBCTemplate" + person.toString());
    }
}
