package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818.car.people;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonId;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class CarPersonKey
 implements Identifier<CarPerson> {
    private static final long serialVersionUID = -5396737921661406221L;
    private final CarId _carId;
    private final PersonId _personId;


    public CarPersonKey(CarId _carId, PersonId _personId) {
    
    
        this._carId = _carId;
        this._personId = _personId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CarPersonKey(CarPersonKey source) {
        this._carId = source._carId;
        this._personId = source._personId;
    }


    public CarId getCarId() {
        return _carId;
    }
    
    public PersonId getPersonId() {
        return _personId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_carId);
        result = prime * result + Objects.hashCode(_personId);
        return result;
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
        CarPersonKey other = (CarPersonKey) obj;
        if (!Objects.equals(_carId, other._carId)) {
            return false;
        }
        if (!Objects.equals(_personId, other._personId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(CarPersonKey.class);
        CodeHelpers.appendValue(helper, "_carId", _carId);
        CodeHelpers.appendValue(helper, "_personId", _personId);
        return helper.toString();
    }
}

