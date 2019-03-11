package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * YANG model for car for test application
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car</b>
 * <pre>
 * module car {
 *   yang-version 1;
 *   namespace urn:opendaylight:params:xml:ns:yang:controller:config:sal-clustering-it:car;
 *   prefix car;
 *   import ietf-inet-types {
 *     prefix inet;
 *     revision-date 2013-07-15;
 *   }
 *   revision 2014-08-18 {
 *   }
 *   typedef car-id {
 *     type inet:uri;
 *   }
 *   grouping car-entry {
 *     leaf id {
 *       type car-id;
 *     }
 *     leaf model {
 *       type string;
 *     }
 *     leaf manufacturer {
 *       type string;
 *     }
 *     leaf year {
 *       type uint32;
 *     }
 *     leaf category {
 *       type string;
 *     }
 *   }
 *   container cars {
 *     list car-entry {
 *       key id;
 *       uses car-entry;
 *     }
 *   }
 *   rpc stress-test {
 *     input {
 *       leaf rate {
 *         type uint16;
 *       }
 *       leaf count {
 *         type uint32;
 *         default 0;
 *       }
 *     }
 *     output;
 *   }
 *   rpc stop-stress-test {
 *     output {
 *       leaf success-count {
 *         type uint32;
 *         default 0;
 *       }
 *       leaf failure-count {
 *         type uint32;
 *         default 0;
 *       }
 *     }
 *     input;
 *   }
 *   rpc register-ownership {
 *     input {
 *       leaf car-id {
 *         type string;
 *       }
 *     }
 *     output;
 *   }
 *   rpc unregister-ownership {
 *     input {
 *       leaf car-id {
 *         type string;
 *       }
 *     }
 *     output;
 *   }
 *   rpc register-logging-dtcl {
 *     input;
 *     output;
 *   }
 *   rpc unregister-logging-dtcls {
 *     input;
 *     output;
 *   }
 *   rpc register-commit-cohort {
 *     input;
 *     output;
 *   }
 *   rpc unregister-commit-cohort {
 *     input;
 *     output;
 *   }
 * }
 * </pre>
 *
 */
public interface CarData
    extends
    DataRoot
{




    /**
     * Top-level container for all car objects.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.Cars</code> <code>cars</code>, or <code>null</code> if not present
     */
    @Nullable Cars getCars();

}

