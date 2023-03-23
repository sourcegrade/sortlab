package org.sourcegrade.sortlab;

import org.jetbrains.annotations.Nullable;

import java.util.Iterator;

/**
 * Like an array, but with methods.
 *
 * <p>
 * An important distinction between this and a {@link java.util.List} is that the contents of the list are
 * not shifted when an element is removed, similar to an array.
 * </p>
 */
public interface SortList<E> extends Iterable<@Nullable E> {

    E get(int index);

    void set(int index, E value);

    @Nullable E remove(int index);

    int getSize();

    /**
     * Returns an {@link Iterator} over the elements in this list in proper sequence, including gaps (null) elements.
     */
    @Override
    Iterator<@Nullable E> iterator();
}
