package configs;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:application.properties")
public interface baseConfig extends Config {

    @Key("Browser")
    String browser();

    @Key("apps.feUI.baseURL")
    String webBaseURL();

    @Key("shop.state")
    String webBaseState();

    @Key("shop.country")
    String webBaseCountry();

    @Key("shop.department")
    String webBaseDepartment();

    @Key("apps.feUI.username")
    String linkedinUsername();

    @Key("apps.feUI.password")
    String linkedinPwd();

    @Key("apps.restapi.apiBaseURL")
    String restapiBaseURL();

    @Key("apps.file.testDataPath")
    String testDataPath();

}
