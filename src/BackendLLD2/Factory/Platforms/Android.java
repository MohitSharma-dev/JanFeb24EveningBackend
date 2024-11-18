package BackendLLD2.Factory.Platforms;

public class Android implements Platform{
    @Override
    public void setRefreshRate() {

    }

    @Override
    public void setTheme() {

    }

    @Override
    public UIComponentFactory createUIComponentFactory() {
        return new AndroidUIComponentFactory();
    }
}
