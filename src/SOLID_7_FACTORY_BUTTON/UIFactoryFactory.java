package SOLID_7_FACTORY_BUTTON;

public class UIFactoryFactory {
    public static UIFactory createUIFactory(SupportedPlatform supportedPlatform) {
        switch(supportedPlatform) {
            case ANDROID:
                return new AndroidUIFactory();
            case IOS:
                return new IosUIFactory();
            case WINDOW:
                return new WindowUIFactory();

        };
        return null;
    };

}
