package com.gildedrose;

public class BackstagePasses extends Item {
	private Integer minimumQuality;
	private Integer maximumQuality;

	public BackstagePasses(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.minimumQuality = 0;
		this.maximumQuality = 50;
	}

	public void updateStatus() {
		if(sellIn > 0) {
			increaseQuality();
		} else {
			decreaseQualityExpiredDeadline();
		}
		
		decreasesSellIn();
		checksMaximumQuality();
	}
	
	private void increaseQuality() {
		if (sellIn < 6) {
            quality += 3;
        } else 
        	if (sellIn < 11) {
        		quality += 2;
        	} else {
        		quality += 1;
        	}
	}
	
	private void decreaseQualityExpiredDeadline() {
		if(quality > minimumQuality) {
			quality = minimumQuality;
		}
	}
	
	private void decreasesSellIn() {
		this.sellIn -= 1;
	}
	
	private void checksMaximumQuality() {
		if(quality >= maximumQuality) {
			quality = maximumQuality;
		}
	}
}
