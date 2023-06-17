package com.pragma.powerup.messaging.adapters.driving.http.handler.impl;

import com.pragma.powerup.messaging.adapters.driving.http.dto.TwilioRequestDto;
import com.pragma.powerup.messaging.adapters.driving.http.handler.TwilioHandler;
import com.pragma.powerup.messaging.adapters.driving.http.mapper.TwilioRequestMapper;
import com.pragma.powerup.messaging.domain.api.TwilioServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TwilioHandlerImpl implements TwilioHandler {

    private final TwilioServicePort twilioServicePort;
    private final TwilioRequestMapper twilioRequestMapper;

    @Override
    public void sendMessage(TwilioRequestDto twilioRequest) {
        twilioServicePort.sendMessage(
                twilioRequestMapper.toModel(twilioRequest)
        );
    }
}
