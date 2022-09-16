package generic.comparable;

public class Country implements Comparable<Country> {
    private String name;
    private double area;
    private double population;

    public Country(String name, double area, double population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getPopulation() {
        return population;
    }

    @Override
    public int compareTo(Country other) {
        if (this.area < other.area) return -1;
        if (this.area > other.area) return 1;
        return 0;
    }
}
