package com.hackerrank.java.subdomain.introduction;

import com.hackerrank.java.subdomain.introduction.CurrencyFormatter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyFormatterTest {
    private CurrencyFormatter currencyFormatter;

    @Before
    public void setup() {
        currencyFormatter   =   new CurrencyFormatter();
    }

    @Test
    public void covertToUs_hackerrank_sample() {
        currencyFormatter.setPayment(12324.134);
        assertEquals("$12,324.13", currencyFormatter.covertToUs());
    }

    @Test
    public void covertToIndia_hackerrank_sample() {
        currencyFormatter.setPayment(12324.134);
        assertEquals("Rs.12,324.13", currencyFormatter.covertToIndia());
    }

    @Test
    public void covertToChina_hackerrank_sample() {
        currencyFormatter.setPayment(12324.134);
        assertEquals("￥12,324.13", currencyFormatter.covertToChina());
    }

    @Test
    public void covertToFrance_hackerrank_sample() {
        currencyFormatter.setPayment(12324.134);
        assertEquals("12 324,13 €", currencyFormatter.covertToFrance());
    }
}