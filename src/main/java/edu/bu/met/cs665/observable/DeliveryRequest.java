package edu.bu.met.cs665.observable;

/**
 * Name: Mansi Mann.
 * Date: 02/25/2022
 * Course: CS-665
 * Assignment 2
 * Description: This class represents a delivery request
 */
public class DeliveryRequest {

  private String deliveryRequest;

  /**
   * Class constructor.
   * @param p product in the order
   * @param c customer of the order
   */
  public DeliveryRequest(Product p, Customer c) {
    deliveryRequest = "Customer: " + c.getCustomerName()
      + ", Product: " + p.getProductName()
      + ", Address: " + c.getCustomerAddress();
  }

  /**
   * Gets the delivery request
   * @return the delivery request
   */
  public String getDeliveryRequest() {
    return deliveryRequest;
  }

}