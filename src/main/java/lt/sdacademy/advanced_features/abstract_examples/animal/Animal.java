package lt.sdacademy.advanced_features.abstract_examples.animal;

public abstract class Animal {

    protected boolean mammal; //mato tik paveldancios klases tiesiogiai ir nereikia geteriu
    protected String voice;

    public Animal(boolean mammal, String voice) {
        this.mammal = mammal;
        this.voice = voice;
    }

    public String yieldVoice() {
        return String.format("My voice: is %s", voice);
    }
}
