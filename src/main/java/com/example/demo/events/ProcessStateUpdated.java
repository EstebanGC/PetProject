package com.example.demo.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.demo.values.ProcessId;
import com.example.demo.values.ProcessState;

public class ProcessStateUpdated extends DomainEvent {

    private final ProcessId processId;
    private final ProcessState processState;

    public ProcessStateUpdated(ProcessId processId, ProcessState processState) {
        super("sofka.process.processstateupdated");
        this.processId= processId;
        this.processState = processState;
    }

    public ProcessId processId() { return processId;}
    public ProcessState processState() { return processState;}

}
