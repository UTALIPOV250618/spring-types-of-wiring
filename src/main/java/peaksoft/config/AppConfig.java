package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.KoscheiTheDeathless;
import peaksoft.model.*;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {


    @Bean
    public KoscheiTheDeathless koscheiTheDeathless(Ocean1 ocean1){
        return new KoscheiTheDeathless(ocean1);
    }
    @Bean
    public static Island2 island2(Wood3 wood) {
        return new Island2(wood);
    }
    @Bean
    public Wood3 wood3(Rabbit4 rabbit4){
        return new Wood3(rabbit4);
    }
    @Bean
    public Rabbit4 rabbit4(Duck5 duck5){
        return new Rabbit4(duck5);
    }
    @Bean
    public Duck5 duck5(Egg6 egg6){
        return new Duck5(egg6);
    }
    @Bean
    public Egg6 egg6(Needle7 needle7){
        return new Egg6(needle7);
    }
    @Bean
    public Needle7 needle7(Deth8 deth8){
        return new Needle7(deth8);
    }
}