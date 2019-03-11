package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-control</b>
 * <pre>
 * input {
 *   leaf prefix {
 *     type instance-identifier;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/remove-prefix-shard/input</i>
 * 
 * <p>To create instances of this class use {@link RemovePrefixShardInputBuilder}.
 * @see RemovePrefixShardInputBuilder
 *
 */
public interface RemovePrefixShardInput
    extends
    RpcInput,
    Augmentable<RemovePrefixShardInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * @return <code>org.opendaylight.yangtools.yang.binding.InstanceIdentifier</code> <code>prefix</code>, or <code>null</code> if not present
     */
    @Nullable InstanceIdentifier<?> getPrefix();

}

