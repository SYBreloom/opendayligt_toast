package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818.car.people;
import java.lang.Override;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818.CarPeople;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonId;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A mapping of cars and people.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car-people</b>
 * <pre>
 * list car-person {
 *   key "car-id person-id";
 *   leaf car-id {
 *     type c:car-id;
 *   }
 *   leaf person-id {
 *     type people:person-id;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>car-people/car-people/car-person</i>
 * 
 * <p>To create instances of this class use {@link CarPersonBuilder}.
 * @see CarPersonBuilder
 * @see CarPersonKey
 *
 */
public interface CarPerson
    extends
    ChildOf<CarPeople>,
    Augmentable<CarPerson>,
    Identifiable<CarPersonKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("car-person");

    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarId</code> <code>carId</code>, or <code>null</code> if not present
     */
    @Nullable CarId getCarId();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonId</code> <code>personId</code>, or <code>null</code> if not present
     */
    @Nullable PersonId getPersonId();
    
    @Override
    CarPersonKey key();

}

