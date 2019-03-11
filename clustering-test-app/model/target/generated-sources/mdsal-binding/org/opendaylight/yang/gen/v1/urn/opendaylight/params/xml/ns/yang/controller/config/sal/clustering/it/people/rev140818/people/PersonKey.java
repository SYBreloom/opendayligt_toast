package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.people;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonId;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class PersonKey
 implements Identifier<Person> {
    private static final long serialVersionUID = -7650020816789908247L;
    private final PersonId _id;


    public PersonKey(PersonId _id) {
    
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PersonKey(PersonKey source) {
        this._id = source._id;
    }


    public PersonId getId() {
        return _id;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_id);
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        PersonKey other = (PersonKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(PersonKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
}

