package lt.sdacademy.advanced_features_coding.advance.exercise4.services;

import lt.sdacademy.advanced_features_coding.advance.exercise4.model.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parser {

    public Person personDataFromFile(String fileLine) {
        String[] lineForMap = fileLine.split(" ");
        return new Person(lineForMap[0] + " " + lineForMap[1], lineForMap[3]);
    }
}