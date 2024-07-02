package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() { //  decrementa os valores das propriedades SellIn e quality de cada um dos itens do estoque 
        for (int i = 0; i < items.length; i++) { // percorre o array de itens
            if (!items[i].name.equals("Aged Brie") // se o nome do item não for aged brie
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) { // e não for backstage passes
                if (items[i].quality > 0) { // se a qualidade for maior que 0
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) { // se o item não for do tipo Sulfuras
                        items[i].quality = items[i].quality - 1; // decrementa a qualidade desse item
                    }
                }
            } else { // se for do tipo Aged Brie e Backstage
                if (items[i].quality < 50) { // se a qualidade estiver abaixo do limite máximo, adiciona 1
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) { // no caso do Backstage Pass
                        if (items[i].sellIn < 11) { // se faltar menos de 11 dias
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1; // adiciona mais 1, ficando 2 como adicionados caso passe
                            }
                        }

                        if (items[i].sellIn < 6) { // se faltar menos de 6 dias
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1; // adiciona maid 1, ficando 3 se passar
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) { // se não for do Sulfuras
                items[i].sellIn = items[i].sellIn - 1; // decrementa 1 nos dias a ser vendido
            }

            if (items[i].sellIn < 0) { // se os dias de venda forem menores q 0 (passou da validade, tipo isso)
                if (!items[i].name.equals("Aged Brie")) { // não é Aged Brie
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) { // Não é Backstage Pass
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1; // Quando a data de venda do item tiver passado, a qualidade do item diminui duas vezes mais rapido
                                // decrementa a qualidade de novo, deixando duas vezes mais rápido
                            }
                        }
                    } else { // se for do tipo Backstage pass
                    	// A qualidade (quality) do item vai direto à 0 quando a data de venda (SellIn) tiver passado
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else { // Se for do tipo Aged Brie
                    if (items[i].quality < 50) { // se não for maior que o máximo
                    	// aumenta sua qualidade (quality) em 1 unidade a medida que envelhece
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}
