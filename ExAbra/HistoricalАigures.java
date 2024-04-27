package ExAbra;

public class HistoricalАigures {
    private String name;
    private String country;
    private int yearOfBirth;
    private int yearOfDeath;

    public HistoricalАigures(String country, String name, int yearOfBirth, int yearOfDeath) {
        this.country = country;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.yearOfDeath = yearOfDeath;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getYearOfDeath() {
        return yearOfDeath;
    }

    @Override
    public String toString() {
        return "HistoricalАigures{" +
                "country='" + country + '\'' +
                ", name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", yearOfDeath=" + yearOfDeath +
                '}';
    }
}
