package observer;

import java.util.ArrayList;
import java.util.List;
import chain.AudioHandler;
import model.Note;
import model.SoundRequest;

public class BandEventManager implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private AudioHandler audioChainHead;
    
    public BandEventManager(AudioHandler head) {
        this.audioChainHead = head;
    }
    
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
        System.out.println("[System] Observer attached: " + observer.getClass().getSimpleName());
    }
    
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
        System.out.println("[System] Observer detached: " + observer.getClass().getSimpleName());
    }
    
    @Override
    public void notifyObservers(Event event) {
        for (Observer obs : observers) {
            obs.update(event);
        }
    }
    
    public void playNote(Note note) {
        System.out.println("\n=== Musician plays: " + note.getPitch() + " ===");
        
        Event event = new NotePlayedEvent(note);
        notifyObservers(event);
        
        SoundRequest request = new SoundRequest(note);
        if (audioChainHead != null) {
            System.out.println("\n--- Audio Chain Processing ---");
            audioChainHead.handleRequest(request);
            System.out.println("Final sound: " + request.getEffectsApplied());
        } else {
            System.out.println("No audio chain configured.");
        }
    }
}