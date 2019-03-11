package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import java.lang.Boolean;
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
 *   leaf copy-matches {
 *     type boolean;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/unsubscribe-ddtl/output</i>
 * 
 * <p>To create instances of this class use {@link UnsubscribeDdtlOutputBuilder}.
 * @see UnsubscribeDdtlOutputBuilder
 *
 */
public interface UnsubscribeDdtlOutput
    extends
    RpcOutput,
    Augmentable<UnsubscribeDdtlOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    /**
     * True if and only if the read id-ints is equal to the local copy.
     *
     *
     *
     * @return <code>java.lang.Boolean</code> <code>copyMatches</code>, or <code>null</code> if not present
     */
    @Nullable Boolean isCopyMatches();

}

