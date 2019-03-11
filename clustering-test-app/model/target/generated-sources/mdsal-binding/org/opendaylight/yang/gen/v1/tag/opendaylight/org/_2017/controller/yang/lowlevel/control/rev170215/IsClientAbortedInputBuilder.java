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
 * Class that builds {@link IsClientAbortedInputBuilder} instances.
 * 
 * @see IsClientAbortedInputBuilder
 *
 */
public class IsClientAbortedInputBuilder implements Builder<IsClientAbortedInput> {



    Map<Class<? extends Augmentation<IsClientAbortedInput>>, Augmentation<IsClientAbortedInput>> augmentation = Collections.emptyMap();

    public IsClientAbortedInputBuilder() {
    }

    public IsClientAbortedInputBuilder(IsClientAbortedInput base) {
        if (base instanceof IsClientAbortedInputImpl) {
            IsClientAbortedInputImpl impl = (IsClientAbortedInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<IsClientAbortedInput>>, Augmentation<IsClientAbortedInput>> aug =((AugmentationHolder<IsClientAbortedInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<IsClientAbortedInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public IsClientAbortedInputBuilder addAugmentation(Class<? extends Augmentation<IsClientAbortedInput>> augmentationType, Augmentation<IsClientAbortedInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IsClientAbortedInputBuilder removeAugmentation(Class<? extends Augmentation<IsClientAbortedInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IsClientAbortedInput build() {
        return new IsClientAbortedInputImpl(this);
    }

    private static final class IsClientAbortedInputImpl implements IsClientAbortedInput {
    
    
        private Map<Class<? extends Augmentation<IsClientAbortedInput>>, Augmentation<IsClientAbortedInput>> augmentation = Collections.emptyMap();
    
        IsClientAbortedInputImpl(IsClientAbortedInputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<IsClientAbortedInput> getImplementedInterface() {
            return IsClientAbortedInput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<IsClientAbortedInput>> E augmentation(Class<E> augmentationType) {
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
            if (!IsClientAbortedInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            IsClientAbortedInput other = (IsClientAbortedInput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IsClientAbortedInputImpl otherImpl = (IsClientAbortedInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<IsClientAbortedInput>>, Augmentation<IsClientAbortedInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("IsClientAbortedInput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
