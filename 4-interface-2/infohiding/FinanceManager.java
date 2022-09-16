package infohiding;

import java.util.List;

public class FinanceManager {

    public double calculateFee(Accountable history) {
        List<Medicine> medicineList = history.getMedicines();

//        ไม่สามารถเรียกใช้เมธอดที่ไม่ควรเข้าถึงได้
//        จึงสามารถซ่อนข้อมูลได้
//        history.getDiagnosis();
//        history.getSymptom();
//        history.getLabResult();

        double total = 0;
        total = total + 600; // ค่าแพทย์
        // ค่ายา
        for (Medicine medicine : medicineList) {
            total += medicine.getPrice();
        }
        return total;
    }
}
