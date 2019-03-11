package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * YANG model for person for test application
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>people</b>
 * <pre>
 * module people {
 *   yang-version 1;
 *   namespace urn:opendaylight:params:xml:ns:yang:controller:config:sal-clustering-it:people;
 *   prefix people;
 *   import ietf-inet-types {
 *     prefix inet;
 *     revision-date 2013-07-15;
 *   }
 *   revision 2014-08-18 {
 *   }
 *   typedef person-id {
 *     type inet:uri;
 *   }
 *   typedef person-ref {
 *     type instance-identifier;
 *   }
 *   identity person-context {
 *   }
 *   grouping person {
 *     leaf id {
 *       type person-id;
 *     }
 *     leaf gender {
 *       type string;
 *     }
 *     leaf age {
 *       type uint32;
 *     }
 *     leaf address {
 *       type string;
 *     }
 *     leaf contactNo {
 *       type string;
 *     }
 *   }
 *   container people {
 *     list person {
 *       key id;
 *       uses person;
 *     }
 *   }
 *   rpc add-person {
 *     input {
 *       uses person;
 *     }
 *     output;
 *   }
 * }
 * </pre>
 *
 */
public interface PeopleData
    extends
    DataRoot
{




    /**
     * Top-level container for all people
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.People</code> <code>people</code>, or <code>null</code> if not present
     */
    @Nullable People getPeople();

}

