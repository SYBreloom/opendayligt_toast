package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * YANG model for car for test application
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car-people</b>
 * <pre>
 * module car-people {
 *   yang-version 1;
 *   namespace urn:opendaylight:params:xml:ns:yang:controller:config:sal-clustering-it:car-people;
 *   prefix car;
 *   import ietf-inet-types {
 *     prefix inet;
 *     revision-date 2013-07-15;
 *   }
 *   import car {
 *     prefix c;
 *     revision-date 2014-08-18;
 *   }
 *   import people {
 *     prefix people;
 *     revision-date 2014-08-18;
 *   }
 *   revision 2014-08-18 {
 *   }
 *   container car-people {
 *     list car-person {
 *       key "car-id person-id";
 *       leaf car-id {
 *         type c:car-id;
 *       }
 *       leaf person-id {
 *         type people:person-id;
 *       }
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface CarPeopleData
    extends
    DataRoot
{




    /**
     * Top-level container for all people car map
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818.CarPeople</code> <code>carPeople</code>, or <code>null</code> if not present
     */
    @Nullable CarPeople getCarPeople();

}

