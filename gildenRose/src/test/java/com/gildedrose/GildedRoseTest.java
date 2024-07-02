package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() { // método foo é um método de teste 
        Item[] items = new Item[] { new Item("foo", 0, 0) }; // Aqui, um array de Item com um único item é criado. Este item tem o nome "foo", um valor de sellIn de 0 e uma quality de 0.
        GildedRose app = new GildedRose(items); // Inicialização do objeto GildedRose
        app.updateQuality(); // Chamada ao método updateQuality
        assertEquals("foo", app.items[0].name); // Esta linha verifica se o nome do primeiro item no array items do objeto GildedRose é igual a "fixme". Se não for, o teste falhará
    }

}
