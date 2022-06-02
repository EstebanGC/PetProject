package com.example.demo.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.demo.values.LawyerId;
import com.example.demo.values.NumberOfProcesses;

public class NumberOfProcessesUpdated extends DomainEvent {
    private final LawyerId lawyerId;
    private final NumberOfProcesses numberOfProcesses;

    public NumberOfProcessesUpdated(LawyerId lawyerId, NumberOfProcesses numberOfProcesses) {
        super("sofka.lawyer.numberofprocessesupdated");
        this.lawyerId=lawyerId;
        this.numberOfProcesses=numberOfProcesses;
    }

    public LawyerId lawyerId() {return lawyerId;}
    public NumberOfProcesses numberOfProcesses() { return numberOfProcesses;}
}
