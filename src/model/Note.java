package model;

public class Note {
    private String pitch;
    private int velocity;
    
    public Note(String pitch, int velocity) {
        this.pitch = pitch;
        this.velocity = velocity;
    }
    
    public Note(String pitch) {
        this(pitch, 80);
    }
    
    public String getPitch() { return pitch; }
    public int getVelocity() { return velocity; }
}