package com.vastidev.coopvotes.config;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import static java.text.MessageFormat.format;

public class FeignErrorDecoder {

    private static final Logger LOGGER = LoggerFactory.getLogger(FeignErrorDecoder.class);


    public Exception decode(String methodKey, Response response) {
        String message = format("An error occurred while calling the API. Status code: {0}, methodKey: {1}",
                response.status(), methodKey);
        if (response.status() == HttpStatus.NOT_FOUND.value())
            LOGGER.warn(message);
        else LOGGER.error(message);
        try {
            return new ResponseStatusException(HttpStatus.valueOf(response.status()), response.reason());
        } catch (Exception e) {
            return new Exception("Status code: " + response.status()
                    + ", methodKey:" + methodKey.replaceAll("\\(.*\\)", ""));
        }
    }
}
