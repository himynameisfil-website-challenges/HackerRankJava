package com.hackerrank.java.subdomain.introduction;
import java.util.*;
import java.text.*;


public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        CurrencyFormatter   currencyFormatter   =   new CurrencyFormatter(payment);
        String us       =   currencyFormatter.covertToUs();
        String india    =   currencyFormatter.covertToIndia();
        String china    =   currencyFormatter.covertToChina();
        String france   =   currencyFormatter.covertToFrance();

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

class CurrencyFormatter {
    private double payment;

    public CurrencyFormatter() {
        this.payment    =   0;
    }

    public CurrencyFormatter(double number) {
        this.payment =   number;
    }

    public void setPayment(double payment) {
        this.payment    =   payment;
    }

    public String covertToUs() {
        NumberFormat currencyFormat =   NumberFormat.getCurrencyInstance(Locale.US);
        return currencyFormat.format(this.payment);
    }
    public String covertToIndia() {
        NumberFormat currencyFormat =   NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        return currencyFormat.format(this.payment);
    }
    public String covertToChina() {
        NumberFormat currencyFormat =   NumberFormat.getCurrencyInstance(Locale.CHINA);
        return currencyFormat.format(this.payment);
    }
    public String covertToFrance() {
        NumberFormat currencyFormat =   NumberFormat.getCurrencyInstance(Locale.FRANCE);
        return currencyFormat.format(this.payment);
    }
}