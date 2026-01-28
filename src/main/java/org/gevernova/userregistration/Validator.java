package org.gevernova.userregistration;

@FunctionalInterface
interface Validator {
    boolean validate(String input);
}

