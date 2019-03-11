package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ContextGrouping;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * input {
 *   uses llc:context-grouping;
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-target/get-contexted-constant/input</i>
 * 
 * <p>To create instances of this class use {@link GetContextedConstantInputBuilder}.
 * @see GetContextedConstantInputBuilder
 *
 */
public interface GetContextedConstantInput
    extends
    ContextGrouping,
    RpcInput,
    Augmentable<GetContextedConstantInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");


}

