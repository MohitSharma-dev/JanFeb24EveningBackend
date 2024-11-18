package BackendLLD2.Factory.Platforms;

public class PlatformFactory {
//    simple factory
    public static Platform getPlatformByName(String platform) {
        if(platform.equals("Android")){
            return new Android();
        } else if(platform.equals("IOS")){
            return new IOS();
        }
        return null;
    }
}
