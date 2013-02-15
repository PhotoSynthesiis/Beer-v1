package classes.com.example.model;

public class HobbyMatcher {
    public Person getMembers(String hobbies) {
        Person person = new Friends();
        if (hobbies.equals("Ski"))
            person.setName("Thomas Vermaelen");
        else
            person.setName("Jack Wilshere");
        return person;
    }
}
