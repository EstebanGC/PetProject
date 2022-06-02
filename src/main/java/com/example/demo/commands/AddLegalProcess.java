package com.example.demo.commands;

import co.com.sofka.domain.generic.Command;
import com.example.demo.events.LegalProcessAdded;
import com.example.demo.values.LegalProcessId;
import com.example.demo.values.TotalProcesses;

public class AddLegalProcess extends Command {
    private final LegalProcessId legalProcessId;
    private final TotalProcesses totalProcesses;

    public AddLegalProcess(LegalProcessId legalProcessId, TotalProcesses totalProcesses){
        this.legalProcessId=legalProcessId;
        this.totalProcesses=totalProcesses;
    }


    public LegalProcessId legalProcessId(){ return legalProcessId;}
    public TotalProcesses totalProcesses(){ return totalProcesses;}
}
