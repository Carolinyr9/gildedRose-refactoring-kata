package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("\tGilded Rose Merchandise\n");

        Item[] items = new Item[] {
        		new CommonItem("+5 Dexterity Vest", 10, 20),
        		new AgedBrie("Aged Brie", 2, 0),
        		new CommonItem("Elixir of the Mongoose", 5, 7),
        		new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80),
        		new Sulfuras("Sulfuras, Hand of Ragnaros", -1, 80),
        		new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 15, 20),
        		new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 10, 49),
        		new BackstagePasses("Backstage passes to a TAFKAL80ETC concert", 5, 49),
        		new Conjured("Conjured Mana Cake", 3, 6) 
        };

        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("\t-------- Day " + (i + 1) + " --------");
            System.out.println("Structure: name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.update();
        }
    }

}
