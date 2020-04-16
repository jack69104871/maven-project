package com.example;

/**
 * This is a class.
 */
public class Person {

  /**
   * This is a constructor.
   */
  public Person() {

  }

/**
   * @param is someones name
   * @return is string
   */
  public final String person(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
