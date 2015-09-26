package org.biouno.drmaa.util;

import java.util.Iterator;
import java.util.ServiceLoader;

import net.jcip.annotations.ThreadSafe;

/**
 * A {#link ServiceLoader} helper class, inspired by the class with the same name from the <a href=
 * "https://github.com/52North/SOS/blob/91b8687d6e2a2c64c5137c7e3cb7c8736ffb197c/core/api/src/main/java/org/n52/sos/util/ServiceLoaderHelper.java">
 * 52North SOS project</a>.
 *
 * @author Bruno P. Kinoshita
 * @since 0.1
 */
@ThreadSafe
public class ServiceLoaderHelper {

    private ServiceLoaderHelper() {
        super();
    }

    /**
     * Finds an implementation for a given class, or throws an exception if none found.
     *
     * @param clazz class
     * @param <T> type of the class
     * @return an implementation for a given class
     * @throws RuntimeException if none found
     */
    public static <T> T loadImplementation(Class<T> clazz) {
        final ServiceLoader<T> sl = ServiceLoader.load(clazz);
        final Iterator<T> iterator = sl.iterator();
        if (false == iterator.hasNext()) {
            throw new RuntimeException(String.format("No implementation found for %s", clazz));
        }
        return iterator.next();
    }

}
