package plataforma.clase2;

import java.util.Date;

public class User {
   private final String id;
   private final String name;
   private  final String lastName;
   private Date birthdate;

    public User(String id, String name, String lastName, Date birthdate) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthdate() {
        return birthdate;
    }
}
