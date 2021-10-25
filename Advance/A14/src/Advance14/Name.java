package Advance14;

public class Name {
    private String f_Name;
    private String l_Name;

    public Name(String firstName, String lastName) {
        this.f_Name = firstName;
        this.l_Name = lastName;
    }

    public String getFirstName() {
        return f_Name;
    }

    public String getLastName() {
        return l_Name;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + f_Name + '\'' +
                ", lastName='" + l_Name + '\'' +
                '}';
    }
}

