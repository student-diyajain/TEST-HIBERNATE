package hql.Example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;
import java.util.Arrays;
import java.util.List;

public class Join {
    public static void main(String[] args) {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session s= factory.openSession();
        String query="Select q.question_id,q.question,a.answer from Question as q inner join q.answer as a";
        Query q=s.createQuery(query);
        List<Object[]>list=q.getResultList();  //since it gives mixture of both question and answer 
        for(Object[] l:list) {
        System.out.println(Arrays.toString(l));
        }
        s.close();

    }
}
