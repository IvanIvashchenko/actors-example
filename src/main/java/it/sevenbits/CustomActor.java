package it.sevenbits;

import info.smart_tools.smartactors.core.FieldName;
import info.smart_tools.smartactors.core.IMessage;
import info.smart_tools.smartactors.core.IObject;
import info.smart_tools.smartactors.core.ReadValueException;
import info.smart_tools.smartactors.core.actors.Actor;
import info.smart_tools.smartactors.core.actors.annotations.Handler;

public class CustomActor extends Actor {

    public CustomActor(IObject params) throws ReadValueException {

        System.out.println(params.getValue(new FieldName("name")));
    }

    @Handler("handle")
    public void handle(IMessage message) {

        System.out.println("handling message");
    }
}
