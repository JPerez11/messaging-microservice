package com.pragma.powerup.messaging.domain.usecase;

import com.pragma.powerup.messaging.domain.api.TwilioServicePort;
import com.pragma.powerup.messaging.domain.models.TwilioModel;
import com.pragma.powerup.messaging.domain.spi.TwilioPersistencePort;

public class TwilioUseCase implements TwilioServicePort {

    private final TwilioPersistencePort twilioPersistencePort;

    public TwilioUseCase(TwilioPersistencePort twilioPersistencePort) {
        this.twilioPersistencePort = twilioPersistencePort;
    }

    @Override
    public void sendMessage(TwilioModel twilioModel) {
        if (twilioModel == null) {
            throw new NullPointerException();
        }
        twilioPersistencePort.sendMessage(twilioModel);
    }
}
