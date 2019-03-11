package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.purchase.rev140818;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car-purchase</b>
 * <pre>
 * input {
 *   leaf person {
 *     ext:context-reference person:person-context;
 *     type person:person-ref;
 *   }
 *   leaf car-id {
 *     type car:car-id;
 *   }
 *   leaf person-id {
 *     type person:person-id;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>car-purchase/buy-car/input</i>
 * 
 * <p>To create instances of this class use {@link BuyCarInputBuilder}.
 * @see BuyCarInputBuilder
 *
 */
public interface BuyCarInput
    extends
    RpcInput,
    Augmentable<BuyCarInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * A reference to a particular person.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonRef</code> <code>person</code>, or <code>null</code> if not present
     */
    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonContext.class
    )
    @Nullable PersonRef getPerson();
    
    /**
     * identifier of car.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarId</code> <code>carId</code>, or <code>null</code> if not present
     */
    @Nullable CarId getCarId();
    
    /**
     * identifier of person.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonId</code> <code>personId</code>, or <code>null</code> if not present
     */
    @Nullable PersonId getPersonId();

}

