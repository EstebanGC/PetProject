package com.example.demo.commands;

import co.com.sofka.domain.generic.Command;
import com.example.demo.values.ProcessId;
import com.example.demo.values.ProcessState;

public class UpdateProcessState extends Command {

    private ProcessId processId;
    private ProcessState processState;

    public void updateProcessState(ProcessId processId, ProcessState processState){
        this.processId=processId;
        this.processState=processState;
    }

    public UpdateProcessState(ProcessId processId, ProcessState processState) {
        this.processId = processId;
        this.processState = processState;
    }

    public ProcessId processId() { return processId;}
    public ProcessState processState() { return processState;}
}
