package test;

import dao.PersonDAO;
import model.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringJDBCTest {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.jdbc.xml");
        PersonDAO dao = context.getBean(PersonDAO.class);
        Person person = new Person(1,"test name", "test surname", "1997");
        dao.insertPerson(person);
    }

}
