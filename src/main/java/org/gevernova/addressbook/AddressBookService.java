package org.gevernova.addressbook;


import java.util.*;
import java.util.stream.Collectors;

public class AddressBookService {

    // Stores all contacts in the address book
    ArrayList<Contact> contacts = new ArrayList<>();

    // Adds a contact if it does not already exist in the address book
    public boolean addContact(Contact contact) {
        boolean exists = contacts.stream()
                .anyMatch(c -> c.equals(contact));
        if (exists) return false;
        contacts.add(contact);
        return true;
    }

    // Returns a list of contacts that belong to the given city
    public List<Contact> searchByCity(String city) {
        return contacts.stream()
                .filter(c -> c.city.equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    // Returns a list of contacts that belong to the given state
    public List<Contact> searchByState(String state) {
        return contacts.stream()
                .filter(c -> c.state.equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }

    // Groups and returns contacts mapped by city
    public Map<String, List<Contact>> viewByCity() {
        return contacts.stream()
                .collect(Collectors.groupingBy(c -> c.city));
    }

    // Groups and returns contacts mapped by state
    public Map<String, List<Contact>> viewByState() {
        return contacts.stream()
                .collect(Collectors.groupingBy(c -> c.state));
    }

    // Returns the total number of contacts in the specified city
    public long countByCity(String city) {
        return contacts.stream()
                .filter(c -> c.city.equalsIgnoreCase(city))
                .count();
    }

    // Returns the total number of contacts in the specified state
    public long countByState(String state) {
        return contacts.stream()
                .filter(c -> c.state.equalsIgnoreCase(state))
                .count();
    }

    // Returns contacts sorted alphabetically by full name
    public List<Contact> sortByName() {
        return contacts.stream()
                .sorted(Comparator.comparing(Contact::getFullName))
                .collect(Collectors.toList());
    }

    // Returns contacts sorted alphabetically by city
    public List<Contact> sortByCity() {
        return contacts.stream()
                .sorted(Comparator.comparing(c -> c.city))
                .collect(Collectors.toList());
    }

    // Returns contacts sorted alphabetically by state
    public List<Contact> sortByState() {
        return contacts.stream()
                .sorted(Comparator.comparing(c -> c.state))
                .collect(Collectors.toList());
    }

    // Returns contacts sorted by zip code
    public List<Contact> sortByZip() {
        return contacts.stream()
                .sorted(Comparator.comparing(c -> c.zip))
                .collect(Collectors.toList());
    }
}

