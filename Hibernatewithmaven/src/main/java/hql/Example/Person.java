package hql.Example;

import javax.persistence.*;

@Entity
public class Person {
  
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="naam")
    private String name;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "gender")
    private String gender;
    @Override
  	public String toString() {
  		return "Person [id=" + id + ", name=" + name + ", email=" + email + ", gender=" + gender + "]\n";
  	}
    // Constructors
    public Person() {}

    public Person(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
