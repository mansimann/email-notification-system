package edu.bu.met.cs665.observable;

import edu.bu.met.cs665.observable.Shop;

/**
 * Name: Mansi Mann.
 * Date: 02/25/2022
 * Course: CS-665
 * Assignment 2
 * Description: This class represents a product
 */
public class Product {

  private String productName;

  /**
   * Class constructor specifying product id and product name.
   * @param productName name of the product
   */
  public Product(String productName) {
    this.productName = productName;
  }

  /**
   * Gets the product name.
   * @return the name of the product
   */
  public String getProductName() {
    return productName;
  }

  /**
   * Sets the product name.
   * @param productName name of the product
   */
  public void setProductName(String productName) {
    this.productName = productName;
  }

}
