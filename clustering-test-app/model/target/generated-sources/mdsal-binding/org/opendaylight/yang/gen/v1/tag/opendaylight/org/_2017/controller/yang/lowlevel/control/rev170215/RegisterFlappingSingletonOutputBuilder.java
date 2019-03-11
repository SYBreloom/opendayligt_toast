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
 * Class that builds {@link RegisterFlappingSingletonOutputBuilder} instances.
 * 
 * @see RegisterFlappingSingletonOutputBuilder
 *
 */
public class RegisterFlappingSingletonOutputBuilder implements Builder<RegisterFlappingSingletonOutput> {



    Map<Class<? extends Augmentation<RegisterFlappingSingletonOutput>>, Augmentation<RegisterFlappingSingletonOutput>> augmentation = Collections.emptyMap();

    public RegisterFlappingSingletonOutputBuilder() {
    }

    public RegisterFlappingSingletonOutputBuilder(RegisterFlappingSingletonOutput base) {
        if (base instanceof RegisterFlappingSingletonOutputImpl) {
            RegisterFlappingSingletonOutputImpl impl = (RegisterFlappingSingletonOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<RegisterFlappingSingletonOutput>>, Augmentation<RegisterFlappingSingletonOutput>> aug =((AugmentationHolder<RegisterFlappingSingletonOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<RegisterFlappingSingletonOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public RegisterFlappingSingletonOutputBuilder addAugmentation(Class<? extends Augmentation<RegisterFlappingSingletonOutput>> augmentationType, Augmentation<RegisterFlappingSingletonOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RegisterFlappingSingletonOutputBuilder removeAugmentation(Class<? extends Augmentation<RegisterFlappingSingletonOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RegisterFlappingSingletonOutput build() {
        return new RegisterFlappingSingletonOutputImpl(this);
    }

    private static final class RegisterFlappingSingletonOutputImpl implements RegisterFlappingSingletonOutput {
    
    
        private Map<Class<? extends Augmentation<RegisterFlappingSingletonOutput>>, Augmentation<RegisterFlappingSingletonOutput>> augmentation = Collections.emptyMap();
    
        RegisterFlappingSingletonOutputImpl(RegisterFlappingSingletonOutputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<RegisterFlappingSingletonOutput> getImplementedInterface() {
            return RegisterFlappingSingletonOutput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<RegisterFlappingSingletonOutput>> E augmentation(Class<E> augmentationType) {
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
            if (!RegisterFlappingSingletonOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            RegisterFlappingSingletonOutput other = (RegisterFlappingSingletonOutput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RegisterFlappingSingletonOutputImpl otherImpl = (RegisterFlappingSingletonOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<RegisterFlappingSingletonOutput>>, Augmentation<RegisterFlappingSingletonOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("RegisterFlappingSingletonOutput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
