package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * YANG version of the TOASTER-MIB.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>toaster</b>
 * <pre>
 * module toaster {
 *   yang-version 1;
 *   namespace "http://netconfcentral.org/ns/toaster";
 *   prefix toast;
 *   revision 2009-11-20 {
 *   }
 *   identity toast-type {
 *   }
 *   identity white-bread {
 *     base toast:toast-type;
 *   }
 *   identity wheat-bread {
 *     base toast-type;
 *   }
 *   identity wonder-bread {
 *     base toast-type;
 *   }
 *   identity frozen-waffle {
 *     base toast-type;
 *   }
 *   identity frozen-bagel {
 *     base toast-type;
 *   }
 *   identity hash-brown {
 *     base toast-type;
 *   }
 *   typedef DisplayString {
 *     type string {
 *       length "0 .. 255";
 *     }
 *   }
 *   container toaster {
 *     presence "Indicates the toaster service is available";
 *     leaf toasterManufacturer {
 *       type DisplayString;
 *       config false;
 *     }
 *     leaf toasterModelNumber {
 *       type DisplayString;
 *       config false;
 *     }
 *     leaf toasterStatus {
 *       type enumeration {
 *         enum up {
 *           value 1;
 *         }
 *         enum down {
 *           value 2;
 *         }
 *       }
 *       config false;
 *     }
 *     leaf darknessFactor {
 *       type uint32;
 *       default 1000;
 *     }
 *   }
 *   rpc make-toast {
 *     input {
 *       leaf toasterDoneness {
 *         type uint32 {
 *           range "1 .. 10";
 *         }
 *         default 5;
 *       }
 *       leaf toasterToastType {
 *         type identityref {
 *           base toast:toast-type;
 *         }
 *         default wheat-bread;
 *       }
 *     }
 *     output;
 *   }
 *   rpc cancel-toast {
 *     input;
 *     output;
 *   }
 *   rpc restock-toaster {
 *     input {
 *       leaf amountOfBreadToStock {
 *         type uint32;
 *       }
 *     }
 *     output;
 *   }
 *   notification toasterOutOfBread {
 *   }
 *   notification toasterRestocked {
 *     leaf amountOfBread {
 *       type uint32;
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface ToasterData
    extends
    DataRoot
{




    /**
     * Top-level container for all toaster database objects.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.Toaster</code> <code>toaster</code>, or <code>null</code> if not present
     */
    @Nullable Toaster getToaster();

}

