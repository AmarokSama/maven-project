package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greet function
   *
   * @param someone person to greed
   * @return greedings
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
