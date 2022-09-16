package measurer;

public class AreaMeasurer implements Measurer {
    @Override
    public double measure(Object obj) {
        Country country = (Country) obj;
        return country.getArea();
    }
}
