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
 * grouping id-grouping {
 *   leaf id {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-common/id-grouping</i>
 *
 */
public interface IdGrouping
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("id-grouping");

    /**
     * Any string uniquely identifying the publisher, producer or writer,typically 
     * containing the member name.
     *
     *
     *
     * @return <code>java.lang.String</code> <code>id</code>, or <code>null</code> if not present
     */
    @Nullable String getId();

}

