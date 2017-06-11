package org.generator;

import java.util.*;

public class Merchant {
    private String name;
    private Set<String> type;
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
        Collections.shuffle(types);
        int numberOfTypes = random.nextInt(types.size()) + 1;
        for(int i = 0 ; i < numberOfTypes ; i++) {
            this.type.add(types.get(i));
        }

        // TODO: Random Merchant Address
    }

    @Override
    public String toString() {
        return "Merchant{" +
                "name='" + name + '\'' +
                ", type=" + type +
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

    public Set<String> getType() {
        return type;
    }

    public void setType(Set<String> type) {
        this.type = type;
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
