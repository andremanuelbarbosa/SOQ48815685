package com.andremanuelbarbosa.soq48815685;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.util.ContextInitializer;
import ch.qos.logback.core.joran.spi.JoranException;
import com.codahale.metrics.MetricRegistry;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.dropwizard.logging.LoggingFactory;
import io.dropwizard.logging.LoggingUtil;

public class SOQ48815685Logging implements LoggingFactory {

    @JsonIgnore
    private LoggerContext loggerContext;

    @JsonIgnore
    private final ContextInitializer contextInitializer;

    public SOQ48815685Logging() {

        this.loggerContext = LoggingUtil.getLoggerContext();

        this.contextInitializer = new ContextInitializer(loggerContext);
    }

    @Override
    public void configure(MetricRegistry metricRegistry, String name) {

        try {

            contextInitializer.autoConfig();

        } catch (JoranException e) {

            throw new RuntimeException(e);
        }
    }

    @Override
    public void stop() {

        loggerContext.stop();
    }

    @Override
    public void reset() {

        loggerContext.reset();
    }
}
