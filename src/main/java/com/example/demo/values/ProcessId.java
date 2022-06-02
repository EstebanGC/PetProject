package com.example.demo.values;

import co.com.sofka.domain.generic.Identity;

public class ProcessId extends Identity {

    public ProcessId(){
    }
    private ProcessId(String uid){
        super(uid);
    }
    public static ProcessId of(String uid){
        return new ProcessId(uid);
    }

    public boolean isBlank() {
        return false;
    }
}
