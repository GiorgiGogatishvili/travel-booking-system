package people;

public class Customer extends Person {

    private String email;

    public Customer(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public String getRole() {
        return "Customer";
    }

    @Override
    public String toString() {
        return "Customer: " + name + ", email=" + email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer c = (Customer) o;
        return name.equals(c.name) && email.equals(c.email);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + email.hashCode();
    }
}