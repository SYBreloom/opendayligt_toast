package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.people.rev140818.car.people;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarId;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonId;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link CarPersonBuilder} instances.
 * 
 * @see CarPersonBuilder
 *
 */
public class CarPersonBuilder implements Builder<CarPerson> {

    private CarId _carId;
    private PersonId _personId;
    private CarPersonKey key;


    Map<Class<? extends Augmentation<CarPerson>>, Augmentation<CarPerson>> augmentation = Collections.emptyMap();

    public CarPersonBuilder() {
    }

    public CarPersonBuilder(CarPerson base) {
        this.key = base.key();
        this._carId = base.getCarId();
        this._personId = base.getPersonId();
        if (base instanceof CarPersonImpl) {
            CarPersonImpl impl = (CarPersonImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CarPerson>>, Augmentation<CarPerson>> aug =((AugmentationHolder<CarPerson>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public CarPersonKey key() {
        return key;
    }
    
    public CarId getCarId() {
        return _carId;
    }
    
    public PersonId getPersonId() {
        return _personId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CarPerson>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public CarPersonBuilder withKey(final CarPersonKey key) {
        this.key = key;
        return this;
    }
    
    public CarPersonBuilder setCarId(final CarId value) {
        this._carId = value;
        return this;
    }
    
    public CarPersonBuilder setPersonId(final PersonId value) {
        this._personId = value;
        return this;
    }
    
    public CarPersonBuilder addAugmentation(Class<? extends Augmentation<CarPerson>> augmentationType, Augmentation<CarPerson> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CarPersonBuilder removeAugmentation(Class<? extends Augmentation<CarPerson>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CarPerson build() {
        return new CarPersonImpl(this);
    }

    private static final class CarPersonImpl implements CarPerson {
    
        private final CarId _carId;
        private final PersonId _personId;
        private final CarPersonKey key;
    
        private Map<Class<? extends Augmentation<CarPerson>>, Augmentation<CarPerson>> augmentation = Collections.emptyMap();
    
        CarPersonImpl(CarPersonBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new CarPersonKey(base.getCarId(), base.getPersonId());
            }
            this._carId = key.getCarId();
            this._personId = key.getPersonId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CarPerson> getImplementedInterface() {
            return CarPerson.class;
        }
    
        @Override
        public CarPersonKey key() {
            return key;
        }
        
        @Override
        public CarId getCarId() {
            return _carId;
        }
        
        @Override
        public PersonId getPersonId() {
            return _personId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CarPerson>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_carId);
            result = prime * result + Objects.hashCode(_personId);
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
            if (!CarPerson.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CarPerson other = (CarPerson)obj;
            if (!Objects.equals(_carId, other.getCarId())) {
                return false;
            }
            if (!Objects.equals(_personId, other.getPersonId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CarPersonImpl otherImpl = (CarPersonImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CarPerson>>, Augmentation<CarPerson>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CarPerson");
            CodeHelpers.appendValue(helper, "_carId", _carId);
            CodeHelpers.appendValue(helper, "_personId", _personId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
