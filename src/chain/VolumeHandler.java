package chain;

import model.SoundRequest;

public class VolumeHandler extends AudioHandler {
    private int volumePercent = 80;
    
    @Override
    public void handleRequest(SoundRequest request) {
        request.setVolume(volumePercent);
        request.addEffect("Volume set to " + volumePercent + "%");
        System.out.println("[AudioChain] Volume adjusted to " + volumePercent + "%");
        if (next != null) {
            next.handleRequest(request);
        }
    }
}