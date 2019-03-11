package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * Elements to test, which are not to be backed by any default implementationupon 
 * feature installation.See odl-mdsal-lowlevel-control (ll) for methods how to 
 * assign implementation in runtime.This is separate module from 
 * odl-mdsal-lowlevel-control to simplify binding awareimplementation, which 
 * requires either all or no RPCs to be backed up by a single Java instance.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * module odl-mdsal-lowlevel-target {
 *   yang-version 1;
 *   namespace tag:opendaylight.org,2017:controller:yang:lowlevel:target;
 *   prefix llt;
 *   import odl-mdsal-lowlevel-common {
 *     revision-date 2017-02-15;
 *     prefix llc;
 *   }
 *   revision 2017-02-15 {
 *   }
 *   rpc get-constant {
 *     output {
 *       uses llc:constant-grouping;
 *     }
 *     input;
 *   }
 *   rpc get-contexted-constant {
 *     input {
 *       uses llc:context-grouping;
 *     }
 *     output {
 *       uses llc:constant-grouping;
 *     }
 *   }
 *   rpc get-singleton-constant {
 *     output {
 *       uses llc:constant-grouping;
 *     }
 *     input;
 *   }
 *   notification id-sequence {
 *     uses llc:id-grouping;
 *     leaf sequence-number {
 *       type int64;
 *     }
 *   }
 *   container id-ints {
 *     list id-int {
 *       key id;
 *       uses llc:id-grouping;
 *       list item {
 *         key number;
 *         leaf number {
 *           type int32;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface OdlMdsalLowlevelTargetData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.IdInts</code> <code>idInts</code>, or <code>null</code> if not present
     */
    @Nullable IdInts getIdInts();

}

