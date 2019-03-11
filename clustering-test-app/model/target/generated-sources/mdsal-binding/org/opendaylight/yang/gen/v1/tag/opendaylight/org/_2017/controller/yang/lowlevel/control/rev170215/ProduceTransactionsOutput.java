package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-control</b>
 * <pre>
 * output {
 *   uses transactions-result;
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/produce-transactions/output</i>
 * 
 * <p>To create instances of this class use {@link ProduceTransactionsOutputBuilder}.
 * @see ProduceTransactionsOutputBuilder
 *
 */
public interface ProduceTransactionsOutput
    extends
    TransactionsResult,
    RpcOutput,
    Augmentable<ProduceTransactionsOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");


}

