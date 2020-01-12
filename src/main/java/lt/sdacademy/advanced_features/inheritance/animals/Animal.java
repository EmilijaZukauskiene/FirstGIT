package lt.sdacademy.advanced_features.inheritance.animals;

public class Animal {
    protected boolean mammal;
    protected String voice;

    public Animal(boolean mammal, String voice) {
        this.mammal = mammal;
        this.voice = voice;
    }

    public String yieldVoice() {
        return String.format("My voice: is %s", voice);
    }
}
