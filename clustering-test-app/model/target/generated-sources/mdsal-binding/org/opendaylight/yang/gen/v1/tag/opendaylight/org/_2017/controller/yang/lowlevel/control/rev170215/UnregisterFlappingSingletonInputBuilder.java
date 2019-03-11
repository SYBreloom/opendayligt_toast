package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
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
 * Class that builds {@link UnregisterFlappingSingletonInputBuilder} instances.
 * 
 * @see UnregisterFlappingSingletonInputBuilder
 *
 */
public class UnregisterFlappingSingletonInputBuilder implements Builder<UnregisterFlappingSingletonInput> {



    Map<Class<? extends Augmentation<UnregisterFlappingSingletonInput>>, Augmentation<UnregisterFlappingSingletonInput>> augmentation = Collections.emptyMap();

    public UnregisterFlappingSingletonInputBuilder() {
    }

    public UnregisterFlappingSingletonInputBuilder(UnregisterFlappingSingletonInput base) {
        if (base instanceof UnregisterFlappingSingletonInputImpl) {
            UnregisterFlappingSingletonInputImpl impl = (UnregisterFlappingSingletonInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<UnregisterFlappingSingletonInput>>, Augmentation<UnregisterFlappingSingletonInput>> aug =((AugmentationHolder<UnregisterFlappingSingletonInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<UnregisterFlappingSingletonInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public UnregisterFlappingSingletonInputBuilder addAugmentation(Class<? extends Augmentation<UnregisterFlappingSingletonInput>> augmentationType, Augmentation<UnregisterFlappingSingletonInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UnregisterFlappingSingletonInputBuilder removeAugmentation(Class<? extends Augmentation<UnregisterFlappingSingletonInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UnregisterFlappingSingletonInput build() {
        return new UnregisterFlappingSingletonInputImpl(this);
    }

    private static final class UnregisterFlappingSingletonInputImpl implements UnregisterFlappingSingletonInput {
    
    
        private Map<Class<? extends Augmentation<UnregisterFlappingSingletonInput>>, Augmentation<UnregisterFlappingSingletonInput>> augmentation = Collections.emptyMap();
    
        UnregisterFlappingSingletonInputImpl(UnregisterFlappingSingletonInputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<UnregisterFlappingSingletonInput> getImplementedInterface() {
            return UnregisterFlappingSingletonInput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<UnregisterFlappingSingletonInput>> E augmentation(Class<E> augmentationType) {
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
            if (!UnregisterFlappingSingletonInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            UnregisterFlappingSingletonInput other = (UnregisterFlappingSingletonInput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UnregisterFlappingSingletonInputImpl otherImpl = (UnregisterFlappingSingletonInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<UnregisterFlappingSingletonInput>>, Augmentation<UnregisterFlappingSingletonInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("UnregisterFlappingSingletonInput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
