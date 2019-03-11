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
 * <i>odl-mdsal-lowlevel-control/shutdown-prefix-shard-replica/input</i>
 * 
 * <p>To create instances of this class use {@link ShutdownPrefixShardReplicaInputBuilder}.
 * @see ShutdownPrefixShardReplicaInputBuilder
 *
 */
public interface ShutdownPrefixShardReplicaInput
    extends
    RpcInput,
    Augmentable<ShutdownPrefixShardReplicaInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * The prefix of the configuration data store prefix-based shard to be 
     * shutdowngracefully.
     *
     *
     *
     * @return <code>org.opendaylight.yangtools.yang.binding.InstanceIdentifier</code> <code>prefix</code>, or <code>null</code> if not present
     */
    @Nullable InstanceIdentifier<?> getPrefix();

}

