package org.gevernova.addressbook;


public class Main {
    public static void main(String[] args) {

        AddressBookService service = new AddressBookService();

        service.addContact(new Contact("Aman","Kumar","Delhi","Delhi","110001"));
        service.addContact(new Contact("Ravi","Sharma","Mumbai","MH","400001"));
        service.addContact(new Contact("Neha","Singh","Delhi","Delhi","110002"));

        System.out.println("Search City Delhi:");
        service.searchByCity("Delhi").forEach(System.out::println);

        System.out.println("Count Delhi: " + service.countByCity("Delhi"));

        System.out.println("Sort By Name:");
        service.sortByName().forEach(System.out::println);

        System.out.println("Sort By City:");
        service.sortByCity().forEach(System.out::println);

        System.out.println("View By State:");
        service.viewByState().forEach((k,v)-> System.out.println(k+" -> "+v));
    }
}
