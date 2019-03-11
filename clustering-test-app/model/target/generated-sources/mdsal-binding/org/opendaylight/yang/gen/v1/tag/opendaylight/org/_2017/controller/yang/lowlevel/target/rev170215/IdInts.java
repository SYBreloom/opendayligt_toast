package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.IdInt;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * container id-ints {
 *   list id-int {
 *     key id;
 *     uses llc:id-grouping;
 *     list item {
 *       key number;
 *       leaf number {
 *         type int32;
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-target/id-ints</i>
 * 
 * <p>To create instances of this class use {@link IdIntsBuilder}.
 * @see IdIntsBuilder
 *
 */
public interface IdInts
    extends
    ChildOf<OdlMdsalLowlevelTargetData>,
    Augmentable<IdInts>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("id-ints");

    /**
     * A list of integers nested in list of ids.Ids are there to avoid 
     * OptimisticLockFailures from different writers.Typical use of the int list is to 
     * generate data change notifications.Config is true, in order to allow Restconf to
     * reset content at will.Expected writes should create and delete items at random, 
     * values 0 .. 2^20.
     *
     *
     *
     * @return <code>java.util.List</code> <code>idInt</code>, or <code>null</code> if not present
     */
    @Nullable List<IdInt> getIdInt();
    
    /**
     * @return <code>java.util.List</code> <code>idInt</code>, or an empty list if it is not present
     */
    default @NonNull List<IdInt> nonnullIdInt() {
        return CodeHelpers.nonnull(getIdInt());
    }

}

