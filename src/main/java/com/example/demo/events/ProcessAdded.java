package com.example.demo.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.demo.values.ProcessId;
import com.example.demo.values.ProcessState;
import com.example.demo.values.ProcessType;

public class ProcessAdded extends DomainEvent {
    private final ProcessId processId;
    private final ProcessState processState;
    private final ProcessType processType;

    public ProcessAdded(ProcessId processId, ProcessState processState, ProcessType processType) {
        super("sofka.process.processadded");
        this.processId = processId;
        this.processState = processState;
        this.processType=processType;
    }

    public ProcessId processId() { return processId;}
    public ProcessState processState() {return processState;}
    public ProcessType processType() { return processType;}

}
