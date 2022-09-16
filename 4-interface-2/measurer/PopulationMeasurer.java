package measurer;

public class PopulationMeasurer implements Measurer {
    @Override
    public double measure(Object obj) {
        Country country = (Country) obj;
        return country.getPopulation();
    }
}
