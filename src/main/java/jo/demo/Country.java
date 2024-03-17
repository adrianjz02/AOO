package jo.demo;

public class Country {
    private int countryId;
    private String nameCountry;
    private String capital;
    private int population;
    private String relevantPoint;

    // Constructeur
    public Country(int countryId, String nameCountry, String capital, int population, String relevantPoint) {
        this.countryId = countryId;
        this.nameCountry = nameCountry;
        this.capital = capital;
        this.population = population;
        this.relevantPoint = relevantPoint;
    }

    // Getter pour countryId
    public int getCountryId() {
        return countryId;
    }

    // Setter pour countryId
    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    // Getter pour nameCountry
    public String getNameCountry() {
        return nameCountry;
    }

    // Setter pour nameCountry
    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    // Getter pour capital
    public String getCapital() {
        return capital;
    }

    // Setter pour capital
    public void setCapital(String capital) {
        this.capital = capital;
    }

    // Getter pour population
    public int getPopulation() {
        return population;
    }

    // Setter pour population
    public void setPopulation(int population) {
        this.population = population;
    }

    // Getter pour relevantPoint
    public String getRelevantPoint() {
        return relevantPoint;
    }

    // Setter pour relevantPoint
    public void setRelevantPoint(String relevantPoint) {
        this.relevantPoint = relevantPoint;
    }
}

