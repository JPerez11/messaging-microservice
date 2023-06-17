package com.pragma.powerup.messaging.adapters.driving.http.handler;

import com.pragma.powerup.messaging.adapters.driving.http.dto.TwilioRequestDto;

public interface TwilioHandler {

    void sendMessage(TwilioRequestDto twilioRequest);

}
