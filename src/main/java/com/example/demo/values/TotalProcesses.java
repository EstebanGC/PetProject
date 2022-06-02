package com.example.demo.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TotalProcesses implements ValueObject<Integer> {

    public final Integer value;

    public TotalProcesses(Integer value) {
        this.value = Objects.requireNonNull(value);
        if (this.value<0) {
            throw new IllegalArgumentException("The Total number has to have a number of books");
        }
    }

    @Override
    public Integer value() {
        return null;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotalProcesses totalProcesses = (TotalProcesses) o;
        return Objects.equals(value, totalProcesses.value);
    }

    public int hashCode() {
        return Objects.hash(value);
    }
}
