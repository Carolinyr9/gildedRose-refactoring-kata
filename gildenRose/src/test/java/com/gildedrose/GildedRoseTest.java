package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

	@Test
    void checkQualityNegativeFoo() {
    	// teste para verificar se a qualidade não fica negativa
    	Integer sellIn = 4;
    	Integer quality = 0;
    	Integer expectedReturn = 0;
    	
        Item[] items = new Item[] { new Item("foo", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < sellIn; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].quality;
        assertEquals(expectedReturn, returnActual);
    }
    
    @Test
    void checkQualityBiggerThanFiftyAgedBrie() {
    	// Teste para verificar se quality de Aged Brie não muda quando é maior que 50.
    	Integer sellIn = 10;
    	Integer quality = 54;
    	Integer expectedReturn = 54;
    	
        Item[] items = new Item[] { new Item("Aged Brie", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < sellIn; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].quality;
        assertEquals(expectedReturn, returnActual);
    }
    
    @Test
    void ckeckQualityBiggerThanFiftyBackstagePass() {
    	// Teste para verificar se quality de Backstage Pass não muda quando é maior que 50.
    	Integer sellIn = 10;
    	Integer quality = 54;
    	Integer expectedReturn = 54;
    	
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < sellIn; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].quality;
        assertEquals(expectedReturn, returnActual);
    }
    
    @Test
    void qualityReduceMoreFastFoo() {
    	// Teste para verificar se a qualidade de Foo diminui 2x mais rápido em 10 dias quando o sellIn é 0
    	Integer sellIn = 0;
    	Integer quality = 10;
    	Integer expectedReturn = 0;
    	
        Item[] items = new Item[] { new Item("foo", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < 5; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].quality;
        assertEquals(expectedReturn, returnActual);
    }
    
    @Test
    void checkQualityReduceToZeroBackstagePass() {
    	// Teste para verificar se a qualidade de Backstage pass vai a zero quando o sellIn é maior que 0
    	Integer sellIn = 4;
    	Integer quality = 10;
    	Integer expectedReturn = 0;
    	
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < 5; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].quality;
        assertEquals(expectedReturn, returnActual);
    }
    
    @Test
    void checkDecreasedValues() {
    	// Teste para verificar se os valores de quality e sellIn são decrementados ao fim do dia
    	Integer sellIn = 10;
    	Integer quality = 10;
    	Integer expectedReturn = 0;
    	
        Item[] items = new Item[] { new Item("foo", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < sellIn; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual1 = app.items[0].quality;
        Integer returnActual2 = app.items[0].sellIn;
        assertEquals(expectedReturn, returnActual1);
        assertEquals(expectedReturn, returnActual2);
    }
    
    @Test
    void checkIncreaseQualityAgedBrie() {
    	// Teste para verificar se os valores de quality de Aged Brie aumentam a medida que sellin se aproxima de 0
    	Integer sellIn = 10;
    	Integer quality = 10;
    	Integer expectedReturn = 20;
    	
        Item[] items = new Item[] { new Item("Aged Brie", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < 10; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].quality;
        assertEquals(expectedReturn, returnActual);
    }
    
    @Test
    void checkSellIn12DaysBackstagePass() {
    	// Teste para verificar se os valores de quality a de Backstage Pass aumentam 2x quando sellIn é menor que 11, e 3x quando é menor que 6
    	Integer sellIn = 12;
    	Integer quality = 10;
    	Integer expectedReturn = 37;
    	
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < sellIn; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].quality;
        assertEquals(expectedReturn, returnActual);
    }
    
    @Test
    void checkSulfurasDontChange() {
    	// Teste para verificar se quality de Sulfuras não muda
    	Integer sellIn = 10;
    	Integer quality = 10;
    	Integer expectedReturn = 10;
    	
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < sellIn; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].quality;
        assertEquals(expectedReturn, returnActual);
    }
    
   /*@Test
    void checkConjuredDecreseQualityMoreFast() {
    	// Teste para verificar se os valores de quality do item Conjurede diminuem 2x mais rápido
    	Integer sellIn = 10;
    	Integer quality = 10;
    	Integer expectedReturn = 0;
    	
        Item[] items = new Item[] { new Item("Conjured", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < 5; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].quality;
        assertEquals(expectedReturn, returnActual);
    }*/
    
    @Test
    void checkSellInDecreaseFoo() {
    	// Teste para verificar se sellIn diminui em Foo
    	Integer sellIn = 10;
    	Integer quality = 10;
    	Integer expectedReturn = 5;
    	
        Item[] items = new Item[] { new Item("foo", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < 5; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].sellIn;
        assertEquals(expectedReturn, returnActual);
    }
    
    @Test
    void checkSellInDecreaseBackstagePass() {
    	// Teste para verificar se sellIn diminui em Backstage Pass
    	Integer sellIn = 10;
    	Integer quality = 10;
    	Integer expectedReturn = 5;
    	
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < 5; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].sellIn;
        assertEquals(expectedReturn, returnActual);
    }
    
    @Test
    void checkSellInDecreaseSulfuras() {
    	// Teste para verificar se sellIn de Sulfuras não diminue 
    	Integer sellIn = 10;
    	Integer quality = 10;
    	Integer expectedReturn = 10;
    	
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < 5; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].sellIn;
        assertEquals(expectedReturn, returnActual);
    }
    
    @Test
    void checkSellInDecreaseAgedBrie() {
    	// Teste para verificar se sellIn diminui em Aged Brie
    	Integer sellIn = 10;
    	Integer quality = 10;
    	Integer expectedReturn = 5;
    	
        Item[] items = new Item[] { new Item("Aged Brie", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < 5; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].sellIn;
        assertEquals(expectedReturn, returnActual);
    }
    
    /*@Test
    void checkSellInDecreaseConjured() {
    	// Teste para verificar se sellIn diminui em Conjured
    	Integer sellIn = 10;
    	Integer quality = 10;
    	Integer expectedReturn = 5;
    	
        Item[] items = new Item[] { new Item("Conjured", sellIn, quality) };
        GildedRose app = new GildedRose(items);
        
        for(int i = 0; i < 5; i++) {
        	app.updateQuality();
        }
        
        Integer returnActual = app.items[0].sellIn;
        assertEquals(expectedReturn, returnActual);
    }*/

}