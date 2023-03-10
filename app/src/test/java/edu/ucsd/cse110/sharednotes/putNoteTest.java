package edu.ucsd.cse110.sharednotes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.ucsd.cse110.sharednotes.model.Note;
import edu.ucsd.cse110.sharednotes.model.NoteAPI;


public class putNoteTest {
    @Test
    public void putTest(){
        Note note = new Note("cguotest10", "cguotest10contenttest");

        NoteAPI api = new NoteAPI();

        Note newNote = api.putNote(note);


        assertEquals("cguotest10", newNote.title);
    }

}
