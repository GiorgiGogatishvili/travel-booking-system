package people;

public class Customer extends Person {

    private String email;


    public Customer(String name) {
        super(name);
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", email=" + email;
    }
}