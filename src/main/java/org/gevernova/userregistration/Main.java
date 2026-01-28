package org.gevernova.userregistration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        UserValidator v = new UserValidator();

        System.out.print("Enter First Name: ");
        String fn = sc.nextLine();
        System.out.println(v.firstName.validate(fn));

        System.out.print("Enter Last Name: ");
        String ln = sc.nextLine();
        System.out.println(v.lastName.validate(ln));

        System.out.print("Enter Email: ");
        String em = sc.nextLine();
        System.out.println(v.email.validate(em));

        System.out.print("Enter Mobile: ");
        String mob = sc.nextLine();
        System.out.println(v.mobile.validate(mob));

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();
        System.out.println(v.password.validate(pass));
    }
}
