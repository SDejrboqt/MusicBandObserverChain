package observers;

import observer.Observer;
import observer.Event;

public class LightingObserver implements Observer {
    @Override
    public void update(Event event) {
        if (event.getType().equals("NOTE_PLAYED")) {
            System.out.println("[Lighting] 💡 Flashing blue & red lights!");
        }
    }
}