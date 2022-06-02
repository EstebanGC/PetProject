package com.example.demo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.example.demo.events.*;
import com.example.demo.values.*;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class LegalProcess extends AggregateEvent<LegalProcessId> {

    public TotalProcesses totalProcesses;
    public Set<Lawyer> lawyers;
    public Set<Process>  processes;

    public LegalProcess(LegalProcessId legalProcessId, TotalProcesses totalProcesses) {
        super(legalProcessId);
        appendChange(new LegalProcessAdded(totalProcesses)).apply();
    }

    private LegalProcess(LegalProcessId legalProcessId){
        super(legalProcessId);
        subscribe(new LegalProcessChange(this));
    }

    public static LegalProcess from(LegalProcessId legalProcessId, List<DomainEvent> events) {
        var legalProcess = new LegalProcess(legalProcessId);
        events.forEach(legalProcess::applyEvent);
        return legalProcess;
    }

    public void addProcess(ProcessId processId, ProcessState processState, ProcessType processType){
        Objects.requireNonNull(processId);
        Objects.requireNonNull(processState);
        Objects.requireNonNull(processState);
        appendChange(new ProcessAdded(processId, processState, processType)).apply();
    }
    public void addLawyer(LawyerId lawyerId, Name name, NumberOfProcesses numberOfProcesses){
        Objects.requireNonNull(lawyerId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(numberOfProcesses);
        appendChange(new LawyerAdded(lawyerId, name, numberOfProcesses)).apply();
    }

    public void changeProcessType(ProcessId processId, ProcessType processType) {
        Objects.requireNonNull(processId);
        Objects.requireNonNull(processType);
        appendChange(new ProcessTypeChanged(processId, processType)).apply();
    }

    public void updateName(LawyerId lawyerId, Name name) {
        Objects.requireNonNull(lawyerId);
        Objects.requireNonNull(name);
        appendChange(new NameUpdated(lawyerId, name)).apply();
    }

    public void updateNumberOfProcesses(LawyerId lawyerId, NumberOfProcesses numberOfProcesses){
        Objects.requireNonNull(lawyerId);
        Objects.requireNonNull(numberOfProcesses);
        appendChange(new NumberOfProcessesUpdated(lawyerId, numberOfProcesses)).apply();
    }

    public void updateProcessState(ProcessId processId, ProcessState processState){
        Objects.requireNonNull(processId);
        Objects.requireNonNull(processState);
        appendChange(new ProcessStateUpdated(processId, processState)).apply();
    }

    public TotalProcesses totalProcesses() { return totalProcesses;}
    public Set<Lawyer> lawyers() { return lawyers;}
    public Set<Process> processes() { return processes;}
}




