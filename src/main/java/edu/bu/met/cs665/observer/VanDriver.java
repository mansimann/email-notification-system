package edu.bu.met.cs665.observer;

/**
 * Name: Mansi Mann.
 * Date: 02/25/2022
 * Course: CS-665
 * Assignment 2
 * Description: This class represents a van driver
 */
public class VanDriver extends Driver {

  private String vanType;

  /**
   * Gets the van type.
   * @return the type of the van
   */
  public String getVanType() {
    return vanType;
  }

  /**
   * Sets the van type.
   * @param vanType the type of van
   */
  public void setTaxiType(String vanType) {
    this.vanType = vanType;
  }

}
