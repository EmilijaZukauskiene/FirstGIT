package lt.sdacademy.advanced_features_coding.advance.exercise4.model;

import lt.sdacademy.advanced_features_coding.advance.exercise4.model.Person;

public interface Vehicle {

  String getName();

  default void printing(Person personList) {
    System.out.println(getName() + " Nupirko : " + personList.getbName() + " Gimes " + personList.getBornDate());
  }
}
