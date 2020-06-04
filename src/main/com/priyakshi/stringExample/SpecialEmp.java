package com.priyakshi.stringExample;

import java.util.Objects;

public class SpecialEmp {
    String special;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpecialEmp that = (SpecialEmp) o;
        return Objects.equals(special, that.special);
    }

    @Override
    public int hashCode() {
        return Objects.hash(special);
    }
}
