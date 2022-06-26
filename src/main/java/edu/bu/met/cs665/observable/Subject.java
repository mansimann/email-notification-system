package edu.bu.met.cs665.observable;

import edu.bu.met.cs665.observer.Observer;

/**
 * Name: Mansi Mann.
 * Date: 02/25/2022
 * Course: CS-665
 * Assignment 2
 * Description: This interface represents a subject (or observable) in the observer design pattern
 */
public interface Subject {

  /**
   * Registers an observer to list of observers.
   * @param o the Observer object
   */
  void registerObserver(Observer o);

  /**
   * Removes an observer from our list of observers.
   * @param o the Observer object
   */
  void removeObserver(Observer o);

  /**
   * Notifies all observers.
   */
  void notifyObservers();

}

