package comparable;

public class Arrays {

    public Comparable[] sort(Comparable obj1, Comparable obj2, Comparable obj3) {
        Comparable[] sortedResult = new Comparable[3];

        // obj1 < obj2, obj3
        // ตรวจสอบว่า obj1 < obj2 หรือไม่
        // และ ตรวจสอบว่า obj1 < obj3 หรือไม่
        if (obj1.compareTo(obj2) < 0  &&  obj1.compareTo(obj3) < 0) {
            sortedResult[0] = obj1;
            // obj2 < obj3
            if (obj2.compareTo(obj3) < 0) {
                sortedResult[1] = obj2;
                sortedResult[2] = obj3;
            }
            // obj3 < obj2
            else {
                sortedResult[1] = obj3;
                sortedResult[2] = obj2;
            }
        }

        return sortedResult;
    }
}
