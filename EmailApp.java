package emailapp;


/*
* Email Application creating email accounts for new hires
*
* 1. Generate an email with the following syntax: firstname.lastname@department.company.com
* 2. Determine the department(sales, development, accounting), if none leave blank
* 3. Generate a random String for a password
* 4. Have set methods to change the password, set the mailbox capacity, and define an alternative email address
* 5. have get methods to display name, email, and mailbox capacity
*
* */
public class EmailApp {
    public static void main(String[] args) {
        Email e2 = new Email("Thanh", "Nguyen");
        e2.setAlternateEmail("thn@gmail.com");
        System.out.println(e2.showInfo());
        
    }
}
