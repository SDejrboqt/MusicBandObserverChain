package observers;

import observer.Observer;
import observer.Event;

public class DisplayObserver implements Observer {
    @Override
    public void update(Event event) {
        if (event.getType().equals("NOTE_PLAYED")) {
            System.out.println("[Display] 📺 Showing lyrics: 'Love is all you need'");
        }
    }
}