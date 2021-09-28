package test;

import dao.PersonDAO;
import dao.PersonDAOJDBCTemplate;
import model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJDBCTemplateTest {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.jdbctemplate.xml");
        PersonDAOJDBCTemplate dao = context.getBean(PersonDAOJDBCTemplate.class);
        Person person = new Person(2,"Ahmet Recep", "Yan", "1997");
        dao.insertPerson(person);
    }
}
