package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class IdIntKey
 implements Identifier<IdInt> {
    private static final long serialVersionUID = -4008468233213511294L;
    private final String _id;


    public IdIntKey(String _id) {
    
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public IdIntKey(IdIntKey source) {
        this._id = source._id;
    }


    public String getId() {
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
        IdIntKey other = (IdIntKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(IdIntKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
}

