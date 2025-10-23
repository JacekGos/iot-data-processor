package com.iot.mqtt.to.kafka.service.runner;

import com.iot.config.MqttToKafkaServiceConfigData;
import com.iot.mqtt.to.kafka.service.exception.MqttToKafkaServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

@Component
@ConditionalOnProperty(name = "mqtt-to-kafka-service.enable-mock-data", havingValue = "true")
public class MockMqttStreamRunner implements StreamRunner {

    private static final Logger LOG = LoggerFactory.getLogger(MockMqttStreamRunner.class);
    private final MqttToKafkaServiceConfigData configData;

    public MockMqttStreamRunner(MqttToKafkaServiceConfigData configData) {
        this.configData = configData;
    }



    @Override
    public void start() {
        LOG.info("starting streaming mock data");
        long sleepTimeoutMs = configData.getMockSleepMs();
        simulateMqttDataStream(sleepTimeoutMs);
    }

    private void simulateMqttDataStream(long sleepTimeoutMs) {
        Executors.newSingleThreadExecutor().submit(() -> {
            while (true) {
                LOG.info("streaming some mock data");
                sleep(sleepTimeoutMs);
            }
        });
    }

    private void sleep(long sleepTimeoutMs) {
        try {
            Thread.sleep(sleepTimeoutMs);
        } catch (InterruptedException e) {
            throw new MqttToKafkaServiceException("Error while sleeping between sending new mqtt mock data");
        }
    }
}
