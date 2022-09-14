package measurable;

public class MainPolymorphism {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(400);
        Country country = new Country("Thailand", 500, 70);
        Coin coin = new Coin(0.1, "Dime");
        Student student = new Student("Kwan", 89);

        simulate(account);
        simulate(country);
        simulate(coin);
        simulate(student);
    }

    public static void simulate(Measurable meas) {
        System.out.println(   meas.getMeasure()    ); // polymorphism

        // meas ที่เป็น parameter จะมี static type เป็น Measurable เสมอ
        // แต่ dynamic type จะเปลี่ยนไปเรื่อง ๆ ขึ้นอยู่ object ที่ส่งมา

        // polymorphism
        //    meas.getMeasure() เปลี่ยนรูปร่างไปได้เรื่อย ๆ ขึ้นอยู่ object ที่ส่งมา
        //    ทาง parameter
        // ถ้าส่ง parameter เป็น BankAccount
        //    meas.getMeasure() จะเลือกใช้เมทอด getMeasure() ของ BankAccount
        // ถ้าส่ง parameter เป็น Country
        //    meas.getMeasure() จะเลือกใช้เมทอด getMeasure() ของ Country
        // ถ้าส่ง parameter เป็น Coin
        //    meas.getMeasure() จะเลือกใช้เมทอด getMeasure() ของ Coin
        // ถ้าส่ง parameter เป็น Student
        //    meas.getMeasure() จะเลือกใช้เมทอด getMeasure() ของ Student
    }
}
