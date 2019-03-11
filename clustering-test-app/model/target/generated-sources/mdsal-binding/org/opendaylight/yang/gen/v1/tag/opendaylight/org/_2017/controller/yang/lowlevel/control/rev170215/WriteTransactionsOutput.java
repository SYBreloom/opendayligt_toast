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
 * <i>odl-mdsal-lowlevel-control/write-transactions/output</i>
 * 
 * <p>To create instances of this class use {@link WriteTransactionsOutputBuilder}.
 * @see WriteTransactionsOutputBuilder
 *
 */
public interface WriteTransactionsOutput
    extends
    TransactionsResult,
    RpcOutput,
    Augmentable<WriteTransactionsOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");


}

