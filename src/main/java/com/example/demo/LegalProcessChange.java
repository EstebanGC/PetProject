package com.example.demo;

import co.com.sofka.domain.generic.EventChange;
import com.example.demo.events.*;
import com.example.demo.values.*;
import com.example.demo.Lawyer.*;

import java.util.HashSet;

public class LegalProcessChange extends EventChange {
    public LegalProcessChange(LegalProcess legalProcess){
        apply((LegalProcessAdded event)-> {
            legalProcess.totalProcesses = event.totalProcesses();
            legalProcess.lawyers = new HashSet<>();
            legalProcess.processes = new HashSet<>();
        });

        apply((LawyerAdded event)-> {
            legalProcess.lawyers.add(new Lawyer(event.lawyerId(), event.name(), event.numberOfProcesses()));
        });

        apply((NameUpdated event)->
        {
            var lawyer = new Lawyer(event.lawyerId());
            lawyer.updateName(event.name());
        });

        apply((NumberOfProcessesUpdated event)-> {
            var numberOfProcesses = new NumberOfProcesses(event.lawyerId());
            numberOfProcesses.updateNumberOfProcesses(event.numberOfProcesses());
        });
         apply((ProcessAdded event)-> {
             legalProcess.processes.add(new Process(event.processId(), event.processState(), event.processType()));
         });

         apply((ProcessStateUpdated event)-> {
            var processState = new ProcessState(event.processId());
            processState.updateProcessState(event.processState());
         });

        apply((ProcessTypeChanged event)-> {
            var processType= new ProcessType(event.processId());
            processType.changeProcessType(event.processType());
        });
    }

}
