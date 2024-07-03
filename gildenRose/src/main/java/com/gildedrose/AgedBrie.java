package com.gildedrose;

public class AgedBrie extends Item {
	private Integer minimumQuality;
	private Integer maximumQuality;

	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.maximumQuality = 50;
		this.minimumQuality = 0;
	}

	public void updateStatus() {
		if(sellIn > 0) {
			increaseQuality();
		} else {
			decreaseQualityExpiredDeadline();
		}
		decreasesSellIn();
	}
	
	private void increaseQuality() {
		if(quality < maximumQuality) {
			this.quality += 1;
		}
	}
	
	private void decreasesSellIn() {
		this.sellIn -= 1;
	}

	private void decreaseQualityExpiredDeadline() {
		if(quality > minimumQuality) {
			this.sellIn -= 1;
		}
	}
	
}
