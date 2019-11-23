package lt.sdacademy.fundamentals.loop.for_each;

public class Example1 {
    public static void main(String[] args) {

        int[] ints = new int[]{1, 2, 3};
        Animal dog = new Animal("Boss", "Boxer");
        Animal cat = new Animal("Dolly", "Ciau ciau");

        Animal[] animals = {dog, cat}; //duomenu tipas - objektas

        for (Animal a : animals) {
            System.out.println(a.getName());//a yra objektas
            System.out.println(a.getBreed());
        }
    }
}

class Animal {
    //kintamieji
    private String name;
    private String breed;

    //konstruktorius
    Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    //kintamojo getteris
    public String getName() { //funkcija, kuri grazina kintamaji + public
        return name;
    }

    public String getBreed() {
        return breed;
    }
}