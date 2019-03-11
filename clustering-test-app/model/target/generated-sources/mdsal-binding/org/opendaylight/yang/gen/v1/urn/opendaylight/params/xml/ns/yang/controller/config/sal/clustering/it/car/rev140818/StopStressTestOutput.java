package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
import java.lang.Long;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>car</b>
 * <pre>
 * output {
 *   leaf success-count {
 *     type uint32;
 *     default 0;
 *   }
 *   leaf failure-count {
 *     type uint32;
 *     default 0;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>car/stop-stress-test/output</i>
 * 
 * <p>To create instances of this class use {@link StopStressTestOutputBuilder}.
 * @see StopStressTestOutputBuilder
 *
 */
public interface StopStressTestOutput
    extends
    RpcOutput,
    Augmentable<StopStressTestOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");

    /**
     * Total number of cars created when running stess-test rpc
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>successCount</code>, or <code>null</code> if not present
     */
    @Nullable Long getSuccessCount();
    
    /**
     * Total number of cars failed when running stess-test rpc
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>failureCount</code>, or <code>null</code> if not present
     */
    @Nullable Long getFailureCount();

}

