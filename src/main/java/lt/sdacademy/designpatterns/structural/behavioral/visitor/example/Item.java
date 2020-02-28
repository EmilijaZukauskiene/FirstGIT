package lt.sdacademy.designpatterns.structural.behavioral.visitor.example;

public interface Item {

    int accept(Visitor visitor);
}