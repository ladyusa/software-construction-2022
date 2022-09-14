package measurable;

public class Data {

    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj : objects)
            sum += obj.getMeasure();  // polymorphism
        if (objects.length > 0)
            return sum / objects.length;
        return 0;

        // polymorphism
        // ถ้าส่ง parameter เป็น array ของ BankAccount
        //    obj.getMeasure() จะเลือกใช้เมทอด getMeasure() ของ BankAccount
        // ถ้าส่ง parameter เป็น array ของ Country
        //    obj.getMeasure() จะเลือกใช้เมทอด getMeasure() ของ Country
    }

    public static Measurable larger(Measurable obj1, Measurable obj2) {
        if (obj1.getMeasure() > obj2.getMeasure())
            return obj1;
        return obj2;
    }


}
