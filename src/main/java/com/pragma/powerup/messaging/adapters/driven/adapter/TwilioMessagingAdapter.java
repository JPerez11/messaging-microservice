package com.pragma.powerup.messaging.adapters.driven.adapter;

import com.pragma.powerup.messaging.domain.models.TwilioModel;
import com.pragma.powerup.messaging.domain.spi.TwilioPersistencePort;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.stereotype.Component;

@Component
public class TwilioMessagingAdapter implements TwilioPersistencePort {

    private static final  String ACCOUNT_SID = "AC529d46e0dca93b029077c8326b79aefd";
    private static final String AUTH_TOKEN = "546f28def3e95af2724e81235a57d4d6";
    private static final String TWILIO_PHONE_NUMBER = "+13613392310";

    @Override
    public void sendMessage(TwilioModel twilioModel) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message.creator(
                new PhoneNumber(twilioModel.getPhoneNumber()),
                new PhoneNumber(TWILIO_PHONE_NUMBER),
                twilioModel.getMessage()
        ).create();
    }
}
