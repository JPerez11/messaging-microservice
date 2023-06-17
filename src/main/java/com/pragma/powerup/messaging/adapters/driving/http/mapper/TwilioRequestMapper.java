package com.pragma.powerup.messaging.adapters.driving.http.mapper;

import com.pragma.powerup.messaging.adapters.driving.http.dto.TwilioRequestDto;
import com.pragma.powerup.messaging.domain.models.TwilioModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TwilioRequestMapper {

    TwilioModel toModel(TwilioRequestDto twilioRequest);

}
