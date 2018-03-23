/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenfurniture;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
/**
 *
 * @author najmeh
 */
public class Order implements Comparable<Order>, java.io.Serializable{
    private int id;
    Calendar cl = Calendar.getInstance();
    private final Date orderDate = cl.getTime();;
    private ArrayList<OrderItem> orderItems;
    private Customer customers;

    public Customer getCustomers() {
        return customers;
    }

    public void setCustomers(Customer customers) {
        this.customers = customers;
    }
    
//public ArrayList<Customer> customers;

    public Order() {
    }

    public Order(int id) {
        this.id = id;
    }

    public Order(int id, ArrayList<OrderItem> orderItems) {
        this.id = id;
        this.orderItems = orderItems;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(ArrayList<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }
    
    public double getTotalPrice(Order anotherOrder){
        
        OrderItem orderi = new OrderItem();
        OrderItem orderi2 = new OrderItem(orderi.getItem(),2);
        double total = orderi2.getPrice();
        double sum = 0;
        for(int i=0; i<orderItems.size(); i++){
        if (this.customers.getLastName().equals(anotherOrder.getCustomers().lastName)){
            sum = sum + total;
        }}
        
        return sum;
        
    }
    
    	@Override
	public int compareTo(Order anotherOrder) {
            int laid = this.customers.compareTo(anotherOrder.getCustomers());
            if (laid ==0){laid = this.orderDate.compareTo(orderDate);}
//            else {
//                laid = -laid;
//            }
                return laid;}
        
		//alternate implementaion for publication year based sorting
//		if(this.customers == anotherOrder.getLastName()){
//			return 1;
//		} else {
//			return 0;
//		}
//	}
        
    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", orderDate=" + orderDate + ", orderItems=" + orderItems + ", customers=" + customers + '}';
    }
}
