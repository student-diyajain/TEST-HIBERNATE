package com.tut;
import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity       //it is for mark this class as a table 
@Table(name="AddressTable") //it is for change the table details 
public class Address {
  
	@Id   //for primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)    //for auto_increment 
    @Column(name="ADDRESSID")   //for column modification
    private int addressId;
    @Column(name="STREET",length=50)
    private  String street;
    @Column(name="CITY",length=50)
    private  String city;
    @Column(name="ISOPEN")
    private boolean isOpen;
    @Transient         //to ignore this column
    private double x;
    @Temporal(TemporalType.DATE)     //to set the date format 
    @Column(name="ADDEDDATE")
    private Date addedDate;
    @Lob             //to know that this is large object
    private byte[] image;
    
    public Address(int addressId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
  		super();
  		this.addressId = addressId;
  		this.street = street;
  		this.city = city;
  		this.isOpen = isOpen;
  		this.x = x;
  		this.addedDate = addedDate;
  		this.image = image;
  	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


}
