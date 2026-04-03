package com.exception_handling;

class TestCustomException {
    static void checkAge(int age) throws MyException {
        if (age < 18) {
            throw new MyException("Not eligible");
        } else {
            System.out.println("Eligible");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}