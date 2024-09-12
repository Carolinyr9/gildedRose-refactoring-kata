package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }
    
    public void update() {
    	for (Item item : items) {
    		item = checkQuality(item);
		item.updateStatus();
	}
    }
    
    private Item checkQuality(Item item) {
    	if(item.quality < 0) {
    		item.quality = 0;
    	} 
    	return item;
    }
}
