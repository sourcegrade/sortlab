package org.sourcegrade.sortlab;

import java.util.Comparator;

public interface CountingComparator<E> extends Comparator<E> {

    int getOperationCount();
}
