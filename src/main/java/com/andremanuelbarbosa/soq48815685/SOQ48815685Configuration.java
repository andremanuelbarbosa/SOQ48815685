package com.andremanuelbarbosa.soq48815685;

import io.dropwizard.Configuration;
import io.dropwizard.logging.LoggingFactory;

public class SOQ48815685Configuration extends Configuration {

    public synchronized LoggingFactory getLoggingFactory() {

        return new SOQ48815685Logging();
    }
}