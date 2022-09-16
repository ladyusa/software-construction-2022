package measurer;

public class Country {
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
}
