package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215;
import java.lang.String;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-common</b>
 * <pre>
 * grouping constant-grouping {
 *   leaf constant {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-common/constant-grouping</i>
 *
 */
public interface ConstantGrouping
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("constant-grouping");

    /**
     * The string to be returned by llt:get-constant(or llt:get-contexted-constant) RPC
     * implementation.The string typically includes (the context and) the name of the 
     * memberthe user called to cause the RPC implementation registration(that member 
     * may be different from both the member running the implementation,and member 
     * where llt:get-constant is called).
     *
     *
     *
     * @return <code>java.lang.String</code> <code>constant</code>, or <code>null</code> if not present
     */
    @Nullable String getConstant();

}

