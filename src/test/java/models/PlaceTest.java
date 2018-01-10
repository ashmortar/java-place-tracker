package models;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/10/18.
 */
public class PlaceTest {
    @Test
    public void NewPlaceInstantiates_true() throws Exception{
        Place testPlace = new Place("rushmore", "a dakota", "it was chill");
        assertEquals(true, testPlace instanceof Place);
    }


}