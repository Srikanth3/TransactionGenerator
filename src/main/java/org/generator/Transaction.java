package org.generator;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Transaction {
    private Customer customer;
    private CreditCard creditCard;
    private Merchant merchant;
    private double amount;
    private Timestamp timestamp;
    private String transactionType;
    private boolean flag;
    private double latitude;
    private double longitude;

    // NW: 48.076515, -124.100106
    // SW: 32.986790, -117.249322
    // NE: 44.846800, -67.010240
    // SE: 25.121644, -80.802049

    // Latitude : 25 -> 48
    // Longitude: -124 -> -67

    public Transaction(double meanAmount, double standardDeviationAmount)
            throws ParseException {
        // TODO: Randomly select from the Customers

        // TODO: Randomly select from one of the Credit Cards of the Customers

        // TODO: Randomly select from Merchants

        // TODO: Random Amount based on mean and standard deviation

        // TODO: Random timestamp

        // TODO: Random Merchant Name

        // TODO: Random Merchant Address

        List<String> transactionTypes = new ArrayList<>();
        transactionTypes.add("Travel");
        transactionTypes.add("Restaurants");
        transactionTypes.add("Electronics");
        transactionTypes.add("Hotels");
        transactionTypes.add("Movie");
        transactionTypes.add("Furniture");
        transactionTypes.add("Automobile");
        transactionTypes.add("Sports");
        transactionTypes.add("Others");
        Collections.shuffle(transactionTypes);

        this.transactionType = transactionTypes.get(0);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public Merchant getMerchant() {
        return  merchant;
    }

    public void setMerchant(Merchant merchant) {
        this.merchant = merchant;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amout) {
        this.amount = amout;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
