package SOLID_7_FACTORY_BUTTON;

import SOLID_7_FACTORY_BUTTON.UIFactory;

public class Flutter {
    private SupportedPlatform platform;
    public Flutter(SupportedPlatform platform){
        this.platform = platform;
    }
    public void setTheme() {
        System.out.println("Setting a theme for the app");
    }
    public void setRefreshRate(){
        System.out.println("Setting a refesh rate for app");
    }
    public UIFactory createUIFactory(){
        return UIFactoryFactory.createUIFactory(this.platform);
    }
}
