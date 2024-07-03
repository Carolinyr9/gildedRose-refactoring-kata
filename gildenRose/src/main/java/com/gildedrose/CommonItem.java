package com.gildedrose;

public class CommonItem extends Item {
	private Integer minimumQuality;

	public CommonItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		this.minimumQuality = 0;
	}

	public void updateStatus() {
		if(sellIn > 0) {
			decreasesQuality();
		} else {
			decreaseQualityExpiredDeadline();
		}
		decreasesSellIn();
	}

	private void decreasesQuality() {
		if(quality > minimumQuality) {
			this.quality -= 1;
		}
	}
	
	private void decreaseQualityExpiredDeadline() {
		if(quality > minimumQuality) {
			this.quality -= 2;
		}
	}
	
	private void decreasesSellIn() {
		this.sellIn -= 1;
	}
}
