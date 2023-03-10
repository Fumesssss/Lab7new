package edu.ucsd.cse110.sharednotes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.ucsd.cse110.sharednotes.model.Note;
import edu.ucsd.cse110.sharednotes.model.NoteAPI;

public class getNoteTest {
    @Test
    public void getTest(){
        String title = "cguotest5";

        NoteAPI api = new NoteAPI();

        Note newNote = api.getNote(title);

        System.out.println(newNote.title+" "+newNote.content+" "+newNote.version);
        assertEquals("1","1");
    }
}
