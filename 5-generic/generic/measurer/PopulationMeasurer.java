package generic.measurer;

public class PopulationMeasurer implements Measurer<Country> {
    @Override
    public double measure(Country country) {
        return country.getPopulation();
    }
}
