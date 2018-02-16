package com.andremanuelbarbosa.soq48815685;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SOQ48815685 extends Application<SOQ48815685Configuration> {

    private static final Logger LOGGER = LoggerFactory.getLogger(SOQ48815685.class);

    @Override
    public void run(SOQ48815685Configuration soq48815685Configuration, Environment environment) throws Exception {

        LOGGER.info("Error Message");
        LOGGER.info("Error Message");
        LOGGER.info("Error Message");
    }

    public static void main(String[] args) throws Exception {

        new SOQ48815685().run(args);
    }
}