package Emial;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String passWord;
    private String department;
    private int mailboxcapacity;
    private String alternativeEmail;

    // construtor que recebe o primeiro e ultimo nome

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created:" + firstName + " " + lastName);

        // pede o departamento
        this.department = setDepartment();
        System.out.println("Department:" + this.department);

        // random password
        this.passWord = randomPassword();
        System.out.println("Your password is:" + this.passWord);

    }

    // pedir o departamento
    private String setDepartment() {
        System.out.println("Enter the department \n1 for sales \n2 for developers");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "developers";
        } else {
            return "Invalid department";
        }
    }

    // gerar senha aleatória
    private String randomPassword() {
        String pass = "ABC345";
        for (int i = 0; i < 10; i++) {
            pass += (int) (Math.random() * 10);
        }
        return pass;
    }

    // set a capacidade da mailBox

    // mudar a passWord
}