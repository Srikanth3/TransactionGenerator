package org.generator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static void main(String ... args) throws ParseException {
        long numberOfCustomers = 0;
        long numberOfTransactions = 0;

        if(args.length < 2) {
            numberOfCustomers = 100L;
            numberOfTransactions = 1000L;
        } else {
            numberOfCustomers = Long.parseLong(args[0]);
            numberOfTransactions = Long.parseLong(args[1]);
        }

        Generator generator = new Generator();
        List<Transaction> transactions =
                generator.generate(numberOfCustomers, numberOfTransactions);
    }

    List<Transaction> generate(long numberOfCustomers, long numberOfTransactions)
            throws ParseException {
        List<Transaction> transactions = new ArrayList<>();
        for(long i = 0 ; i < numberOfTransactions ; i++) {
            Transaction transaction = new Transaction(100, 10);
        }

        return transactions;
    }
}
