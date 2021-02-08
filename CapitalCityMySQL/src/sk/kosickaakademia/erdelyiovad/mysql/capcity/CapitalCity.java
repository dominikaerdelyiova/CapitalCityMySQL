package sk.kosickaakademia.erdelyiovad.mysql.capcity;

public class CapitalCity extends City{
    private String city;
    private String country;
    private int population;

    public CapitalCity(String city, String country, int population) {
        super(city, country, population);
}

    @Override
    public String getCity() {
        return super.getCity();
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public int getPopulation() {
        return super.getPopulation();
    }


}
