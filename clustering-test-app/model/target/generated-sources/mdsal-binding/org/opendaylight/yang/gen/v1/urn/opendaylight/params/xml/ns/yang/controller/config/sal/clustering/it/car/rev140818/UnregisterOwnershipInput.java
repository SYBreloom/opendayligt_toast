package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
import java.lang.String;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car</b>
 * <pre>
 * input {
 *   leaf car-id {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>car/unregister-ownership/input</i>
 * 
 * <p>To create instances of this class use {@link UnregisterOwnershipInputBuilder}.
 * @see UnregisterOwnershipInputBuilder
 *
 */
public interface UnregisterOwnershipInput
    extends
    RpcInput,
    Augmentable<UnregisterOwnershipInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * @return <code>java.lang.String</code> <code>carId</code>, or <code>null</code> if not present
     */
    @Nullable String getCarId();

}

