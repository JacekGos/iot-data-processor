package com.iot.mqtt.to.kafka.service;

import com.iot.config.MqttToKafkaServiceConfigData;
import com.iot.mqtt.to.kafka.service.runner.StreamRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.iot")
public class MqttToKafkaServiceApplication implements CommandLineRunner {

    private final Logger LOG = LoggerFactory.getLogger(MqttToKafkaServiceApplication.class);
    private final StreamRunner streamRunner;
    private final MqttToKafkaServiceConfigData configData;

    public MqttToKafkaServiceApplication(StreamRunner streamRunner, MqttToKafkaServiceConfigData configData) {
        this.streamRunner = streamRunner;
        this.configData = configData;
    }

    public static void main(String[] args) {
        SpringApplication.run(MqttToKafkaServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("running APP");
        LOG.info("welcome message: {}", configData.getWelcomeMessage());
        streamRunner.start();
    }
}
