package model;

import java.util.ArrayList;
import java.util.List;

public class SoundRequest {
    private Note originalNote;
    private int volume;
    private List<String> effectsApplied = new ArrayList<>();
    
    public SoundRequest(Note note) {
        this.originalNote = note;
        this.volume = note.getVelocity();
    }
    
    public Note getOriginalNote() { return originalNote; }
    public int getVolume() { return volume; }
    public void setVolume(int volume) { this.volume = volume; }
    
    public void addEffect(String effect) {
        effectsApplied.add(effect);
    }
    
    public List<String> getEffectsApplied() {
        return effectsApplied;
    }
}