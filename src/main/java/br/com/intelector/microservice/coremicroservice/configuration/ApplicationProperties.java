package br.com.intelector.microservice.coremicroservice.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class ApplicationProperties {

    @Value("${app.i18n.enable:false}")
    private boolean appI18nEnable;

    @Value("${app.security.enable:false}")
    private boolean appSecurityEnable;

    /*@Value("${app.kafka.address}")
    private String appKafkaAdress;*/

}
