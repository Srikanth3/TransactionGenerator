package org.generator;

import java.util.Random;

public class Merchant {
    private String merchantName;
    private String merchantStreet;
    private String merchantCity;
    private String merchantState;
    private String merchantZip;

    public Merchant() {
        Random random = new Random();

        // Merchant Name
        int merchantNameLength = random.nextInt(15) + 7;

        StringBuilder merchantName = new StringBuilder("");
        for(int i = 0 ; i < merchantNameLength ; i++) {
            merchantName.append(((char)(random.nextInt(26) + 65)));
        }

        this.merchantName = merchantName.toString();

        // TODO: Random Merchant Address
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "merchantName='" + merchantName + '\'' +
                ", merchantStreet='" + merchantStreet + '\'' +
                ", merchantCity='" + merchantCity + '\'' +
                ", merchantState='" + merchantState + '\'' +
                ", merchantZip='" + merchantZip + '\'' +
                '}';
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getMerchantStreet() {
        return merchantStreet;
    }

    public void setMerchantStreet(String merchantStreet) {
        this.merchantStreet = merchantStreet;
    }

    public String getMerchantCity() {
        return merchantCity;
    }

    public void setMerchantCity(String merchantCity) {
        this.merchantCity = merchantCity;
    }

    public String getMerchantState() {
        return merchantState;
    }

    public void setMerchantState(String merchantState) {
        this.merchantState = merchantState;
    }

    public String getMerchantZip() {
        return merchantZip;
    }

    public void setMerchantZip(String merchantZip) {
        this.merchantZip = merchantZip;
    }
}
