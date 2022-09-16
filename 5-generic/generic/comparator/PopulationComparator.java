package generic.comparator;

import java.util.Comparator;

public class PopulationComparator implements Comparator<Country> {
    @Override
    public int compare(Country c1, Country c2) {
        if (c1.getPopulation() < c2.getPopulation()) return -1;
        if (c1.getPopulation() > c2.getPopulation()) return 1;
        return 0;
    }
}
