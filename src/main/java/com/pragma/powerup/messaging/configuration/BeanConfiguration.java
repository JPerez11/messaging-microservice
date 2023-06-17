package com.pragma.powerup.messaging.configuration;

import com.pragma.powerup.messaging.adapters.driven.adapter.TwilioMessagingAdapter;
import com.pragma.powerup.messaging.domain.api.TwilioServicePort;
import com.pragma.powerup.messaging.domain.spi.TwilioPersistencePort;
import com.pragma.powerup.messaging.domain.usecase.TwilioUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public TwilioPersistencePort twilioPersistencePort() {
        return new TwilioMessagingAdapter();
    }

    @Bean
    public TwilioServicePort twilioServicePort() {
        return new TwilioUseCase(twilioPersistencePort());
    }

}
