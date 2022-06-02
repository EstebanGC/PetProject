package com.example.demo.commands;

import co.com.sofka.domain.generic.Command;
import com.example.demo.values.LawyerId;
import com.example.demo.values.Name;
import com.example.demo.values.NumberOfProcesses;

public class AddLawyer extends Command {
    private final LawyerId lawyerId;
    private final Name name;
    private final NumberOfProcesses numberOfProcesses;

    public AddLawyer(LawyerId lawyerId, Name name, NumberOfProcesses numberOfProcesses){
        this.lawyerId = lawyerId;
        this.name = name;
        this.numberOfProcesses = numberOfProcesses;
    }

    public LawyerId lawyerId() { return lawyerId;}

    public Name name() {return name;}

    public NumberOfProcesses numberOfProcesses() {return numberOfProcesses;}
}
