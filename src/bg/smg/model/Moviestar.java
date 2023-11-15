package bg.smg.model;

import java.util.Date;

public class Moviestar {
    private String name;
    private String address;
    private char gender;
    private Date birthdate;

    public Moviestar() {
    }

    public Moviestar(String name, String address, char gender, Date birthdate) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.birthdate = birthdate;
    }
}
