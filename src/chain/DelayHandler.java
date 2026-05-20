package chain;

import model.SoundRequest;

public class DelayHandler extends AudioHandler {
    @Override
    public void handleRequest(SoundRequest request) {
        request.addEffect("Delay (500ms)");
        System.out.println("[AudioChain] Delay effect added");
        if (next != null) {
            next.handleRequest(request);
        }
    }
}