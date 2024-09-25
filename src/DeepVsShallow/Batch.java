package DeepVsShallow;

public class Batch {
    private String name;

    public Batch(String name) {
        this.name = name;
    }

    public Batch(Batch batch) {
        this.name = batch.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
