package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import java.lang.Long;
import org.eclipse.jdt.annotation.Nullable;
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
 * notification toasterRestocked {
 *   leaf amountOfBread {
 *     type uint32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>toaster/toasterRestocked</i>
 * 
 * <p>To create instances of this class use {@link ToasterRestockedBuilder}.
 * @see ToasterRestockedBuilder
 *
 */
public interface ToasterRestocked
    extends
    DataObject,
    Augmentable<ToasterRestocked>,
    Notification
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("toasterRestocked");

    /**
     * Indicates the amount of bread that was re-stocked
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>amountOfBread</code>, or <code>null</code> if not present
     */
    @Nullable Long getAmountOfBread();

}

