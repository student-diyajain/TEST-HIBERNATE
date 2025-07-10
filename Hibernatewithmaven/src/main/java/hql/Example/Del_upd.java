package hql.Example;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.Query;

public class Del_upd {
    public static void main(String[] args) {
        Session s=new Configuration().configure().buildSessionFactory().openSession();
        Transaction tx=s.beginTransaction();
               String query="update Person set email=:x where name =:c";
                  //String query="delete from Student  where name =:c";
                  Query q=  s.createQuery(query);
                  q.setParameter("x","Ivy_Taylor123@gmail");
                  q.setParameter("c","Ivy Taylor");
                 int r= q.executeUpdate();
        System.out.println(r);

        tx.commit();
        s.close();
    }
}
