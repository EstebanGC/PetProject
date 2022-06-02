package com.example.demo.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.demo.values.ProcessId;
import com.example.demo.values.ProcessType;

public class ProcessTypeChanged extends DomainEvent {
    private final ProcessId processId;
    private final ProcessType processType;

    public ProcessTypeChanged(ProcessId processId, ProcessType processType){
        super("sofka.process.processtypechanged");
        this.processId=processId;
        this.processType=processType;
    }

    public ProcessId processId() { return processId;}
    public ProcessType processType() { return processType;}
}
