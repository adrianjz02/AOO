package jo.demo;

import java.util.List;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    
    // Attributs optionnels pour les fonctionnalités personnalisées
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private String phoneNumber;
    private String address;
    private String country;
    private List<String> favoriteSports;

    // Attributs pour l'authentification externe (Gmail, FB, ...)
    private String externalProvider;
    private String externalUserId;

    public User(String gender, String phoneNumber, String address, String country, List<String> favoriteSports, String externalProvider, String externalUserId) {
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.country = country;
        this.favoriteSports = favoriteSports;
        this.externalProvider = externalProvider;
        this.externalUserId = externalUserId;
    }
    
    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getFavoriteSports() {
        return favoriteSports;
    }

    public void setFavoriteSports(List<String> favoriteSports) {
        this.favoriteSports = favoriteSports;
    }

    public String getExternalProvider() {
        return externalProvider;
    }

    public void setExternalProvider(String externalProvider) {
        this.externalProvider = externalProvider;
    }

    public String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }
        



}

