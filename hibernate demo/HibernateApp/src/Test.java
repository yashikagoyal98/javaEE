import com.zensar.*;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
@Entity
/*class Employee
{
	@Id
	private int id;
	private String name;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	*/
	
/* } */

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop l1=new Laptop();
	
		l1.setId(2);
		l1.setManufacturer("dell");
		
		
		Laptop l2=new Laptop();
		l2.setId(1);
		l2.setManufacturer("hp");
		
		
		Employee e1=new Employee();
		/*
		 * Address address= new Address(); address.setArea("KHARADI");
		 * address.setCity("pune");
		 */
		e1.setId(5);
		e1.setName("abcd");
		e1.setSalary(10000);
		/* e1.setLaptop(l1); */
		/*
		 * e1.getLaptops().add(l1); e1.getLaptops().add(l2);
		 */
		l1.setE(e1);
		l2.setE(e1);
		
		/* e1.setName("yashi"); */
		/* e1.setAddress(address); */
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
		session.save(e1); 
		session.save(l1);
		session.save(l2);
		/*
		 * Query query=session.createQuery("from Employee"); List<Employee>
		 * list=query.getResultList();
		 */
		
		session.getTransaction().commit();
		session.close();
		/*
		 * for(Employee e:list) { System.out.println(e); }
		 */
	}

}
