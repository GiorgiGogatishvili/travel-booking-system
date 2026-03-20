package agency;

import people.Person;

public class Agent extends Person {

    private String position;
    private int experienceYears;

    public Agent(String name, String position) {
        super(name);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String getRole() {
        return "Agent";
    }
}