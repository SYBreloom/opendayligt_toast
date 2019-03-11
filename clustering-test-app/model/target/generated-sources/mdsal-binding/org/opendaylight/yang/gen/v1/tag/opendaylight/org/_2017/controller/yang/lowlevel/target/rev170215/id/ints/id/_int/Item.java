package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int;
import java.lang.Integer;
import java.lang.Override;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.IdInt;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Unsorted keyed list item. One write should create or delete up to one item.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>odl-mdsal-lowlevel-target</b>
 * <pre>
 * list item {
 *   key number;
 *   leaf number {
 *     type int32;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>odl-mdsal-lowlevel-target/id-ints/id-int/item</i>
 * 
 * <p>To create instances of this class use {@link ItemBuilder}.
 * @see ItemBuilder
 * @see ItemKey
 *
 */
public interface Item
    extends
    ChildOf<IdInt>,
    Augmentable<Item>,
    Identifiable<ItemKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("item");

    /**
     * The integer value of this item.Not range restricted, to allow more scenarios.
     *
     *
     *
     * @return <code>java.lang.Integer</code> <code>number</code>, or <code>null</code> if not present
     */
    @Nullable Integer getNumber();
    
    @Override
    ItemKey key();

}

