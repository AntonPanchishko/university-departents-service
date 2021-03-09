package com.example.universitydepartentsservice.conf;

import com.example.universitydepartentsservice.controller.apphandler.CommandHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandHandlerConf {
    private final List<CommandHandler> commandHandlerList;
    private final Map<String, CommandHandler> map;

    @Autowired
    public CommandHandlerConf(List<CommandHandler> commandHandlerList) {
        this.commandHandlerList = commandHandlerList;
        map = new HashMap<>();
        map.put("menu", commandHandlerList.get(0));
        map.put("exit", commandHandlerList.get(1));
        map.put("unknown", commandHandlerList.get(2));
        map.put("average", commandHandlerList.get(3));
        map.put("statistic", commandHandlerList.get(4));
        map.put("search", commandHandlerList.get(5));
        map.put("head", commandHandlerList.get(6));
        map.put("amount", commandHandlerList.get(7));

    }
}
