package Emial;

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
    }

    // pedir o departamento
    public void setDepartment(String department) {
        if (department != null && department.length() > 0) {
            this.department = department;
        } else {
            System.out.println("Department is required");
        }
    }

    // set a capacidade da mailBox

    // mudar a passWord
}