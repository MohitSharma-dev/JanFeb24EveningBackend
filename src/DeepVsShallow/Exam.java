package DeepVsShallow;

public class Exam {
    private int exam_id;
    private int score;
    private ReattemptExam reattemptExam;

    Exam(int exam_id , int score) {
        this.exam_id = exam_id;
        this.score = score;
        this.reattemptExam = new ReattemptExam(exam_id);
    }

    Exam(Exam other){
        this.exam_id = other.exam_id;
        this.score = other.score;
//        deep copy
        this.reattemptExam = new ReattemptExam(other.reattemptExam);
//        shallow copy
        this.reattemptExam = other.reattemptExam;
    }

    public int getExam_id() {
        return exam_id;
    }

    public void setExam_id(int exam_id) {
        this.exam_id = exam_id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
