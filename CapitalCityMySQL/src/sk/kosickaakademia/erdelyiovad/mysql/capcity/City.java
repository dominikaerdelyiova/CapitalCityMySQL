package sk.kosickaakademia.erdelyiovad.mysql.capcity;

public abstract class City {
      this.population = population;
}

    public City(String name, String population, int country) {
        this.name = name;
        this.population = population;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public abstract String getCity();

    public abstract int getCountry();

    public abstract String getPopulation();
}
