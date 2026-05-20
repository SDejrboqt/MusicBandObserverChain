package observers;

import observer.Observer;
import observer.Event;

public class AudienceAppObserver implements Observer {
    @Override
    public void update(Event event) {
        if (event.getType().equals("NOTE_PLAYED")) {
            System.out.println("[AudienceApp] 📱 Push notification: 'The band just played a new note!'");
        }
    }
}