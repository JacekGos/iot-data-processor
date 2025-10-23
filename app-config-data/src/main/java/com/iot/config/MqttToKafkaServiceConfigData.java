package com.iot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Data
@Configuration
@ConfigurationProperties(prefix = "mqtt-to-kafka-service")
public class MqttToKafkaServiceConfigData {

    private String welcomeMessage;
    private Boolean enableMockData;
    private Long mockSleepMs;
}
