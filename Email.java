package emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 500;
    private String alternativeEmail;
    private int defaultPasswordLength = 10;
    private String email;
    private String companySuffix = "company.com";


    // constructor to receive the first name and last name
    public Email (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

//        System.out.println("Email created: " + firstName + " " + lastName);


        // call a method asking for the department - return the department
        this.department = setDepartment();
//        System.out.println("Department: " + this.department);


        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
//        System.out.println("Your password is: " + this.password);
        
        
        // combine elements to generate email
        if (department != "none") {
        	email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//        	System.out.println("Your email is: " + email);
        }
        else {
        	email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + companySuffix;
//        	System.out.println("Your email is: " + email);
        	
        }
    }

    // ask for the department
    private String setDepartment(){
        System.out.println("Department codes: \n1 for Sales\n2 for Development\n3 for Accounting\n0 for none: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        if( depChoice == 1 ){ return "sales"; }
        else if( depChoice == 2 ) { return "dev"; }
        else if( depChoice == 3 ) { return "acct"; }
        else { return "none"; } }


    // generate a random password
    private String randomPassword (int length){
        String passwordSet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%&";

        // password is comprised of characters of a set length
        char[] password = new char[length];

        for (int i = 0; i < length; i++){
            // casting random to int
            // casting random generator to integer and multiplying
            int rand = (int) (Math.random() * passwordSet.length());

            // iterating through each position of prescribed length, 
            // and generate a character and save it as a password
            password[i] = passwordSet.charAt(rand);
//            System.out.println(password[i]);
        }
        return new String (password);
    }

    // setters
    // set the mailbox capacity
    public void setMailboxCapacity(int capacity) { this.mailboxCapacity = capacity; }

    // set alternate email
    public void setAlternateEmail(String altEmail) { this.alternativeEmail = altEmail; }

    // change the password
    public void setPassword(String password) { this.password = password; }

    // getters
    public int getMailboxCapacity() { return mailboxCapacity; }
    public String getAlternateEmail() { return alternativeEmail; } 
    public String getPassword() { return password; }
    	
    
    // showInfo() method returning name, email, and mailbox capacity
    public String showInfo() {
    	return "DISPLAY NAME: " + firstName + " " + lastName +
    			"\nCOMPANY EMAIL: " + email + 
    			"\nALTERNATE EMAIL: " + alternativeEmail + 
    			"\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
    }
}
