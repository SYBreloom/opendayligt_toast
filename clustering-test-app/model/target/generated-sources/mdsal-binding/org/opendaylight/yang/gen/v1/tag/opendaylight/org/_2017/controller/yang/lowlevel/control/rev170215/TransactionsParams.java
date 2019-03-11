package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import java.lang.Long;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-control</b>
 * <pre>
 * grouping transactions-params {
 *   leaf seconds {
 *     type uint32;
 *   }
 *   leaf transactions-per-second {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/transactions-params</i>
 *
 */
public interface TransactionsParams
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("transactions-params");

    /**
     * This RPC has to work (roughly) this long.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>seconds</code>, or <code>null</code> if not present
     */
    @Nullable Long getSeconds();
    
    /**
     * An upper limit of transactions per second this RPC shall try to achieve.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>transactionsPerSecond</code>, or <code>null</code> if not present
     */
    @Nullable Long getTransactionsPerSecond();

}

