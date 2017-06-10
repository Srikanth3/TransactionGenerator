package org.generator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class CreditCard {
    private String creditCardNumber;
    private String expirationDate;
    private String cvv;
    private String type;

    public CreditCard() throws ParseException {
        Random random = new Random();

        // creditCardNumber
        StringBuilder creditCardNumber = new StringBuilder("");
        creditCardNumber.append(random.nextInt(9) + 1);
        for(int i = 0 ; i < 15 ; i++) {
            creditCardNumber.append(random.nextInt(10));
        }

        this.creditCardNumber = creditCardNumber.toString();

        // expirationDate
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int month = Calendar.getInstance().get(Calendar.MONTH);
        String format = "MM/yyyy" ;
        SimpleDateFormat sdf = new SimpleDateFormat(format);

        Date dateAsObj = sdf.parse(month + "/" + year);
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateAsObj);

        // Max expiration is after 36 months
        cal.add(Calendar.MONTH, random.nextInt(37));
        Date dateAsObjAfterAMonth = cal.getTime() ;
        this.expirationDate = sdf.format(dateAsObjAfterAMonth);

        // cvv
        StringBuilder cvv = new StringBuilder("");
        for(int i = 0 ; i < 3 ; i++) {
            cvv.append(random.nextInt(10));
        }

        this.cvv = cvv.toString();

        // type
        List<String> types = new ArrayList<>();
        types.add("VISA");
        types.add("MASTERCARD");
        types.add("DISCOVER");
        types.add("AMEX");

        this.type = types.get(random.nextInt(types.size()));
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
