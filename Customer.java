/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenfurniture;

/**
 *
 * @author najmeh
 */
public class Customer implements Comparable<Customer>, java.io.Serializable{
    private int id;
    public String lastName;
    private String firstName;
    private String address;
    private int phoneNumber;
    private String email;

    public Customer(String lastName, String firstName, int phoneNumber) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.phoneNumber = phoneNumber;
    }

    public Customer(String lastName, int phoneNumber) {
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName) {
        this.firstName = firstName;
    }
    
    public Customer(int id, String lastName, String firstName, String address, int phoneNumber, String email) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
	public int compareTo(Customer anotherCustomer) {
        return (this.lastName.compareTo(anotherCustomer.getLastName()));
		}
	

//    @Override
//    public String toString() {
//        return "Customer{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
//    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", phoneNumber=" + phoneNumber + '}';
    }
        

}
        
        
    

