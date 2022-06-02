package com.example.demo.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.demo.values.LegalProcessId;
import com.example.demo.values.TotalProcesses;

public class LegalProcessAdded extends DomainEvent {
    private LegalProcessId legalProcessId;
    private final TotalProcesses totalProcesses;

    public LegalProcessAdded(TotalProcesses totalProcesses){
        super("sofka.legalprocess.legalprocesscreated");
        this.legalProcessId = legalProcessId;
        this.totalProcesses=totalProcesses;}

    public LegalProcessId legalProcessId() {return legalProcessId;}
    public TotalProcesses totalProcesses() {return totalProcesses;}

}
