package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;


public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country firstCountry = new Country (new BigDecimal("99999999901234567890"));
        Country secondCountry = new Country (new BigDecimal("79999998901234567890"));
        Country thirdCountry = new Country (new BigDecimal("68999999901234567891"));
        Country fourthCountry = new Country (new BigDecimal("57999999901834567890"));
        Country fifthCountry = new Country (new BigDecimal("88999999901234577890"));
        Country sixthCountry = new Country (new BigDecimal("49999999901234567890"));

        Continent firstContinent = new Continent();
        firstContinent.addCountry(firstCountry);
        firstContinent.addCountry(secondCountry);

        Continent secondContinent = new Continent();
        secondContinent.addCountry(thirdCountry);
        secondContinent.addCountry(fourthCountry);

        Continent thirdContinent = new Continent();
        thirdContinent.addCountry(fifthCountry);
        thirdContinent.addCountry(sixthCountry);

        World world = new World();
        world.addContinent(firstContinent);
        world.addContinent(secondContinent);
        world.addContinent(thirdContinent);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        BigDecimal expectedPeople = new BigDecimal("445999998408007417341");

        //Then
        Assert.assertEquals(expectedPeople, totalPeople);
    }

}
