package comparator;

import java.util.Comparator;

public class Sorter {

    public Object[] sort(Object obj1, Object obj2, Object obj3, Comparator comparator) {
        Object[] sortedResult = new Object[3];

        // obj1 < obj2, obj3
        // ตรวจสอบว่า obj1 < obj2 หรือไม่
        // และ ตรวจสอบว่า obj1 < obj3 หรือไม่
        if (comparator.compare(obj1,obj2) < 0  &&  comparator.compare(obj1,obj3) < 0) {
            sortedResult[0] = obj1;
            // obj2 < obj3
            if (comparator.compare(obj2,obj3) < 0) {
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
