package com.pragma.powerup.messaging.domain.api;

import com.pragma.powerup.messaging.domain.models.TwilioModel;

public interface TwilioServicePort {

    void sendMessage(TwilioModel twilioModel);

}
