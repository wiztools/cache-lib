package org.wiztools.cachelib;

/**
 *
 * @author subwiz
 */
public interface Cache {
    void put(Object key, Object value);
    Object get(Object key);
    void remove(Object key);
    void clear();
}
