package org.generator;

import java.text.ParseException;
import java.util.*;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String primaryContact;
    private String email;
    private Set<CreditCard> creditCards;

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder("Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                ", primaryContact='" + primaryContact + '\'' +
                ", email='" + email + '\'' +
                ", creditCards=[");

        for(CreditCard creditCard : creditCards) {
            returnString.append(creditCard + "|");
        }

        returnString.deleteCharAt(returnString.length() - 1);
        returnString.append("]}");

        return returnString.toString();
    }

    public Customer() throws ParseException {
        Random random = new Random();

        // Name Generator
        int firstNameLength = random.nextInt(7) + 5;
        int lastNameLength = random.nextInt(7) + 5;

        StringBuilder firstName = new StringBuilder("");
        for(int i = 0 ; i < firstNameLength ; i++) {
            firstName.append(random.nextInt(26) + 65);
        }

        StringBuilder lastName = new StringBuilder("");
        for(int i = 0 ; i < lastNameLength ; i++) {
            lastName.append(random.nextInt(26) + 65);

        }

        this.firstName = firstName.toString();
        this.lastName = lastName.toString();

        // dateOfBirth
        // streetAddress
        // city
        // state
        // zip

        // primaryContact
        StringBuilder primaryContact = new StringBuilder("");
        primaryContact.append(random.nextInt(9) + 1);
        for(int i = 0 ; i < 9 ; i++) {
            primaryContact.append(random.nextInt(10));
        }
        this.primaryContact = primaryContact.toString();

        // email
        this.email = this.firstName + "." + this.lastName + "@cloudwick.com";

        // creditCards
        creditCards = new HashSet<>();
        // Average 1 - 10 credit cards per user
        int numberOdfCreditCards = random.nextInt(10) + 1;
        for(int i = 0 ; i < numberOdfCreditCards ; i++) {
            creditCards.add(new CreditCard());
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPrimaryContact() {
        return primaryContact;
    }

    public void setPrimaryContact(String primaryContact) {
        this.primaryContact = primaryContact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(Set<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}
