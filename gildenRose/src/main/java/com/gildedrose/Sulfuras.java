package com.gildedrose;

public class Sulfuras extends Item {
	public Sulfuras(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	public void updateStatus() {
		this.quality = 80;
    }
}
