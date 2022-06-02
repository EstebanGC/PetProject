package com.example.demo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ProcessType implements ValueObject<String> {
    private final ProcessId value;
    public ProcessType(ProcessId value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Process Type is empty");
        }
    }

    @Override
    public String value() {
        return null;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessType processType = (ProcessType) o;
        return Objects.equals(value, processType.value);
    }

    public int hashCode() {
        return Objects.hash(value);
    }


    public void changeProcessType(ProcessType processType) {
    }
}
