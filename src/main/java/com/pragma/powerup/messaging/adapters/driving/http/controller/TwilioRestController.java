package com.pragma.powerup.messaging.adapters.driving.http.controller;

import com.pragma.powerup.messaging.adapters.driving.http.dto.TwilioRequestDto;
import com.pragma.powerup.messaging.adapters.driving.http.handler.TwilioHandler;
import com.pragma.powerup.messaging.configuration.utils.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/twilio")
public class TwilioRestController {

    private final TwilioHandler twilioHandler;

    @Operation(summary = "Send notification message",
            responses = {
                    @ApiResponse(responseCode = "201", description = "Notification sent successfully",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(ref = "#/components/schemas/Map"))),
                    @ApiResponse(responseCode = "401", description = "Something went wrong",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(ref = "#/components/schemas/Error"))),
                    @ApiResponse(responseCode = "409", description = "Conflict",
                            content = @Content(mediaType = "application/json",
                                    schema = @Schema(ref = "#/components/schemas/Error")))})
    @PostMapping("/message")
    public ResponseEntity<Map<String, String>> sendMessage(@RequestBody TwilioRequestDto twilioRequest) {
        twilioHandler.sendMessage(twilioRequest);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Collections.singletonMap(
                        Constants.RESPONSE_MESSAGE_KEY,
                        Constants.NOTIFICATION_MESSAGE
                ));
    }

}
