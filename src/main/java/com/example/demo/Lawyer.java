package com.example.demo;

import co.com.sofka.domain.generic.Entity;
import com.example.demo.values.LawyerId;
import com.example.demo.values.Name;
import com.example.demo.values.NumberOfProcesses;


import java.util.Objects;

public class Lawyer extends Entity<LawyerId> {

    private LawyerId lawyerId;
    private Name name;
    private NumberOfProcesses numberOfProcesses;

    public Lawyer(LawyerId lawyerId, Name name, NumberOfProcesses numberOfProcesses){
        super(lawyerId);
        this.name= name;
        this.numberOfProcesses = numberOfProcesses;
    }

    public Lawyer(LawyerId lawyerId) {
        super(lawyerId);
    }

    public void updateName(Name name) {this.name = Objects.requireNonNull(name);
    }

    public void updateNumberOfProcesses(NumberOfProcesses numberOfProcesses) {
        this.numberOfProcesses = Objects.requireNonNull(numberOfProcesses);
    }

    public Name name(Name name) {
        return name;
    }

    public NumberOfProcesses numberOfProcesses() {
        return numberOfProcesses;
    }
}
