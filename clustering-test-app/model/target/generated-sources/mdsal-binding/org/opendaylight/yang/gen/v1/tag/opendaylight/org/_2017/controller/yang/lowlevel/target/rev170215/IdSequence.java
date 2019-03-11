package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215;
import java.lang.Long;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.Notification;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Notification where the publisher is identified by the idand each publish 
 * increases the sequence number.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * notification id-sequence {
 *   uses llc:id-grouping;
 *   leaf sequence-number {
 *     type int64;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-target/id-sequence</i>
 * 
 * <p>To create instances of this class use {@link IdSequenceBuilder}.
 * @see IdSequenceBuilder
 *
 */
public interface IdSequence
    extends
    DataObject,
    Augmentable<IdSequence>,
    IdGrouping,
    Notification
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("id-sequence");

    /**
     * Subscriber shall verify whether this value has increasedsince the previous 
     * notification. The first sequence number published shall be 1.Type is 64 bit to 
     * allow longevity tests, and signed to allow exceptional numbers.
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>sequenceNumber</code>, or <code>null</code> if not present
     */
    @Nullable Long getSequenceNumber();

}

