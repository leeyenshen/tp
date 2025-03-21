package seedu.address.model;

import javafx.collections.ObservableList;
import seedu.address.model.tenant.Tenant;

/**
 * Unmodifiable view of an address book
 */
public interface ReadOnlyTenantTracker {

    /**
     * Returns an unmodifiable view of the persons list. This list will not contain any duplicate
     * persons.
     */
    ObservableList<Tenant> getTenantList();

}
