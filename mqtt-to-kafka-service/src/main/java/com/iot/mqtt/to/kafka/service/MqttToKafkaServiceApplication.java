package com.iot.mqtt.to.kafka.service;

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

    public MqttToKafkaServiceApplication(StreamRunner streamRunner) {
        this.streamRunner = streamRunner;
    }

    public static void main(String[] args) {
        SpringApplication.run(MqttToKafkaServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("running APP");
        streamRunner.start();
    }
}
