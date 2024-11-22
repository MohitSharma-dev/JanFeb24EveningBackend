package BackendLLD2.Strategy.Sorter;

public class DataProcessor {
    private SortingStrategy sortingStrategy;

    DataProcessor(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void setSortingStrategy(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void processData(int[] data){
        if(sortingStrategy == null){
            setSortingStrategy(SortingStrategyFactory.getSortingStrategyByDataSize(data.length));
        }
        sortingStrategy.sort(data);
    }
}
