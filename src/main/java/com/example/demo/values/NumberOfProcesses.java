package com.example.demo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumberOfProcesses implements ValueObject<Integer> {
    public final Integer value;
    public NumberOfProcesses(LawyerId value) {
        this.value = Objects.requireNonNull(value);
        if (this.value<=0){
            throw new IllegalArgumentException("The number of processes can not be negative");
        }
    }

    @Override
    public Integer value() {
        return null;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberOfProcesses numberOfProcesses = (NumberOfProcesses) o;
        return Objects.equals(value, numberOfProcesses.value);
    }

    public int hashCode() {
        return Objects.hash(value);
    }

    public void updateNumberOfProcesses(NumberOfProcesses numberOfProcesses) {
    }
}
