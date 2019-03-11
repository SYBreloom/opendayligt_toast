package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818;
import java.util.List;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.people.Person;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Top-level container for all people
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>people</b>
 * <pre>
 * container people {
 *   list person {
 *     key id;
 *     uses person;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>people/people</i>
 * 
 * <p>To create instances of this class use {@link PeopleBuilder}.
 * @see PeopleBuilder
 *
 */
public interface People
    extends
    ChildOf<PeopleData>,
    Augmentable<People>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("people");

    /**
     * A list of people (as defined by the 'grouping person').
     *
     *
     *
     * @return <code>java.util.List</code> <code>person</code>, or <code>null</code> if not present
     */
    @Nullable List<Person> getPerson();
    
    /**
     * @return <code>java.util.List</code> <code>person</code>, or an empty list if it is not present
     */
    default @NonNull List<Person> nonnullPerson() {
        return CodeHelpers.nonnull(getPerson());
    }

}

