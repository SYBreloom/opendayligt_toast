package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.purchase.rev140818;
import org.opendaylight.yangtools.yang.binding.NotificationListener;

/**
 * Interface for implementing the following YANG notifications defined in module <b>car-purchase</b>
 * <pre>
 * notification carBought {
 *   leaf car-id {
 *     type car:car-id;
 *   }
 *   leaf person-id {
 *     type person:person-id;
 *   }
 * }
 * </pre>
 *
 */
public interface CarPurchaseListener
    extends
    NotificationListener
{




    /**
     * Indicates that a person bought a car.
     *
     */
    void onCarBought(CarBought notification);

}

