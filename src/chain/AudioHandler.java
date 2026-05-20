package chain;

import model.SoundRequest;

public abstract class AudioHandler {
    protected AudioHandler next;
    
    public AudioHandler setNext(AudioHandler handler) {
        this.next = handler;
        return handler;
    }
    
    public abstract void handleRequest(SoundRequest request);
}