package Collections;

import java.util.Comparator;

public class StudentPSPComparator implements Comparator<Student> {
//    sort acc to desc order of PSP
//    if PSP is same, sort acc desc order of attendance
//    if attendance is also same, sort acc to gradyear
    @Override
    public int compare(Student o1, Student o2) {
//        o1 : -1
//        o2 : 1
        if(o1.getPsp() < o2.getPsp()){
            return 1;
        } else if(o1.getPsp() > o2.getPsp()){
            return -1;
        } else {
            if(o1.getAttendance() > o2.getAttendance()){
                return -1;
            } else if (o1.getAttendance() < o2.getAttendance()){
                return 1;
            } else {
                if(o1.getGradYear() < o2.getGradYear()){
                    return -1;
                } else if(o1.getGradYear() > o2.getGradYear()){
                    return 1;
                }
            }
        }
        return 0;
    }
}
