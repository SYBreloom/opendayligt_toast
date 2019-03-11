package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.cars;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarId;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class CarEntryKey
 implements Identifier<CarEntry> {
    private static final long serialVersionUID = 6825143228170402083L;
    private final CarId _id;


    public CarEntryKey(CarId _id) {
    
    
        this._id = _id;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CarEntryKey(CarEntryKey source) {
        this._id = source._id;
    }


    public CarId getId() {
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
        CarEntryKey other = (CarEntryKey) obj;
        if (!Objects.equals(_id, other._id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(CarEntryKey.class);
        CodeHelpers.appendValue(helper, "_id", _id);
        return helper.toString();
    }
}

