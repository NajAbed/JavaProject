/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greenfurniture;
import greenfurniture.datasource.ItemDataSource;
//import java.io.File;
//import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.Set;
//import java.util.*;

/**
 *
 * @author najmeh
 */

public class App {

        ArrayList<ItemDataSource> items = new ArrayList<>();
        //static Set<String[]> mySet = new HashSet<>();
	public static void main(String[] args) {
            
            
            //ItemDataSource itemsD = new ItemDataSource();
            //System.out.println(itemsD.toString());
            //Order orders = new Order();
//                ArrayList<Customer> customer1 = new ArrayList<>();
//                customer1.add(new Customer("BD","A",34));
//                
//                ArrayList<Customer> customer2 = new ArrayList<>();
//                customer2.add(new Customer("CC","B",1666));
//                
//                ArrayList<Customer> customer3 = new ArrayList<>();
//                customer3.add(new Customer("AA","S",6666));
                
                Customer customer1 = new Customer("BD","A",34);
                Customer customer2 = new Customer("CC","B",1666);
                Customer customer3 = new Customer("AA","S",6666);
                Item item1 = new Item("Chair", "Executive chair", 29.99d);
                Item item2 = new Item("Table", "Computer table", 39.99d);
                
                OrderItem orderitems1 = new OrderItem();
                orderitems1.setId(1);
                orderitems1.setItem(item1);
                orderitems1.setQuantity(2);
                
		Order orders1 = new Order();
                orders1.setId(3);
                orders1.setCustomers(customer2);
                
                Order orders2 = new Order();
                orders2.setId(3);
                orders2.setCustomers(customer2);
                
                Order orders3 = new Order();
                orders3.setId(1);
                orders3.setCustomers(customer1);
                
                Order orders4 = new Order();
                orders4.setId(2);
                orders4.setCustomers(customer3);
                
                Order orders5 = new Order();
                orders5.setId(1);
                orders5.setCustomers(customer3);
		
                ArrayList<Order> orders = new ArrayList<>();
                orders.add(orders1);
                orders.add(orders2);
                orders.add(orders3);
                orders.add(orders4);
                orders.add(orders5);
                
                System.out.println("---Orders before Sorting---");
                orders.stream().forEach((i) -> {
                    System.out.println(i.toString());
            });
                //Collections.sort(orders, new Comparator<Order>();
                Collections.sort(orders);
		System.out.println("---Orders after Sorting---");
                orders.stream().forEach((i) -> {
                    System.out.println(i.toString());
            });
                System.out.println("-----HashSet----");
                
                System.out.println("-----Before Hash----");
                ArrayList<Order> orders7 = new ArrayList<>();
                orders7.add(orders1);
                orders7.add(orders1);
                System.out.println(orders7);
                
                System.out.println("-----After Hash----");
                Set arders8 = new HashSet();
                arders8.add(orders1);
                arders8.add(orders1);
                System.out.println(arders8);
                                
                System.out.println("-----java 8 stream demo----");
		orders.stream()
		.filter(streamedOrder->{return streamedOrder.getCustomers().getFirstName().equals("A");}) 
		.collect(Collectors.toList()) 
		.forEach(System.out::println); 

                System.out.println("-----item for number 10----");
                                
                System.out.println("Before Change");
                OrderItem orderitems = new OrderItem();
                orderitems.setId(1);
                orderitems.setItem(item1);
                orderitems.setQuantity(2);
                System.out.println(orderitems.getPrice());
                
                System.out.println("After Change");
                OrderItem orderitems2 = new OrderItem();
                orderitems2.setId(2);
                orderitems2.setItem(item2);
                orderitems2.setQuantity(3);
                System.out.println(orderitems2.getPrice());
                             
                //Task2
                System.out.println(reverseIt("The quick brown fox jumps over a lazy dog"));
                
	}
        
        public static String reverseIt(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }
                
	}

    



