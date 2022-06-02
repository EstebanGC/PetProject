package com.example.demo;

import co.com.sofka.domain.generic.Entity;
import com.example.demo.values.ProcessId;
import com.example.demo.values.ProcessState;
import com.example.demo.values.ProcessType;

import java.util.Objects;


public class Process extends Entity<ProcessId> {

    private ProcessId processId;
    private ProcessState processState;
    private ProcessType processType;

    public Process(ProcessId processId, ProcessState processState, ProcessType processType){
        super(processId);
         this.processState=processState;
         this.processType=processType;
    }

    public void ProcessId(ProcessId processId) { super(processId);}

    public void updateProcessState(ProcessState processState){
        this.processState= Objects.requireNonNull(processState);
    }
    public void changeProcessType(ProcessType processType){
        this.processState= Objects.requireNonNull(processType);
    }

    public ProcessState processState(){return processState;}

    public ProcessType processType() { return processType;}


}
