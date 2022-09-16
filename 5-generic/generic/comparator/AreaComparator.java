package generic.comparator;

import java.util.Comparator;

public class AreaComparator implements Comparator<Country> {
    @Override
    public int compare(Country c1, Country c2) {
        if (c1.getArea() < c2.getArea()) return  -1;
        if (c1.getArea() > c2.getArea()) return  1;
        return 0;
    }
}
