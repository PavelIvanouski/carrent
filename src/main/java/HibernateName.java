
import myapp.model.entity.*;
import myapp.model.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;
import java.util.Set;

public class HibernateName {
    public static void main(String[] args) {


//        Engine engine1 = new Engine();
//        engine1.setName("engine1");
//
//        Engine engine2 = new Engine();
//        engine2.setName("engine2");
//
//        Type type1 = new Type();
//        type1.setName("type1");
//
//        Type type2 = new Type();
//        type2.setName("type2");
//
//        Model model1 = new Model();
//        model1.setName("BMW");
//        model1.setSeatsNum(4);
//        model1.setEngineVolume(2000);
//        model1.setEngine(engine1);
//        model1.setType(type2);
//        model1.setAutoTransmission(false);
//
//        type2.setModels(List.of(model1));
//
//        Car car1 = new Car();
//        car1.setModel(model1);
//        car1.setVin("ndje3434");
//        car1.setStateNum("1049 II-4");
//        car1.setColor("white");
//        car1.setYear("2018");
//
//        model1.setCars(List.of(car1));

//        Customer customer1 = new Customer();
//        customer1.setLogin("Pasha");
//        customer1.setPassword("123");
//        customer1.setFirstName("Pavel");
//        customer1.setLastName("Ivanouski");
//        customer1.setPassport("13131313131");
//
//        Role role1 = new Role();
//        role1.setName("Role1");
//        role1.getCustomers().add(customer1);
//        customer1.getRoles().add(role1);

        Status status1 = new Status();
        status1.setName("status1");

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(status1);
        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();


    }
}
