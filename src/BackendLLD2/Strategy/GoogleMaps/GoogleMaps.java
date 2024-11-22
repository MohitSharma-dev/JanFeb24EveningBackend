package BackendLLD2.Strategy.GoogleMaps;

public class GoogleMaps {

    void findPath(String src , String dest , TravelMode travelMode){

//        if(travelMode.equals(TravelMode.CAR)){
//            System.out.println("Car path is calculated");
//        } else if (travelMode.equals(TravelMode.WALK)){
//            System.out.println("Walk path is calculated");
//        } else if(travelMode.equals(TravelMode.BIKE)){
//            System.out.println("Bike path is calculated");
//        }

       PathCalculatorStrategyFactory
               .getPathCalculatorStrategy(travelMode)
               .findPath(src, dest);
    }
}
