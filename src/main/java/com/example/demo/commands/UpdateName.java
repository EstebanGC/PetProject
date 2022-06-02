package com.example.demo.commands;

import co.com.sofka.domain.generic.Command;
import com.example.demo.values.LawyerId;
import com.example.demo.values.Name;

public class UpdateName extends Command {
    private LawyerId lawyerId;
    private Name name;

    public void updateName(LawyerId lawyerId, Name name){
        this.lawyerId = lawyerId;
        this.name=name;
    }

    public UpdateName(LawyerId lawyerId, Name name) {
        this.lawyerId = lawyerId;
        this.name = name;
    }

    public LawyerId lawyerId() { return lawyerId;}
    public Name name() {return name;}

}
