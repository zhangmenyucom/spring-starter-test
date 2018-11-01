import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Administrator
 */
@ConfigurationProperties("example.service")
public class StarterServiceProperties {
    private String config;
    
    public void setConfig(String config) {
        this.config = config;
    }
    
    public String getConfig() {
        return config;
    }
 }