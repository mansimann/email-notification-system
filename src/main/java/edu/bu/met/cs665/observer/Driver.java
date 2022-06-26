package edu.bu.met.cs665.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Name: Mansi Mann.
 * Date: 02/25/2022
 * Course: CS-665
 * Assignment 2
 * Description: This class implements the Observer interface and represents a driver
 */
public class Driver implements Observer {

  private final List<String> notifications = new ArrayList<>();

  @Override
  public void update(String s) {
    notifications.add(s);
  }

  /**
   * Gets the latest notification.
   * @return the latest notification.
   */
  public String getLatestNotification() {
    return notifications.get(notifications.size() - 1);
  }

  /**
   * Prints the latest notification to the console.
   */
  public void displayLatestNotification() {
    System.out.println(notifications.get(notifications.size() - 1));
  }

  /**
   * Prints all the notifications to the console.
   */
  public void displayAllNotifications() {
    notifications.forEach(System.out::println);
  }

}
