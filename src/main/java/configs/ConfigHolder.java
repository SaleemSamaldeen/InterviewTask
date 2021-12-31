package configs;

import org.aeonbits.owner.ConfigFactory;

import java.util.Properties;
import java.util.function.Consumer;

public class ConfigHolder {

    private static baseConfig baseConfig = ConfigFactory.create(baseConfig.class, System.getProperties(), System.getenv());

    public static baseConfig get() {
        return baseConfig;
    }

    public static Consumer<Properties> setInstance = properties -> {
        baseConfig = ConfigFactory.create(baseConfig.class, properties);
    };
}
