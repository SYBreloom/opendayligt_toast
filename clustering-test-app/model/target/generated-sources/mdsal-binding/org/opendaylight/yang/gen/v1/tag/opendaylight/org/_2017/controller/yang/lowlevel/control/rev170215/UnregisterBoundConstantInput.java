package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ContextGrouping;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.RpcInput;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-control</b>
 * <pre>
 * input {
 *   uses llc:context-grouping;
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-control/unregister-bound-constant/input</i>
 * 
 * <p>To create instances of this class use {@link UnregisterBoundConstantInputBuilder}.
 * @see UnregisterBoundConstantInputBuilder
 *
 */
public interface UnregisterBoundConstantInput
    extends
    ContextGrouping,
    RpcInput,
    Augmentable<UnregisterBoundConstantInput>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input");


}

