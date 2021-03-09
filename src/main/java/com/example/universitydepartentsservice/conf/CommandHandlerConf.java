package com.example.universitydepartentsservice.conf;

import com.example.universitydepartentsservice.controller.apphandler.CommandHandler;
import java.util.Map;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandHandlerConf {
    private final Map<String, CommandHandler> map;

    public CommandHandlerConf(Map<String, CommandHandler> map) {
        this.map = map;
    }
}
