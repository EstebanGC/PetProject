package com.example.demo.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.demo.Lawyer;
import com.example.demo.values.LawyerId;
import com.example.demo.values.Name;
import com.example.demo.values.NumberOfProcesses;

public class LawyerAdded extends DomainEvent {
    private final LawyerId lawyerId;
    private final Name name;
    private final NumberOfProcesses numberOfProcesses;

    public LawyerAdded(LawyerId lawyerId, Name name, NumberOfProcesses numberOfProcesses){
        super("sofka.lawyer.lawyercreated");
        this.lawyerId=lawyerId;
        this.name=name;
        this.numberOfProcesses=numberOfProcesses;
    }

    public LawyerId lawyerId() { return lawyerId;}

    public Name name() { return name;}

    public NumberOfProcesses numberOfProcesses() { return numberOfProcesses;}
}
