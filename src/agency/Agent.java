package agency;

import people.Person;

public class Agent extends Person {

    private String position;

    public Agent(String name, String position) {
        super(name);
        this.position = position;
    }

    @Override
    public String getRole() {
        return "Agent";
    }
}