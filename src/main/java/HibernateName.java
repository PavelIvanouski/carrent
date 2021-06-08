
import myapp.model.entity.Engine;
import myapp.model.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class HibernateName {
    public static void main(String[] args) {
//        var author = new Author();
//        author.setFirstName("Pavel");
//        author.setLastName("Ivanov");
//
//        var book1 = new Book();
//        book1.setTitle("Title1");
//        book1.setAuthor(author);
//
//        var book2 = new Book();
//        book2.setTitle("Title2");
//        book2.setAuthor(author);
//
//        author.setBooks(List.of(book1,book2));

        Engine engine = new Engine();
        engine.setName("test");

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(engine );
        session.getTransaction().commit();
        HibernateUtil.getSessionFactory().close();


    }
}
