package com.rdruzhchenko;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaCalculatorTest {

    @Test
    public void calculateA() {
        // Given
        InputData inputData = new InputData();
        inputData.maxSlices = 17;
        inputData.slices = new Integer[] { 2, 5, 6, 8 };
        PizzaCalculator pizzaCalculator = new PizzaCalculator();

        // When
        OutputData outputData = pizzaCalculator.calculate(inputData);

        // Then
        assertEquals(3, outputData.pizzasIndexes.length);
        assertEquals(0, outputData.pizzasIndexes[0]);
        assertEquals(2, outputData.pizzasIndexes[1]);
        assertEquals(3, outputData.pizzasIndexes[2]);
    }

    @Test
    public void calculateB() {
        // Given
        InputData inputData = new InputData();
        inputData.maxSlices = 100;
        inputData.slices = new Integer[] { 4, 14, 15, 18, 29, 32, 36, 82, 95, 95 };
        PizzaCalculator pizzaCalculator = new PizzaCalculator();

        // When
        OutputData outputData = pizzaCalculator.calculate(inputData);

        // Then
        assertEquals(2, outputData.pizzasIndexes.length);
        assertEquals(18, outputData.pizzasIndexes[0]);
        assertEquals(82, outputData.pizzasIndexes[1]);
    }
}