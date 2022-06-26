package edu.bu.met.cs665;

import edu.bu.met.cs665.observable.Customer;
import edu.bu.met.cs665.observable.Product;
import edu.bu.met.cs665.observable.*;
import edu.bu.met.cs665.observer.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Name: Mansi Mann.
 * Date: 02/25/2022
 * Course: CS-665
 * Assignment 2
 * Description: This is a JUnit Test.
 *
 *  Scenario: Shop registers 5 drivers and sends 1 delivery request
 *  Actual: "Delivery Request: Customer: John, Product: Pen, Address: 123 St."
 *  Result: Test passes when notification = "Delivery Request: Customer: John, Product: Pen, Address: 123 St."
 */
public class NotifyObserversTest {

  @Test
  public void testNotifyObservers() {

    // Create a Shop object
    Shop s = new Shop();

    // Create 2 Customer objects
    Customer c1 = new Customer("John", "123 St.");
    Customer c2 = new Customer("Mary", "145 St.");

    // Add Customers to Shop's customer list
    s.addCustomer(c1);
    s.addCustomer(c2);

    // Create 5 Driver objects
    Driver d1 = new VanDriver();
    Driver d2 = new TaxiDriver();
    Driver d3 = new VanDriver();
    Driver d4 = new TaxiDriver();
    Driver d5 = new VanDriver();

    // Register Drivers
    s.registerObserver(d1);
    s.registerObserver(d2);
    s.registerObserver(d3);
    s.registerObserver(d4);
    s.registerObserver(d5);

    // Create 2 Product objects
    Product p1 = new Product("Bag");
    Product p2 = new Product("Pen");

    // Create another DeliveryRequest object
    DeliveryRequest dr = new DeliveryRequest(p1, c1);

    // Set the state
    s.setState(dr);

    // Ensure that the notifications are correct
    String actual = "Customer: John, Product: Bag, Address: 123 St.";
    assertEquals(d1.getLatestNotification(), actual);
    assertEquals(d2.getLatestNotification(), actual);
    assertEquals(d3.getLatestNotification(), actual);
    assertEquals(d4.getLatestNotification(), actual);
    assertEquals(d5.getLatestNotification(), actual);

  }

}


