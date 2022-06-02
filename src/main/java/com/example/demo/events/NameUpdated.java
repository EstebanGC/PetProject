package com.example.demo.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.example.demo.values.LawyerId;
import com.example.demo.values.Name;

public class NameUpdated extends DomainEvent {
    private final LawyerId lawyerId;
    private final Name name;

    public NameUpdated(LawyerId lawyerId, Name name){
        super("sofka.name.nameupdated");
        this.lawyerId=lawyerId;
        this.name=name;
    }

    public LawyerId lawyerId(){ return lawyerId;}

    public Name name() { return name;}


}
