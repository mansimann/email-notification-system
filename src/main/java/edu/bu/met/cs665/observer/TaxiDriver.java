package edu.bu.met.cs665.observer;

/**
 * Name: Mansi Mann.
 * Date: 02/25/2022
 * Course: CS-665
 * Assignment 2
 * Description: This class represents a taxi driver
 */
public class TaxiDriver extends Driver {

  private String taxiType;

  /**
   * Gets the taxi type.
   * @return the type of the taxi
   */
  public String getTaxiType() {
    return taxiType;
  }

  /**
   * Sets the taxi type.
   * @param taxiType the type of taxi
   */
  public void setTaxiType(String taxiType) {
    this.taxiType = taxiType;
  }

}
