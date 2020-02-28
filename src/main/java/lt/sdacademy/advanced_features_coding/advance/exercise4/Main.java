package lt.sdacademy.advanced_features_coding.advance.exercise4;

import lt.sdacademy.advanced_features_coding.advance.exercise4.model.Bike;
import lt.sdacademy.advanced_features_coding.advance.exercise4.model.Car;
import lt.sdacademy.advanced_features_coding.advance.exercise4.services.IOService;


public class Main {

    public static void main(String[] args) {

        IOService ioService = new IOService();

        String personsData = ioService.inputData("Please enter persons information like (John Smith born 1984-03-24) : ");
        ioService.outputData(personsData);
    }
}


/*
4. Let's buy a vehicle
        Create class Person
Create class Parser
Create interface or an abstract class Vehicle
Create classes Car and Bike, that will implement/inherit Vehicle.
        User will provide all of the details about the Person (buyer) using command-line (e.g. "John Smith born 1984-03-24". Provided information will be parsed using Regex within Parser class. Parser class should receive char sequence and return an object of type Person or Null if provided details will not have required information.
        Created person will then buy a bike and car. Information about what and when was bought should be displayed.
*/
QL


        ####For Windows users:
        1. Download MySql database server for Windows users: https://dev.mysql.com/downloads/mysql/
        2. Download database client - dBeaver: https://dbeaver.io/download/
        ---

        ####For Linux users:
        1. Download database client - dBeaver: https://dbeaver.io/download/
        2. Download docker: https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-18-04
        3. Download docker-compose: https://linuxize.com/post/how-to-install-and-use-docker-compose-on-ubuntu-18-04/
        4. Create docker-compose.yml file, with content:
        ```yaml
        version: "3.4"

        services:

        mysqldb:
        image: mysql:8.0.19
        volumes:
        - "./mysql:/var/lib/mysql"
        restart: always
        ports:
        - 3306:3306
        environment:
        MYSQL_ROOT_PASSWORD: root
        MYSQL_DATABASE: db
        ```
        File can be created in directory like: `/Users/deimantas/IdeaProjects/SDA`

        ---
        ####For more practices
        https://sqlzoo.net/