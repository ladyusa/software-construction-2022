package genericcollection;

public class Country implements Measurable, Comparable<Country> {
    private String name;
    private double area;
    private int population;
    private double gdp;

    public Country(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public Country(String name, double area, int population) {
        this.name = name;
        this.area = area;
        this.population = population;
    }

    public int compareTo(Country other) {
//        return this.name.compareTo(other.name);

        if (this.area < other.area) return -1;
        if (this.area > other.area) return 1;
        return 0;
    }

    public double getMeasure() {
        return area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getGdp() {
        return gdp;
    }

    public void setGdp(double gdp) {
        this.gdp = gdp;
    }



    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", population=" + population +
                ", gdp=" + gdp +
                '}';
    }

}
