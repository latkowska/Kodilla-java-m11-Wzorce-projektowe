package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void newBigmacTest() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("with sesame")
                .burgers(3)
                .sauce("BBQ")
                .ingredient("onion")
                .ingredient("cheese")
                .ingredient("garlic")
                .ingredient("tomato")
                .build();
        System.out.println(bigmac);
        //When
        String sauce = bigmac.getSauce();
        //Than
        Assert.assertEquals("BBQ", sauce);
    }
}
