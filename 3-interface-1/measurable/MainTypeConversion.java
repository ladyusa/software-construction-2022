package measurable;

import example.Human;

public class MainTypeConversion {

    public static void main(String[] args) {

        // static type ของ reference อยู่ซ้ายมือของเครื่องหมาย =
        ///   ซึ่ง static type จะคงเดิมตลอดการทำงาน ไม่มีการเปลี่ยนแปลงใด ๆ
        // dynamic type ของ reference อยู่ทางขวามือเครื่องหมาย =
        //    (object จริงที่ reference ชี้ไป)
        //    ซึ่ง dynamic type สามารถเปลี่ยนไปได้ตลอดการทำงาน
        BankAccount account = new BankAccount(1000);

        // static type เป็น Measurable ส่วน dynamic type เป็น BankAccount
        Measurable meas = account;

        Country country = new Country("Singapore", 0.7, 5);

        // static type เป็น Measurable ส่วน dynamic type เป็น Country
        meas = country;

        Measurable meas2 = new Country("Thailand", 500, 70);

        // ไม่สามารถ assign object ที่ไม่ได้ implement interface นั้น ๆ ได้
        // Measurable meas3 = new Human();

        meas = account;
        account.deposit(500);
        // compile error เราเรียกเมธอดตาม type ที่ประกาศไว้ซ้ายมือได้เท่านั้น
        // (ตาม static type เท่านั้น)
        // meas.deposit(500);

        // ซ้ายมือของการประกาศตัวแปร ref จะต้องมี type เท่ากับหรือเป็น supertype
        // ของ object ทางขวามือเท่านั้น
        //   supertype ---> superclass หรือ interface
        BankAccount[] accounts1 = new BankAccount[3];
        Measurable[] accounts2 = new Measurable[3];
        Measurable[] accounts3 = new BankAccount[3];
        // BankAccount[] accounts4 = new Measurable[4];

        // ไม่สามารถสร้าง/ instantiate object ด้วย new interface โดยตรงแบบ
        // ด้านล่างไม่ได้ เนื่องจาก interface ยังไม่มี method implementation
        // Measurable measurable = new Measurable();

        Country thailand = new Country("Thailand", 500, 70);
        Country singapore = new Country("Singapore", 0.7, 5);
        Measurable max = Data.larger(thailand, singapore);
        // String maxName = max.getName(); // error
        Country maxCountry = (Country) max;
        String maxName = maxCountry.getName();
        System.out.println(maxName);

        BankAccount account1 = new BankAccount(1000);
        Country country1 = new Country("Japan", 377, 125);
        Measurable max1 = Data.larger(account1, country1);

        // ก่อนการ cast ควรมีการตรวจสอบ type ของ object ก่อนเสมอ
        // ว่าเป็น type ที่ต้องการหรือไม่ โดยการใช้่ instance
        if (max1 instanceof Country) {
            Country maxCountry1 = (Country) max1;
            System.out.println(maxCountry1.getName());
        }
        if (max1 instanceof BankAccount) {
            BankAccount maxAccount = (BankAccount) max1;
            maxAccount.deposit(500);
            System.out.println( maxAccount.getBalance() );
         }

    }
}








