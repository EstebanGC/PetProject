package com.example.demo.commands;

import co.com.sofka.domain.generic.Command;
import com.example.demo.values.ProcessId;
import com.example.demo.values.ProcessState;
import com.example.demo.values.ProcessType;

public class AddProcess extends Command {

    private final ProcessState processState;
    private final ProcessType processType;
    private final ProcessId processId;

    public AddProcess(ProcessId processId, ProcessState processState, ProcessType processType) {
        this.processId = processId;
        this.processState = processState;
        this.processType = processType;
    }

    public ProcessId processId() {
        return processId;
    }
}

