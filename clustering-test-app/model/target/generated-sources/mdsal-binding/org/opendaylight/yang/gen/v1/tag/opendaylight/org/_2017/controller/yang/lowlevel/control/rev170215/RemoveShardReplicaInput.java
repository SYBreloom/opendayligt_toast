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
 * <i>odl-mdsal-lowlevel-control/remove-shard-replica/input</i>
 * 
 * <p>To create instances of this class use {@link RemoveShardReplicaInputBuilder}.
 * @see RemoveShardReplicaInputBuilder
 *
 */
public interface RemoveShardReplicaInput
    extends
    RpcInput,
    Augmentable<RemoveShardReplicaInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * The name of the config shard for whichto remove the replica on the current 
     * member.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>shardName</code>, or <code>null</code> if not present
     */
    @Nullable String getShardName();

}

