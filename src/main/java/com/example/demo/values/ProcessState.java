package com.example.demo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ProcessState<processState> implements ValueObject<String> {

    private final ProcessId value;
    public ProcessState(ProcessId value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Process state is empty");
        }
    }

    @Override
    public String value() {
        return null;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessState processState = (ProcessState)  o;
        return Objects.equals(value, processState.value);
    }

    public int hashCode() {
        return Objects.hash(value);
    }

    public void updateProcessState(ProcessState processState) {
    }
}
