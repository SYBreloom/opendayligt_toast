package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * Declarations to be used both in odl-mdsal-lowlevel-target (llt)and 
 * odl-mdsal-lowlevel-control (ll).
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-common</b>
 * <pre>
 * module odl-mdsal-lowlevel-common {
 *   yang-version 1;
 *   namespace tag:opendaylight.org,2017:controller:yang:lowlevel:common;
 *   prefix llc;
 *   import yang-ext {
 *     prefix ext;
 *     revision-date 2013-07-09;
 *   }
 *   revision 2017-02-15 {
 *   }
 *   grouping id-grouping {
 *     leaf id {
 *       type string;
 *     }
 *   }
 *   grouping constant-grouping {
 *     leaf constant {
 *       type string;
 *     }
 *   }
 *   identity constant-context {
 *   }
 *   list rpc-context {
 *     config false;
 *     key identifier;
 *     leaf identifier {
 *       type string;
 *     }
 *   }
 *   grouping context-grouping {
 *     leaf context {
 *       ext:context-reference constant-context;
 *       type instance-identifier;
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface OdlMdsalLowlevelCommonData
    extends
    DataRoot
{




    /**
     * Routed RPCs need to be registered with a path.It has to be an 
     * instance-identifier within an accessible model,but the instance does not have to
     * be present in data tree.This is config false to signal users they do not need to
     * create any instance.
     *
     *
     *
     * @return <code>java.util.List</code> <code>rpcContext</code>, or <code>null</code> if not present
     */
    @Nullable List<RpcContext> getRpcContext();
    
    /**
     * @return <code>java.util.List</code> <code>rpcContext</code>, or an empty list if it is not present
     */
    default @NonNull List<RpcContext> nonnullRpcContext() {
        return CodeHelpers.nonnull(getRpcContext());
    }

}

