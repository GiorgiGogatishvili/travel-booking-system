public class Customer extends Person {

    private String email;

    public Customer(String name, String email) {
        super(name);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}