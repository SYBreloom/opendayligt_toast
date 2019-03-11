package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Indicates that the toaster has run of out bread.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>toaster</b>
 * <pre>
 * notification toasterOutOfBread {
 * }
 * </pre>The schema path to identify an instance is
 * <i>toaster/toasterOutOfBread</i>
 * 
 * <p>To create instances of this class use {@link ToasterOutOfBreadBuilder}.
 * @see ToasterOutOfBreadBuilder
 *
 */
public interface ToasterOutOfBread
    extends
    DataObject,
    Augmentable<ToasterOutOfBread>,
    Notification
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("toasterOutOfBread");


}

