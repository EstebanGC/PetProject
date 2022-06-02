package com.example.demo.commands;

import co.com.sofka.domain.generic.Command;
import com.example.demo.values.ProcessId;
import com.example.demo.values.ProcessType;

public class ChangeProcessType extends Command {

    private ProcessId processId;
    private ProcessType processType;


    public void changeProcessType(ProcessId processId, ProcessType processType) {
        this.processId= processId;
        this.processType=processType;
    }

    public ChangeProcessType(ProcessId processId, ProcessType processType) {
        this.processId = processId;
        this.processType = processType;
    }

    public ProcessId processId() {return processId;}
    public ProcessType processType(){return processType;}
}
