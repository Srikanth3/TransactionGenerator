package org.generator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class GeneratorTester {
    public static void main(String ... args) throws ParseException {
        long numberOfCustomers = 0;

        if(args.length < 2) {
            numberOfCustomers = 10L;
        } else {
            numberOfCustomers = Long.parseLong(args[0]);
        }

        GeneratorTester generatorTester = new GeneratorTester();
        List<Customer> customers = generatorTester.generate(numberOfCustomers);

        for(Customer customer: customers) {
            System.out.println(customer);
        }
    }

    List<Customer> generate(long numberOfCustomers) throws ParseException {
        List<Customer> customers = new ArrayList<>();
        for(long i = 0 ; i < numberOfCustomers ; i++) {
            customers.add(new Customer());
        }
        return customers;
    }
}
