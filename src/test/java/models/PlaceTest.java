package models;

import org.junit.Test;

import static org.junit.Assert.*;


public class PlaceTest {
    @Test
    public void NewPlaceInstantiates_true() throws Exception{
        Place testPlace = new Place("rushmore", "a dakota", "it was chill");
        assertEquals(true, testPlace instanceof Place);
    }


}