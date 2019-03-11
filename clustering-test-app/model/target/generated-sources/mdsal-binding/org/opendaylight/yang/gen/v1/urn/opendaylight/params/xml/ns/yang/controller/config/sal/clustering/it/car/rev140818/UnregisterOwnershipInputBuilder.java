package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
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
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link UnregisterOwnershipInputBuilder} instances.
 * 
 * @see UnregisterOwnershipInputBuilder
 *
 */
public class UnregisterOwnershipInputBuilder implements Builder<UnregisterOwnershipInput> {

    private String _carId;


    Map<Class<? extends Augmentation<UnregisterOwnershipInput>>, Augmentation<UnregisterOwnershipInput>> augmentation = Collections.emptyMap();

    public UnregisterOwnershipInputBuilder() {
    }

    public UnregisterOwnershipInputBuilder(UnregisterOwnershipInput base) {
        this._carId = base.getCarId();
        if (base instanceof UnregisterOwnershipInputImpl) {
            UnregisterOwnershipInputImpl impl = (UnregisterOwnershipInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<UnregisterOwnershipInput>>, Augmentation<UnregisterOwnershipInput>> aug =((AugmentationHolder<UnregisterOwnershipInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public String getCarId() {
        return _carId;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<UnregisterOwnershipInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public UnregisterOwnershipInputBuilder setCarId(final String value) {
        this._carId = value;
        return this;
    }
    
    public UnregisterOwnershipInputBuilder addAugmentation(Class<? extends Augmentation<UnregisterOwnershipInput>> augmentationType, Augmentation<UnregisterOwnershipInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UnregisterOwnershipInputBuilder removeAugmentation(Class<? extends Augmentation<UnregisterOwnershipInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UnregisterOwnershipInput build() {
        return new UnregisterOwnershipInputImpl(this);
    }

    private static final class UnregisterOwnershipInputImpl implements UnregisterOwnershipInput {
    
        private final String _carId;
    
        private Map<Class<? extends Augmentation<UnregisterOwnershipInput>>, Augmentation<UnregisterOwnershipInput>> augmentation = Collections.emptyMap();
    
        UnregisterOwnershipInputImpl(UnregisterOwnershipInputBuilder base) {
            this._carId = base.getCarId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<UnregisterOwnershipInput> getImplementedInterface() {
            return UnregisterOwnershipInput.class;
        }
    
        @Override
        public String getCarId() {
            return _carId;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<UnregisterOwnershipInput>> E augmentation(Class<E> augmentationType) {
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
            if (!UnregisterOwnershipInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            UnregisterOwnershipInput other = (UnregisterOwnershipInput)obj;
            if (!Objects.equals(_carId, other.getCarId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UnregisterOwnershipInputImpl otherImpl = (UnregisterOwnershipInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<UnregisterOwnershipInput>>, Augmentation<UnregisterOwnershipInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("UnregisterOwnershipInput");
            CodeHelpers.appendValue(helper, "_carId", _carId);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
