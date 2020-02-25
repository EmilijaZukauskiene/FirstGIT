package lt.sdacademy.designpatterns.structural.behavioral.visitor.example;

public interface Visitor {

    int visit(Car car);

    int visit(Computer computer);
}