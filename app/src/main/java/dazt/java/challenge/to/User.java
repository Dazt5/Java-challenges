package dazt.java.challenge.to;

public class User {

    private final Long id;

    private final String name;

    private final String lastName;

    private final Boolean isActive;

    public User(Long id, String name, String lastName, Boolean isActive) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.isActive = isActive;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getActive() {
        return isActive;
    }
}
