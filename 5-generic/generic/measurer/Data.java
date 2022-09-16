package generic.measurer;

public class Data {

    public static <T> double average(T[] objects, Measurer<T> meas) {
        double sum = 0;
        for (T obj : objects)
            sum += meas.measure(obj);  // polymorphism
        if (objects.length > 0)
            return sum / objects.length;
        return 0;

        // polymorphism
        // ถ้าส่ง parameter เป็นอ๊อบเจ็กต์ของ BalanceMeasurer
        //    meas.measure(obj) จะเลือกใช้เมทอด measure() ของ BalanceMeasurer
        // ถ้าส่ง parameter เป็นอ๊อบเจ็กต์ของ AreaMeasurer
        //    meas.measure(obj) จะเลือกใช้เมทอด measure() ของ AreaMeasurer
    }

}
