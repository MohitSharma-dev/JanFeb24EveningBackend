package BackendLLD2.Strategy.GoogleMaps;

public class PathCalculatorStrategyFactory {
    public static PathCalculatorStrategy getPathCalculatorStrategy(TravelMode travelMode) {
        PathCalculatorStrategy pathCalculatorStrategy = null;
        if(travelMode.equals(TravelMode.CAR)){
            pathCalculatorStrategy = new CarPathCalculatorStrategy();
        } else if (travelMode.equals(TravelMode.WALK)){
            pathCalculatorStrategy = new WalkPathCalculatorStrategy();
        } else if(travelMode.equals(TravelMode.BIKE)){
            pathCalculatorStrategy = new BikePathCalculatorStrategy();
        }
        return pathCalculatorStrategy;
    }
}
