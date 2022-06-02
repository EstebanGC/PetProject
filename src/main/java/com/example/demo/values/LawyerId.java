package com.example.demo.values;

import co.com.sofka.domain.generic.Identity;
import com.example.demo.Lawyer;

public class LawyerId extends Identity {

    public LawyerId(){
    }
    private LawyerId(String uid){
        super(uid);
    }
    public static LawyerId of(String uid){
        return new LawyerId(uid);
    }
}
