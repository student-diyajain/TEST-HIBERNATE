import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Testing {

	public static void main(String[] args) {
		System.out.println("program started!");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		System.out.println(factory);
        System.out.println(factory.isClosed());
	}

}
