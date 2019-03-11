package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Long;
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
 * Class that builds {@link UnregisterFlappingSingletonOutputBuilder} instances.
 * 
 * @see UnregisterFlappingSingletonOutputBuilder
 *
 */
public class UnregisterFlappingSingletonOutputBuilder implements Builder<UnregisterFlappingSingletonOutput> {

    private Long _flapCount;


    Map<Class<? extends Augmentation<UnregisterFlappingSingletonOutput>>, Augmentation<UnregisterFlappingSingletonOutput>> augmentation = Collections.emptyMap();

    public UnregisterFlappingSingletonOutputBuilder() {
    }

    public UnregisterFlappingSingletonOutputBuilder(UnregisterFlappingSingletonOutput base) {
        this._flapCount = base.getFlapCount();
        if (base instanceof UnregisterFlappingSingletonOutputImpl) {
            UnregisterFlappingSingletonOutputImpl impl = (UnregisterFlappingSingletonOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<UnregisterFlappingSingletonOutput>>, Augmentation<UnregisterFlappingSingletonOutput>> aug =((AugmentationHolder<UnregisterFlappingSingletonOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Long getFlapCount() {
        return _flapCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<UnregisterFlappingSingletonOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public UnregisterFlappingSingletonOutputBuilder setFlapCount(final Long value) {
        this._flapCount = value;
        return this;
    }
    
    public UnregisterFlappingSingletonOutputBuilder addAugmentation(Class<? extends Augmentation<UnregisterFlappingSingletonOutput>> augmentationType, Augmentation<UnregisterFlappingSingletonOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UnregisterFlappingSingletonOutputBuilder removeAugmentation(Class<? extends Augmentation<UnregisterFlappingSingletonOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UnregisterFlappingSingletonOutput build() {
        return new UnregisterFlappingSingletonOutputImpl(this);
    }

    private static final class UnregisterFlappingSingletonOutputImpl implements UnregisterFlappingSingletonOutput {
    
        private final Long _flapCount;
    
        private Map<Class<? extends Augmentation<UnregisterFlappingSingletonOutput>>, Augmentation<UnregisterFlappingSingletonOutput>> augmentation = Collections.emptyMap();
    
        UnregisterFlappingSingletonOutputImpl(UnregisterFlappingSingletonOutputBuilder base) {
            this._flapCount = base.getFlapCount();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<UnregisterFlappingSingletonOutput> getImplementedInterface() {
            return UnregisterFlappingSingletonOutput.class;
        }
    
        @Override
        public Long getFlapCount() {
            return _flapCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<UnregisterFlappingSingletonOutput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_flapCount);
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
            if (!UnregisterFlappingSingletonOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            UnregisterFlappingSingletonOutput other = (UnregisterFlappingSingletonOutput)obj;
            if (!Objects.equals(_flapCount, other.getFlapCount())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UnregisterFlappingSingletonOutputImpl otherImpl = (UnregisterFlappingSingletonOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<UnregisterFlappingSingletonOutput>>, Augmentation<UnregisterFlappingSingletonOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("UnregisterFlappingSingletonOutput");
            CodeHelpers.appendValue(helper, "_flapCount", _flapCount);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}