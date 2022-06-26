package edu.bu.met.cs665.observer;

/**
 * Name: Mansi Mann.
 * Date: 02/25/2022
 * Course: CS-665
 * Assignment 2
 * Description: This interface represents an observer in the observer design pattern
 */
public interface Observer {

  /**
   * Updates observers.
   * @param s a string representation of the latest update
   */
  void update(String s);

}
