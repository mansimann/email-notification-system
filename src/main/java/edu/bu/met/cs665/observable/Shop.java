package edu.bu.met.cs665.observable;

import edu.bu.met.cs665.observer.Observer;
import java.util.ArrayList;
import java.util.List;

/**
 * Name: Mansi Mann.
 * Date: 02/25/2022
 * Course: CS-665
 * Assignment 2
 * Description: This class implements Subject and represents a shop
 */
public class Shop implements Subject {

  private String state;
  private final List<Observer> observerList = new ArrayList<>();
  private final List<Customer> customerList = new ArrayList<>();
  private final List<DeliveryRequest> deliveryRequestList = new ArrayList<>();

  @Override
  public void registerObserver(Observer o) {
    observerList.add(o);
  }

  @Override
  public void removeObserver(Observer o) {
    observerList.remove(o);
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observerList) {
      o.update(state);
    }
  }

  /**
   * Gets the state of the delivery request.
   * @return the state of the delivery request
   */
  public String getState() {
    return state;
  }

  /**
   * Sets the state of the delivery request.
   * @param dr the delivery request
   */
  public void setState(DeliveryRequest dr) {
    this.state = dr.getDeliveryRequest();
    deliveryRequestList.add(dr);
    notifyObservers();
  }

  /**
   * Adds a customer to list of customers.
   * @param c the customer to be added
   */
  public void addCustomer(Customer c) {
    customerList.add(c);
  }

  /**
   * Removes a customer from list of customers.
   * @param c the customer to be removed
   */
  public void removeCustomer(Customer c) {
    customerList.remove(c);
  }

}