package chain;

import model.SoundRequest;

public class ReverbHandler extends AudioHandler {
    @Override
    public void handleRequest(SoundRequest request) {
        request.addEffect("Reverb");
        System.out.println("[AudioChain] Reverb effect added");
        if (next != null) {
            next.handleRequest(request);
        }
    }
}