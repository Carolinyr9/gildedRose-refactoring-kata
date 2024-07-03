package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {
    @Test
    void foo() { 
        Item[] items = new Item[] { new Item("foo", 0, 0) }; 
        GildedRose app = new GildedRose(items); 
        app.update();
        assertEquals("foo", app.items[0].name); 
    }

    @Test
    void isCorrectQuality() {
    	Item[] items = new Item[] { new Item("item", 0, 50) };        
    	GildedRose app = new GildedRose(items); 
        app.update(); 
        assertEquals(48, app.items[0].quality); 
    }
}
