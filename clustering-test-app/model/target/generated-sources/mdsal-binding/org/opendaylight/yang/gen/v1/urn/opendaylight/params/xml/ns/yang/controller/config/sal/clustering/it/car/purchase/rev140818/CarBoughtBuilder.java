package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.purchase.rev140818;
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
 * Class that builds {@link CarBoughtBuilder} instances.
 * 
 * @see CarBoughtBuilder
 *
 */
public class CarBoughtBuilder implements Builder<CarBought> {

    private CarId _carId;
    private PersonId _personId;


    Map<Class<? extends Augmentation<CarBought>>, Augmentation<CarBought>> augmentation = Collections.emptyMap();

    public CarBoughtBuilder() {
    }

    public CarBoughtBuilder(CarBought base) {
        this._carId = base.getCarId();
        this._personId = base.getPersonId();
        if (base instanceof CarBoughtImpl) {
            CarBoughtImpl impl = (CarBoughtImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CarBought>>, Augmentation<CarBought>> aug =((AugmentationHolder<CarBought>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public CarId getCarId() {
        return _carId;
    }
    
    public PersonId getPersonId() {
        return _personId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CarBought>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public CarBoughtBuilder setCarId(final CarId value) {
        this._carId = value;
        return this;
    }
    
    public CarBoughtBuilder setPersonId(final PersonId value) {
        this._personId = value;
        return this;
    }
    
    public CarBoughtBuilder addAugmentation(Class<? extends Augmentation<CarBought>> augmentationType, Augmentation<CarBought> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CarBoughtBuilder removeAugmentation(Class<? extends Augmentation<CarBought>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CarBought build() {
        return new CarBoughtImpl(this);
    }

    private static final class CarBoughtImpl implements CarBought {
    
        private final CarId _carId;
        private final PersonId _personId;
    
        private Map<Class<? extends Augmentation<CarBought>>, Augmentation<CarBought>> augmentation = Collections.emptyMap();
    
        CarBoughtImpl(CarBoughtBuilder base) {
            this._carId = base.getCarId();
            this._personId = base.getPersonId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CarBought> getImplementedInterface() {
            return CarBought.class;
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
        public <E extends Augmentation<CarBought>> E augmentation(Class<E> augmentationType) {
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
            if (!CarBought.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CarBought other = (CarBought)obj;
            if (!Objects.equals(_carId, other.getCarId())) {
                return false;
            }
            if (!Objects.equals(_personId, other.getPersonId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CarBoughtImpl otherImpl = (CarBoughtImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CarBought>>, Augmentation<CarBought>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CarBought");
            CodeHelpers.appendValue(helper, "_carId", _carId);
            CodeHelpers.appendValue(helper, "_personId", _personId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
