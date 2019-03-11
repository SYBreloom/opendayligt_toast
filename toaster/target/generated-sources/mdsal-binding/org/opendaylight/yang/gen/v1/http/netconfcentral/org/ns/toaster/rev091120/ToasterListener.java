package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.NotificationListener;

/**
 * Interface for implementing the following YANG notifications defined in module <b>toaster</b>
 * <pre>
 * notification toasterRestocked {
 *   leaf amountOfBread {
 *     type uint32;
 *   }
 * }
 * notification toasterOutOfBread {
 * }
 * </pre>
 *
 */
public interface ToasterListener
    extends
    NotificationListener
{




    /**
     * Indicates that the toaster has run of out bread.
     *
     */
    void onToasterRestocked(ToasterRestocked notification);
    
    /**
     * Indicates that the toaster has run of out bread.
     *
     */
    void onToasterOutOfBread(ToasterOutOfBread notification);

}

