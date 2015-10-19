package it.sevenbits;

import info.smart_tools.smartactors.core.IMessage;
import info.smart_tools.smartactors.core.IObject;
import info.smart_tools.smartactors.core.actors.Actor;
import info.smart_tools.smartactors.core.actors.annotations.Handler;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PrintActor extends Actor {

    public PrintActor(IObject params) {

        System.out.println("creating print actor");
    }

    @Handler("handle")
    public void handle(IMessage message) {

        System.out.println("print message");
    }
}
