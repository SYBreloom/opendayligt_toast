package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ConstantGrouping;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-control</b>
 * <pre>
 * input {
 *   uses llc:constant-grouping;
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/register-singleton-constant/input</i>
 * 
 * <p>To create instances of this class use {@link RegisterSingletonConstantInputBuilder}.
 * @see RegisterSingletonConstantInputBuilder
 *
 */
public interface RegisterSingletonConstantInput
    extends
    ConstantGrouping,
    RpcInput,
    Augmentable<RegisterSingletonConstantInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");


}

