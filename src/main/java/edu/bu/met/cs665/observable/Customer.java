package edu.bu.met.cs665.observable;

/**
 * Name: Mansi Mann.
 * Date: 02/25/2022
 * Course: CS-665
 * Assignment 2
 * Description: This class represents a customer
 */
public class Customer {

  private String customerName;
  private String customerAddress;

  /**
   * Class constructor specifying customer name and customer address.
   * @param customerName name of the customer
   * @param customerAddress address of the customer
   */
  public Customer(String customerName, String customerAddress) {
    this.customerName = customerName;
    this.customerAddress = customerAddress;
  }

  /**
   * Gets the customer name.
   * @return name of the customer
   */
  public String getCustomerName() {
    return customerName;
  }

  /**
   * Sets the customer name.
   * @param customerName name of the customer
   */
  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  /**
   * Gets the customer address.
   * @return address of the customer
   */
  public String getCustomerAddress() {
    return customerAddress;
  }

  /**
   * Sets the customer name.
   * @param customerAddress address of the customer
   */
  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }

}