package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import java.lang.String;
import java.util.List;
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
 *   leaf-list replicas {
 *     min-elements 1;
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/create-prefix-shard/input</i>
 * 
 * <p>To create instances of this class use {@link CreatePrefixShardInputBuilder}.
 * @see CreatePrefixShardInputBuilder
 *
 */
public interface CreatePrefixShardInput
    extends
    RpcInput,
    Augmentable<CreatePrefixShardInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * @return <code>org.opendaylight.yangtools.yang.binding.InstanceIdentifier</code> <code>prefix</code>, or <code>null</code> if not present
     */
    @Nullable InstanceIdentifier<?> getPrefix();
    
    /**
     * @return <code>java.util.List</code> <code>replicas</code>, or <code>null</code> if not present
     */
    @Nullable List<String> getReplicas();

}

