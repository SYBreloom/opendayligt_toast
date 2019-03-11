package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import java.lang.Long;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-control</b>
 * <pre>
 * output {
 *   leaf all-not {
 *     type int64;
 *   }
 *   leaf id-not {
 *     type int64;
 *   }
 *   leaf err-not {
 *     type int64;
 *   }
 *   leaf local-number {
 *     type int64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/unsubscribe-ynl/output</i>
 * 
 * <p>To create instances of this class use {@link UnsubscribeYnlOutputBuilder}.
 * @see UnsubscribeYnlOutputBuilder
 *
 */
public interface UnsubscribeYnlOutput
    extends
    RpcOutput,
    Augmentable<UnsubscribeYnlOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    /**
     * Number of received id-sequence notifications of any id.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>allNot</code>, or <code>null</code> if not present
     */
    @Nullable Long getAllNot();
    
    /**
     * Number of received id-sequence notifications of matching idand any sequence 
     * number.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>idNot</code>, or <code>null</code> if not present
     */
    @Nullable Long getIdNot();
    
    /**
     * Number of received id-sequence notifications of matching id,but out-of-order 
     * sequence number.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>errNot</code>, or <code>null</code> if not present
     */
    @Nullable Long getErrNot();
    
    /**
     * Value of the local number, should be equal tothe sequence number of the last 
     * compatible id-sequence notification received.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>localNumber</code>, or <code>null</code> if not present
     */
    @Nullable Long getLocalNumber();

}

