package org.gevernova.userregistration;

public class UserValidator {

    Validator firstName = name ->
            name.matches("^[A-Z][a-z]{2,}$");

    Validator lastName = name ->
            name.matches("^[A-Z][a-z]{2,}$");

    Validator email = mail ->
            mail.matches("^[a-z]+([.+_-][a-z0-9]+)*@[a-z0-9]+\\.[a-z]{2,}(\\.[a-z]{2,})?$");

    Validator mobile = mob ->
            mob.matches("^[0-9]{2}\\s[0-9]{10}$");

    Validator password = pass ->
            pass.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]).{8,}$");

}
