package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818.car.people.CarPerson;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link CarPeopleBuilder} instances.
 * 
 * @see CarPeopleBuilder
 *
 */
public class CarPeopleBuilder implements Builder<CarPeople> {

    private List<CarPerson> _carPerson;


    Map<Class<? extends Augmentation<CarPeople>>, Augmentation<CarPeople>> augmentation = Collections.emptyMap();

    public CarPeopleBuilder() {
    }

    public CarPeopleBuilder(CarPeople base) {
        this._carPerson = base.getCarPerson();
        if (base instanceof CarPeopleImpl) {
            CarPeopleImpl impl = (CarPeopleImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CarPeople>>, Augmentation<CarPeople>> aug =((AugmentationHolder<CarPeople>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public List<CarPerson> getCarPerson() {
        return _carPerson;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CarPeople>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public CarPeopleBuilder setCarPerson(final List<CarPerson> values) {
        this._carPerson = values;
        return this;
    }
    
    
    public CarPeopleBuilder addAugmentation(Class<? extends Augmentation<CarPeople>> augmentationType, Augmentation<CarPeople> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CarPeopleBuilder removeAugmentation(Class<? extends Augmentation<CarPeople>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CarPeople build() {
        return new CarPeopleImpl(this);
    }

    private static final class CarPeopleImpl implements CarPeople {
    
        private final List<CarPerson> _carPerson;
    
        private Map<Class<? extends Augmentation<CarPeople>>, Augmentation<CarPeople>> augmentation = Collections.emptyMap();
    
        CarPeopleImpl(CarPeopleBuilder base) {
            this._carPerson = base.getCarPerson();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CarPeople> getImplementedInterface() {
            return CarPeople.class;
        }
    
        @Override
        public List<CarPerson> getCarPerson() {
            return _carPerson;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CarPeople>> E augmentation(Class<E> augmentationType) {
            return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
        }
    
        private int hash = 0;
        private volatile boolean hashValid = false;
        
        @Override
        public int hashCode() {
            if (hashValid) {
                return hash;
            }
        
            final int prime = 31;
            int result = 1;
            result = prime * result + Objects.hashCode(_carPerson);
            result = prime * result + Objects.hashCode(augmentation);
        
            hash = result;
            hashValid = true;
            return result;
        }
    
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DataObject)) {
                return false;
            }
            if (!CarPeople.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CarPeople other = (CarPeople)obj;
            if (!Objects.equals(_carPerson, other.getCarPerson())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CarPeopleImpl otherImpl = (CarPeopleImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CarPeople>>, Augmentation<CarPeople>> e : augmentation.entrySet()) {
                    if (!e.getValue().equals(other.augmentation(e.getKey()))) {
                        return false;
                    }
                }
                // .. and give the other one the chance to do the same
                if (!obj.equals(this)) {
                    return false;
                }
            }
            return true;
        }
    
        @Override
        public String toString() {
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CarPeople");
            CodeHelpers.appendValue(helper, "_carPerson", _carPerson);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
