package case_study_furama.model;

import java.time.LocalDate;

public abstract class Persons {
    private String name;
    private LocalDate birthDate;
    private String gender;
    private String IDCard;
    private String phoneNumber;

    public Persons() {
    }

    private String email;

    public Persons(String name, LocalDate birthDate, String gender, String IDCard, String phoneNumber, String email) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.IDCard = IDCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate =birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persons {" +
                " name= " + name +
                " birthDate= " + birthDate +
                " gender= " + gender +
                " IDCard= " + IDCard +
                " phoneNumber= " + phoneNumber +
                " email= " + email +
                '}';
    }

    public String getInfoToPerson() {
        return getName() + "," + getBirthDate() + "," + getGender() + ","
                + getIDCard() + "," + getPhoneNumber() + "," + getEmail();
    }
}
