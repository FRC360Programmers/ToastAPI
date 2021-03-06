package jaci.openrio.toast.core.loader.module;

import java.util.ArrayList;
import java.util.List;

/**
 * The ModuleManager is a static class that stores the loaded {@link ModuleCandidate} and
 * {@link ModuleContainer} for use later. These can be accessed by any module and by Toast
 * itself.
 *
 * @author Jaci
 */
public class ModuleManager {

    static ArrayList<ModuleCandidate> candidates = new ArrayList<ModuleCandidate>();
    static ArrayList<ModuleContainer> containers = new ArrayList<ModuleContainer>();

    /**
     * Get a list of loaded {@link ModuleCandidate}
     */
    public static List<ModuleCandidate> getCandidates() {
        return candidates;
    }

    /**
     * Get a list of loaded {@link ModuleContainer}
     */
    public static List<ModuleContainer> getContainers() {
        return containers;
    }

    /**
     * Returns a {@link ModuleContainer} matching the given name, or null if it is not found
     */
    public static ModuleContainer getContainerForName(String name) {
        for (ModuleContainer container : getContainers())
            if (container.getName().equalsIgnoreCase(name))
                return container;
        return null;
    }

    /**
     * Returns whether or not a module with the given name exists (a != null check on {@link #getContainerForName}
     */
    public static boolean moduleExists(String name) {
        return getContainerForName(name) != null;
    }

}
