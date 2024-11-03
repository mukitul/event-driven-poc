package com.mukit.eventdrivenpoc.config;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@Getter
@Setter
@Validated
@ConfigurationProperties(prefix = "aws.config")
public class AwsConfigProperties {

    @NotBlank(message = "")
    private String topicArn;
}
