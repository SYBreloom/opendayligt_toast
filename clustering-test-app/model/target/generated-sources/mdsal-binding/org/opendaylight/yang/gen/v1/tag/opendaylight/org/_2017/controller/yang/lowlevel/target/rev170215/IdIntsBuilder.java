package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215;
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
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.IdInt;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link IdIntsBuilder} instances.
 * 
 * @see IdIntsBuilder
 *
 */
public class IdIntsBuilder implements Builder<IdInts> {

    private List<IdInt> _idInt;


    Map<Class<? extends Augmentation<IdInts>>, Augmentation<IdInts>> augmentation = Collections.emptyMap();

    public IdIntsBuilder() {
    }

    public IdIntsBuilder(IdInts base) {
        this._idInt = base.getIdInt();
        if (base instanceof IdIntsImpl) {
            IdIntsImpl impl = (IdIntsImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<IdInts>>, Augmentation<IdInts>> aug =((AugmentationHolder<IdInts>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public List<IdInt> getIdInt() {
        return _idInt;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<IdInts>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public IdIntsBuilder setIdInt(final List<IdInt> values) {
        this._idInt = values;
        return this;
    }
    
    
    public IdIntsBuilder addAugmentation(Class<? extends Augmentation<IdInts>> augmentationType, Augmentation<IdInts> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IdIntsBuilder removeAugmentation(Class<? extends Augmentation<IdInts>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IdInts build() {
        return new IdIntsImpl(this);
    }

    private static final class IdIntsImpl implements IdInts {
    
        private final List<IdInt> _idInt;
    
        private Map<Class<? extends Augmentation<IdInts>>, Augmentation<IdInts>> augmentation = Collections.emptyMap();
    
        IdIntsImpl(IdIntsBuilder base) {
            this._idInt = base.getIdInt();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<IdInts> getImplementedInterface() {
            return IdInts.class;
        }
    
        @Override
        public List<IdInt> getIdInt() {
            return _idInt;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<IdInts>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_idInt);
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
            if (!IdInts.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            IdInts other = (IdInts)obj;
            if (!Objects.equals(_idInt, other.getIdInt())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IdIntsImpl otherImpl = (IdIntsImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<IdInts>>, Augmentation<IdInts>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("IdInts");
            CodeHelpers.appendValue(helper, "_idInt", _idInt);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}