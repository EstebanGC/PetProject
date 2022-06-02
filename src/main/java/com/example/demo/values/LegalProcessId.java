package com.example.demo.values;

import co.com.sofka.domain.generic.Identity;

public class LegalProcessId extends Identity {

    public LegalProcessId(){
    }

    public LegalProcessId(String uid) {super(uid);}
    public static LegalProcessId of(String uid) { return new LegalProcessId(uid); }

}
