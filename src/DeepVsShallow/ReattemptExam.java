package DeepVsShallow;

public class ReattemptExam {
    private int exam_id;

    ReattemptExam(int exam_id){
        this.exam_id = exam_id;
    }

    ReattemptExam(ReattemptExam exam){
        this.exam_id = exam.exam_id;
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }
}
