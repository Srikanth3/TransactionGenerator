package org.generator;

import java.util.*;

public class Merchant {
    private String name;
    private List<String> types;
    private String street;
    private String city;
    private String state;
    private String zip;

    public Merchant() {
        Random random = new Random();

        // Merchant Name
        int nameLength = random.nextInt(15) + 7;

        StringBuilder name = new StringBuilder("");
        for(int i = 0 ; i < nameLength ; i++) {
            name.append(((char)(random.nextInt(26) + 65)));
        }

        this.name = name.toString();

        // Types of transactions Merchant Supports
        List<String> types = new ArrayList<>();
        types.add("Travel");
        types.add("Restaurants");
        types.add("Electronics");
        types.add("Hotels");
        types.add("Movie");
        types.add("Furniture");
        types.add("Automobile");
        types.add("Sports");
        types.add("Others");

        int numberOfTypes = random.nextInt(types.size()) + 1;
        this.types = new ArrayList<>();
        for(int i = 0 ; i < numberOfTypes ; i++) {
            this.types.add(types.get(random.nextInt(types.size())));
        }

        // TODO: Random Merchant Address
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "name='" + name + '\'' +
                ", type=" + types +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setType(List<String> types) {
        this.types = types;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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
}
