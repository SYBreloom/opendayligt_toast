package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import java.lang.String;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-control</b>
 * <pre>
 * input {
 *   leaf shard-name {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/shutdown-shard-replica/input</i>
 * 
 * <p>To create instances of this class use {@link ShutdownShardReplicaInputBuilder}.
 * @see ShutdownShardReplicaInputBuilder
 *
 */
public interface ShutdownShardReplicaInput
    extends
    RpcInput,
    Augmentable<ShutdownShardReplicaInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * The name of the configuration data store module-based shard to be 
     * shutdowngracefully.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shardName</code>, or <code>null</code> if not present
     */
    @Nullable String getShardName();

}

