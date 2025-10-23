package com.iot.mqtt.to.kafka.service.exception;

public class MqttToKafkaServiceException extends RuntimeException {

    public MqttToKafkaServiceException() {
    }

    public MqttToKafkaServiceException(String message) {
        super(message);
    }

    public MqttToKafkaServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
