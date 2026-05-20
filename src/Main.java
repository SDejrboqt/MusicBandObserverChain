import observer.BandEventManager;
import observers.*;
import chain.*;
import model.Note;

public class Main {
    public static void main(String[] args) {
        AudioHandler reverb = new ReverbHandler();
        AudioHandler delay = new DelayHandler();
        AudioHandler volume = new VolumeHandler();
        
        reverb.setNext(delay).setNext(volume);
        
        BandEventManager manager = new BandEventManager(reverb);
        
        LightingObserver lighting = new LightingObserver();
        RecorderObserver recorder = new RecorderObserver();
        DisplayObserver display = new DisplayObserver();
        AudienceAppObserver audience = new AudienceAppObserver();
        
        manager.attach(lighting);
        manager.attach(recorder);
        manager.attach(display);
        manager.attach(audience);
        
        manager.playNote(new Note("C4", 90));
        manager.playNote(new Note("E5", 70));
        
        System.out.println("\n=== Detaching RecorderObserver ===");
        manager.detach(recorder);
        
        System.out.println("\n=== Playing note after detach ===");
        manager.playNote(new Note("G4", 100));
    }
}