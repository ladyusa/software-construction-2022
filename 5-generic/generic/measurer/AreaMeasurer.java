package generic.measurer;

public class AreaMeasurer implements Measurer<Country> {
    @Override
    public double measure(Country country) {
        return country.getArea();
    }
}
