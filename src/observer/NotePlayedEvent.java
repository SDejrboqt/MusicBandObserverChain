package observer;

import model.Note;

public class NotePlayedEvent implements Event {
    private Note note;
    
    public NotePlayedEvent(Note note) {
        this.note = note;
    }
    
    public Note getNote() {
        return note;
    }
    
    @Override
    public String getType() {
        return "NOTE_PLAYED";
    }
    
    @Override
    public String getDescription() {
        return "Note " + note.getPitch() + " played with velocity " + note.getVelocity();
    }
}