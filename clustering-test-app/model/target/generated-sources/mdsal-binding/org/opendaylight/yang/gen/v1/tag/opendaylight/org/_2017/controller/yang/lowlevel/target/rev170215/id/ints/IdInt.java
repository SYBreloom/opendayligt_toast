package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints;
import java.lang.Override;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.IdInts;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int.Item;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A list of integers nested in list of ids.Ids are there to avoid 
 * OptimisticLockFailures from different writers.Typical use of the int list is to 
 * generate data change notifications.Config is true, in order to allow Restconf 
 * reset content at will.Expected writes should create and delete items at random, 
 * values 0 .. 2^20.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * list id-int {
 *   key id;
 *   uses llc:id-grouping;
 *   list item {
 *     key number;
 *     leaf number {
 *       type int32;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-target/id-ints/id-int</i>
 * 
 * <p>To create instances of this class use {@link IdIntBuilder}.
 * @see IdIntBuilder
 * @see IdIntKey
 *
 */
public interface IdInt
    extends
    ChildOf<IdInts>,
    Augmentable<IdInt>,
    IdGrouping,
    Identifiable<IdIntKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("id-int");

    /**
     * Unsorted keyed list item. One write should create or delete up to one item.
     *
     *
     *
     * @return <code>java.util.List</code> <code>item</code>, or <code>null</code> if not present
     */
    @Nullable List<Item> getItem();
    
    /**
     * @return <code>java.util.List</code> <code>item</code>, or an empty list if it is not present
     */
    default @NonNull List<Item> nonnullItem() {
        return CodeHelpers.nonnull(getItem());
    }
    
    @Override
    IdIntKey key();

}

