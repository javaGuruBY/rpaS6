package by.jrr.start;

import org.junit.Test;

import static org.junit.Assert.*;

public class StockTest {
    Stock stock = new Stock("Google", 10);

    @Test
    public void printInformation1() {
        assertEquals("Google", stock.getName());

    }

    @Test
    public void printInformation2() {
        assertEquals(10.0, stock.getCurrentPrice(), 0.0);

    }

    @Test
    public void updatePrice1() {
        stock.updatePrice(7.0);
        assertEquals(7.0, stock.getCurrentPrice(), 0.0);
    }

    @Test
    public void printInformation3() {
        stock.updatePrice(7.0);
        stock.updatePrice(15.0);
        stock.updatePrice(14.0);
        assertEquals("Company = \"Google\", Current Price = 14.0, Min Price = 7.0, Max Price = 15.0", stock.printInformation());
    }
}