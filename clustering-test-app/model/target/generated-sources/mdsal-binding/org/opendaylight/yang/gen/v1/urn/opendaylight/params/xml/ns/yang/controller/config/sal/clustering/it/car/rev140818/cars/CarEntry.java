package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.cars;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.Cars;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A list of cars (as defined by the 'grouping car-entry').
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car</b>
 * <pre>
 * list car-entry {
 *   key id;
 *   uses car-entry;
 * }
 * </pre>The schema path to identify an instance is
 * <i>car/cars/car-entry</i>
 * 
 * <p>To create instances of this class use {@link CarEntryBuilder}.
 * @see CarEntryBuilder
 * @see CarEntryKey
 *
 */
public interface CarEntry
    extends
    ChildOf<Cars>,
    Augmentable<CarEntry>,
    org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarEntry,
    Identifiable<CarEntryKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("car-entry");

    @Override
    CarEntryKey key();

}

