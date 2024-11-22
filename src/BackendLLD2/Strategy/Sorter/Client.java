package BackendLLD2.Strategy.Sorter;

public class Client {
    public static void main(String[] args) {
        DataProcessor dataProcessor = new DataProcessor(null);

        int[] data = new int[150];
        dataProcessor.processData(data);
    }
}
