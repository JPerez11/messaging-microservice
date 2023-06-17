package com.pragma.powerup.messaging.domain.spi;

import com.pragma.powerup.messaging.domain.models.TwilioModel;

public interface TwilioPersistencePort {

    void sendMessage(TwilioModel twilioModel);

}
