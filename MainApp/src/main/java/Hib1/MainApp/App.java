package Hib1.MainApp;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.abc.pojo.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	// to activate hibernate software
         Configuration configuration =  new Configuration() ;
         //configuration help us to load in the memory
         Configuration config= configuration.configure();
         //the above line will contact the jdbc connection pool mechanism and 
         //    picks up one Connection object.
         SessionFactory sessionFactory= config.buildSessionFactory();
        //using the sessionFactory, hibernate will open a session and gives 
        // mechnism for communicating with database(through POJO).
         
         Session session= sessionFactory.openSession();
         // using session object interact with database using pojo class
         
         Transaction transaction = session.beginTransaction();
         
         Employee employee= new Employee();
         
         
         employee.setEid(20);
         employee.setEname("Anurag");
         employee.setEaddr("Map");
         
         session.save(employee);
         transaction.commit();
         System.out.println("Data got save");
         
    }
}
