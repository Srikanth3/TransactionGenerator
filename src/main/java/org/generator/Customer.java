package org.generator;

import java.text.ParseException;
import java.util.*;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;
    private String primaryContact;
    private String email;
    private double meanBuyingPower;
    private double stdBuyingPower;
    private Set<CreditCard> creditCards;

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder("Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
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

    public Customer(double ... buyingPower) throws ParseException {
        Random random = new Random();

        // Generate id
        this.id = UUID.randomUUID().toString();

        // Name Generator
        int firstNameLength = random.nextInt(7) + 5;
        int lastNameLength = random.nextInt(7) + 5;

        StringBuilder firstName = new StringBuilder("");
        for(int i = 0 ; i < firstNameLength ; i++) {
            firstName.append(((char)(random.nextInt(26) + 65)));
        }

        StringBuilder lastName = new StringBuilder("");
        for(int i = 0 ; i < lastNameLength ; i++) {
            lastName.append(((char)(random.nextInt(26) + 65)));

        }

        this.firstName = firstName.toString();
        this.lastName = lastName.toString();

        // gender
        List<String> genders = new ArrayList<>();
        genders.add("Male");
        genders.add("Female");
        genders.add("Not Specified");
        Collections.shuffle(genders);
        this.gender = genders.get(0);

        int day = random.nextInt(365) + 1 ;
        int year = random.nextInt(43) + 1956 ;
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.DAY_OF_YEAR, day);
        Date randomDob = calendar.getTime();

        // TODO: Take care of the deprecation later
        int month = randomDob.getMonth();
        String monthString = "";
        if(month < 9){
            monthString = "0" + String.valueOf(month + 1);
        }
        else monthString = String.valueOf(month + 1);

        String dateString = randomDob.toString().split(" ")[2];
        String yearString = randomDob.toString().split(" ")[5];

        this.dateOfBirth = yearString + "/" + monthString + "/" + dateString;

        // TODO: streetAddress
        // TODO: city
        // TODO: state
        // TODO: zip

        // primaryContact
        StringBuilder primaryContact = new StringBuilder("");
        primaryContact.append(random.nextInt(9) + 1);
        for(int i = 0 ; i < 9 ; i++) {
            primaryContact.append(random.nextInt(10));
        }
        this.primaryContact = primaryContact.toString();

        // email
        this.email = this.firstName.toLowerCase() + "." +
                this.lastName.toLowerCase() + "@cloudwick.com";

        // Buying Power
        if(buyingPower.length == 2) {
            this.meanBuyingPower = buyingPower[0];
            this.stdBuyingPower = buyingPower[1];
        } else {
            this.meanBuyingPower = 200.0;
            this.stdBuyingPower = 50.0;
        }

        // creditCards
        creditCards = new HashSet<>();
        // Average 1 - 10 credit cards per user
        int numberOfCreditCards = random.nextInt(10) + 1;
        for(int i = 0 ; i < numberOfCreditCards ; i++) {
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public double getMeanBuyingPower() {
        return meanBuyingPower;
    }

    public void setMeanBuyingPower(double meanBuyingPower) {
        this.meanBuyingPower = meanBuyingPower;
    }

    public double getStdBuyingPower() {
        return stdBuyingPower;
    }

    public void setStdBuyingPower(double stdBuyingPower) {
        this.stdBuyingPower = stdBuyingPower;
    }

    public Set<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void setCreditCards(Set<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}
