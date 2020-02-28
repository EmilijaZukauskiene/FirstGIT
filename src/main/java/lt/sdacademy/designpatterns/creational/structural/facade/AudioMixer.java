package lt.sdacademy.designpatterns.creational.structural.facade;

import java.io.File;

public class AudioMixer {
    public File fix(){
        System.out.println("AudioMixer: fixing audio...");
        return new File("tmp");
    }
}
