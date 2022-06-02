package com.example.demo.commands;

import co.com.sofka.domain.generic.Command;
import com.example.demo.values.LawyerId;
import com.example.demo.values.NumberOfProcesses;

public class UpdateNumberOfProcesses extends Command {

    private LawyerId lawyerId;
    private NumberOfProcesses numberOfProcesses;

    public UpdateNumberOfProcesses(LawyerId lawyerId, NumberOfProcesses numberOfProcesses) {
        this.lawyerId = lawyerId;
        this.numberOfProcesses = numberOfProcesses;
    }

    public void updateNumberOfProcesses(LawyerId lawyerId, NumberOfProcesses numberOfProcesses){
        this.lawyerId = lawyerId;
        this.numberOfProcesses = numberOfProcesses;
    }

    public LawyerId lawyerId() { return lawyerId;}
    public NumberOfProcesses numberOfProcesses(){ return numberOfProcesses;}
 }
