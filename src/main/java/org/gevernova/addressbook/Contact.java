package org.gevernova.addressbook;


public class Contact {

    String firstName;
    String lastName;
    String city;
    String state;
    String zip;

    public Contact(String firstName, String lastName, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Contact)) return false;
        Contact c = (Contact) obj;
        return this.getFullName().equalsIgnoreCase(c.getFullName());
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + city + " " + state + " " + zip;
    }
}

