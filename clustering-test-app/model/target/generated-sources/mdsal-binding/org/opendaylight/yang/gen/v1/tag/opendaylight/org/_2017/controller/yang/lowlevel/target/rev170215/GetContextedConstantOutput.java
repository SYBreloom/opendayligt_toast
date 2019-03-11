package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ConstantGrouping;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcOutput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * output {
 *   uses llc:constant-grouping;
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-target/get-contexted-constant/output</i>
 * 
 * <p>To create instances of this class use {@link GetContextedConstantOutputBuilder}.
 * @see GetContextedConstantOutputBuilder
 *
 */
public interface GetContextedConstantOutput
    extends
    ConstantGrouping,
    RpcOutput,
    Augmentable<GetContextedConstantOutput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("output");


}

