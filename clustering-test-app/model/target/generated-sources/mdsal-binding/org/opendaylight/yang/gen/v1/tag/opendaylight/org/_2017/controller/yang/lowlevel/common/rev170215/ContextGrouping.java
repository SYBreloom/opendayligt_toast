package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.annotations.RoutingContext;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-common</b>
 * <pre>
 * grouping context-grouping {
 *   leaf context {
 *     ext:context-reference constant-context;
 *     type instance-identifier;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-common/context-grouping</i>
 *
 */
public interface ContextGrouping
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("context-grouping");

    /**
     * The context for bound implementation ofllt:get-contexted-constant RPC to 
     * match.The extension has no data, users are free to use instance 
     * identifiersreferring to (non-existent) items of rpc-context list.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.binding.InstanceIdentifier</code> <code>context</code>, or <code>null</code> if not present
     */
    @RoutingContext
    (
    value=org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ConstantContext.class
    )
    @Nullable InstanceIdentifier<?> getContext();

}

