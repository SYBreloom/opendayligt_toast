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
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.PersonRef;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link BuyCarInputBuilder} instances.
 * 
 * @see BuyCarInputBuilder
 *
 */
public class BuyCarInputBuilder implements Builder<BuyCarInput> {

    private CarId _carId;
    private PersonRef _person;
    private PersonId _personId;


    Map<Class<? extends Augmentation<BuyCarInput>>, Augmentation<BuyCarInput>> augmentation = Collections.emptyMap();

    public BuyCarInputBuilder() {
    }

    public BuyCarInputBuilder(BuyCarInput base) {
        this._carId = base.getCarId();
        this._person = base.getPerson();
        this._personId = base.getPersonId();
        if (base instanceof BuyCarInputImpl) {
            BuyCarInputImpl impl = (BuyCarInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<BuyCarInput>>, Augmentation<BuyCarInput>> aug =((AugmentationHolder<BuyCarInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public CarId getCarId() {
        return _carId;
    }
    
    public PersonRef getPerson() {
        return _person;
    }
    
    public PersonId getPersonId() {
        return _personId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<BuyCarInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public BuyCarInputBuilder setCarId(final CarId value) {
        this._carId = value;
        return this;
    }
    
    public BuyCarInputBuilder setPerson(final PersonRef value) {
        this._person = value;
        return this;
    }
    
    public BuyCarInputBuilder setPersonId(final PersonId value) {
        this._personId = value;
        return this;
    }
    
    public BuyCarInputBuilder addAugmentation(Class<? extends Augmentation<BuyCarInput>> augmentationType, Augmentation<BuyCarInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public BuyCarInputBuilder removeAugmentation(Class<? extends Augmentation<BuyCarInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public BuyCarInput build() {
        return new BuyCarInputImpl(this);
    }

    private static final class BuyCarInputImpl implements BuyCarInput {
    
        private final CarId _carId;
        private final PersonRef _person;
        private final PersonId _personId;
    
        private Map<Class<? extends Augmentation<BuyCarInput>>, Augmentation<BuyCarInput>> augmentation = Collections.emptyMap();
    
        BuyCarInputImpl(BuyCarInputBuilder base) {
            this._carId = base.getCarId();
            this._person = base.getPerson();
            this._personId = base.getPersonId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<BuyCarInput> getImplementedInterface() {
            return BuyCarInput.class;
        }
    
        @Override
        public CarId getCarId() {
            return _carId;
        }
        
        @Override
        public PersonRef getPerson() {
            return _person;
        }
        
        @Override
        public PersonId getPersonId() {
            return _personId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<BuyCarInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_person);
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
            if (!BuyCarInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            BuyCarInput other = (BuyCarInput)obj;
            if (!Objects.equals(_carId, other.getCarId())) {
                return false;
            }
            if (!Objects.equals(_person, other.getPerson())) {
                return false;
            }
            if (!Objects.equals(_personId, other.getPersonId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                BuyCarInputImpl otherImpl = (BuyCarInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<BuyCarInput>>, Augmentation<BuyCarInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("BuyCarInput");
            CodeHelpers.appendValue(helper, "_carId", _carId);
            CodeHelpers.appendValue(helper, "_person", _person);
            CodeHelpers.appendValue(helper, "_personId", _personId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
