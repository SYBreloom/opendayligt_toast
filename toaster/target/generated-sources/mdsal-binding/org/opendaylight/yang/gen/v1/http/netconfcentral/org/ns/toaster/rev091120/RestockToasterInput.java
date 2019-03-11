package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import java.lang.Long;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>toaster</b>
 * <pre>
 * input {
 *   leaf amountOfBreadToStock {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>toaster/restock-toaster/input</i>
 * 
 * <p>To create instances of this class use {@link RestockToasterInputBuilder}.
 * @see RestockToasterInputBuilder
 *
 */
public interface RestockToasterInput
    extends
    RpcInput,
    Augmentable<RestockToasterInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * Indicates the amount of bread to re-stock
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>amountOfBreadToStock</code>, or <code>null</code> if not present
     */
    @Nullable Long getAmountOfBreadToStock();

}

