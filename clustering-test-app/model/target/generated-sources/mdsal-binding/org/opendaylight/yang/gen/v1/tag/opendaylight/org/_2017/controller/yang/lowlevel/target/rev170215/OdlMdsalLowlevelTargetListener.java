package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215;
import org.opendaylight.yangtools.yang.binding.NotificationListener;

/**
 * Interface for implementing the following YANG notifications defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * notification id-sequence {
 *   uses llc:id-grouping;
 *   leaf sequence-number {
 *     type int64;
 *   }
 * }
 * </pre>
 *
 */
public interface OdlMdsalLowlevelTargetListener
    extends
    NotificationListener
{




    /**
     * Notification where the publisher is identified by the idand each publish 
     * increases the sequence number.
     *
     */
    void onIdSequence(IdSequence notification);

}

