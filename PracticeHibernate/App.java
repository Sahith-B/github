package hibernate.PracticeHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        System.out.println(factory);
        
        Student st=new Student();
        
        st.setId(101);
        st.setName("Sahith");
        st.setBranch("CSE");
        st.setGrade('A');
        
        System.out.println(st);
        
        Session session=factory.openSession();
        
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
        session.close();
        
        
    }
}
