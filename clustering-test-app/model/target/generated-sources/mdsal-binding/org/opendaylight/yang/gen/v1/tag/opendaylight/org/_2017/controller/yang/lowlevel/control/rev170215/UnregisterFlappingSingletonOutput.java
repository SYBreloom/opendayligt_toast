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
 *   leaf flap-count {
 *     type int64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/unregister-flapping-singleton/output</i>
 * 
 * <p>To create instances of this class use {@link UnregisterFlappingSingletonOutputBuilder}.
 * @see UnregisterFlappingSingletonOutputBuilder
 *
 */
public interface UnregisterFlappingSingletonOutput
    extends
    RpcOutput,
    Augmentable<UnregisterFlappingSingletonOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    /**
     * Number of successful re-registrations. If negative,(minus) cycle number when a 
     * failure occured.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>flapCount</code>, or <code>null</code> if not present
     */
    @Nullable Long getFlapCount();

}

