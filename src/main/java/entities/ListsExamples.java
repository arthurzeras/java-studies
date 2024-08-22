package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListsExamples {
    ArrayList<String> countries = new ArrayList<>();
    
    public ListsExamples() {
        this.countries.add("Brazil");
        this.countries.add("Colombia");
        this.countries.add("Argentina");
        this.countries.add("Uruguay");
        this.countries.add("Bolivia");
        this.countries.add("Peru");
        this.countries.add("Panama");

        this.printList();

        // Remove countries starting with letter B
        this.countries.removeIf(country -> country.charAt(0) == 'B');

        System.out.println("-----");

        this.printList();

        System.out.println("-----");

        // Filter countries starting with letter P
        this.printList(
                this.countries.stream().filter(country -> country.charAt(0) == 'P').collect(Collectors.toList())
        );

        System.out.println("-----");

        // Get first country starting with letter P
        String foundCountry = this.countries.stream().filter(country -> country.charAt(0) == 'P').findFirst().orElse("");
        System.out.println(foundCountry);
    }

    public void printList() {
        for (String el: this.countries) {
            System.out.println(el);
        }
    }

    public void printList(List<String> list) {
        for (String el: list) {
            System.out.println(el);
        }
    }
}
