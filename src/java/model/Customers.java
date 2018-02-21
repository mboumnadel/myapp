package model;
// Generated Apr 12, 2016 1:06:12 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Customers generated by hbm2java
 */
@Entity
@Table(name="customers"
    ,catalog="mystore"
)
public class Customers  implements java.io.Serializable {


     private int customerNumber;
     private Employees employees;
     private String customerName;
     private String contactLastName;
     private String contactFirstName;
     private String phone;
     private String addressLine1;
     private String addressLine2;
     private String city;
     private String state;
     private String postalCode;
     private String country;
     private Double creditLimit;
     private Set orderses = new HashSet(0);
     private Set paymentses = new HashSet(0);

    public Customers() {
    }

	
    public Customers(int customerNumber, String customerName, String contactLastName, String contactFirstName, String phone, String addressLine1, String city, String country) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.contactLastName = contactLastName;
        this.contactFirstName = contactFirstName;
        this.phone = phone;
        this.addressLine1 = addressLine1;
        this.city = city;
        this.country = country;
    }
    public Customers(int customerNumber, Employees employees, String customerName, String contactLastName, String contactFirstName, String phone, String addressLine1, String addressLine2, String city, String state, String postalCode, String country, Double creditLimit, Set orderses, Set paymentses) {
       this.customerNumber = customerNumber;
       this.employees = employees;
       this.customerName = customerName;
       this.contactLastName = contactLastName;
       this.contactFirstName = contactFirstName;
       this.phone = phone;
       this.addressLine1 = addressLine1;
       this.addressLine2 = addressLine2;
       this.city = city;
       this.state = state;
       this.postalCode = postalCode;
       this.country = country;
       this.creditLimit = creditLimit;
       this.orderses = orderses;
       this.paymentses = paymentses;
    }
   
     @Id 

    
    @Column(name="customerNumber", unique=true, nullable=false)
    public int getCustomerNumber() {
        return this.customerNumber;
    }
    
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="salesRepEmployeeNumber")
    public Employees getEmployees() {
        return this.employees;
    }
    
    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    
    @Column(name="customerName", nullable=false, length=50)
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    
    @Column(name="contactLastName", nullable=false, length=50)
    public String getContactLastName() {
        return this.contactLastName;
    }
    
    public void setContactLastName(String contactLastName) {
        this.contactLastName = contactLastName;
    }

    
    @Column(name="contactFirstName", nullable=false, length=50)
    public String getContactFirstName() {
        return this.contactFirstName;
    }
    
    public void setContactFirstName(String contactFirstName) {
        this.contactFirstName = contactFirstName;
    }

    
    @Column(name="phone", nullable=false, length=50)
    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    
    @Column(name="addressLine1", nullable=false, length=50)
    public String getAddressLine1() {
        return this.addressLine1;
    }
    
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    
    @Column(name="addressLine2", length=50)
    public String getAddressLine2() {
        return this.addressLine2;
    }
    
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    
    @Column(name="city", nullable=false, length=50)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    
    @Column(name="state", length=50)
    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    
    @Column(name="postalCode", length=15)
    public String getPostalCode() {
        return this.postalCode;
    }
    
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    
    @Column(name="country", nullable=false, length=50)
    public String getCountry() {
        return this.country;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }

    
    @Column(name="creditLimit", precision=22, scale=0)
    public Double getCreditLimit() {
        return this.creditLimit;
    }
    
    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="customers")
    public Set getOrderses() {
        return this.orderses;
    }
    
    public void setOrderses(Set orderses) {
        this.orderses = orderses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="customers")
    public Set getPaymentses() {
        return this.paymentses;
    }
    
    public void setPaymentses(Set paymentses) {
        this.paymentses = paymentses;
    }




}

