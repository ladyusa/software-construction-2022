package genericcollection;

import java.util.List;

public class Data {

    public static double average(List<? extends Measurable> objects) {

        double sum = 0;

        for (Measurable obj : objects) {
            sum = sum + obj.getMeasure();
        }

        if (objects.size() > 0) return sum / objects.size();
        return 0;
    }

}
