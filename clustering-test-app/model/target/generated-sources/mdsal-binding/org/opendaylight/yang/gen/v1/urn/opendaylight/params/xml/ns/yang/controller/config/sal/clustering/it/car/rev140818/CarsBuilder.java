package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
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
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.cars.CarEntry;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link CarsBuilder} instances.
 * 
 * @see CarsBuilder
 *
 */
public class CarsBuilder implements Builder<Cars> {

    private List<CarEntry> _carEntry;


    Map<Class<? extends Augmentation<Cars>>, Augmentation<Cars>> augmentation = Collections.emptyMap();

    public CarsBuilder() {
    }

    public CarsBuilder(Cars base) {
        this._carEntry = base.getCarEntry();
        if (base instanceof CarsImpl) {
            CarsImpl impl = (CarsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Cars>>, Augmentation<Cars>> aug =((AugmentationHolder<Cars>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public List<CarEntry> getCarEntry() {
        return _carEntry;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Cars>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public CarsBuilder setCarEntry(final List<CarEntry> values) {
        this._carEntry = values;
        return this;
    }
    
    
    public CarsBuilder addAugmentation(Class<? extends Augmentation<Cars>> augmentationType, Augmentation<Cars> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CarsBuilder removeAugmentation(Class<? extends Augmentation<Cars>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Cars build() {
        return new CarsImpl(this);
    }

    private static final class CarsImpl implements Cars {
    
        private final List<CarEntry> _carEntry;
    
        private Map<Class<? extends Augmentation<Cars>>, Augmentation<Cars>> augmentation = Collections.emptyMap();
    
        CarsImpl(CarsBuilder base) {
            this._carEntry = base.getCarEntry();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Cars> getImplementedInterface() {
            return Cars.class;
        }
    
        @Override
        public List<CarEntry> getCarEntry() {
            return _carEntry;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Cars>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_carEntry);
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
            if (!Cars.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Cars other = (Cars)obj;
            if (!Objects.equals(_carEntry, other.getCarEntry())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CarsImpl otherImpl = (CarsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Cars>>, Augmentation<Cars>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Cars");
            CodeHelpers.appendValue(helper, "_carEntry", _carEntry);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
