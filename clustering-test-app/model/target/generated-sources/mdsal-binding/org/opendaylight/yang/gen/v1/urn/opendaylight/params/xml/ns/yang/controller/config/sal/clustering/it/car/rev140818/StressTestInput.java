package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
import java.lang.Integer;
import java.lang.Long;
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
 *   leaf rate {
 *     type uint16;
 *   }
 *   leaf count {
 *     type uint32;
 *     default 0;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>car/stress-test/input</i>
 * 
 * <p>To create instances of this class use {@link StressTestInputBuilder}.
 * @see StressTestInputBuilder
 *
 */
public interface StressTestInput
    extends
    RpcInput,
    Augmentable<StressTestInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");

    /**
     * The rate is a measure of the number of car-entry(s) added per second.Thus the 
     * rate is measured in terms of transactions per second. Therate is not necessary 
     * achievable; the controller may not keep up withthe specified value. In this 
     * instance, rate is considered maximum rate.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>rate</code>, or <code>null</code> if not present
     */
    @Nullable Integer getRate();
    
    /**
     * Number of cars to create. Zero implies unlimited cars; usestop-stress-test rpc 
     * to stop the test.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>count</code>, or <code>null</code> if not present
     */
    @Nullable Long getCount();

}

