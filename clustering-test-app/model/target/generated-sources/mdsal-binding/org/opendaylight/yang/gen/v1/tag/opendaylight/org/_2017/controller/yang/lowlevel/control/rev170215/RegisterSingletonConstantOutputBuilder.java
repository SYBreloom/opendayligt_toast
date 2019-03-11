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
 * Class that builds {@link RegisterSingletonConstantOutputBuilder} instances.
 * 
 * @see RegisterSingletonConstantOutputBuilder
 *
 */
public class RegisterSingletonConstantOutputBuilder implements Builder<RegisterSingletonConstantOutput> {



    Map<Class<? extends Augmentation<RegisterSingletonConstantOutput>>, Augmentation<RegisterSingletonConstantOutput>> augmentation = Collections.emptyMap();

    public RegisterSingletonConstantOutputBuilder() {
    }

    public RegisterSingletonConstantOutputBuilder(RegisterSingletonConstantOutput base) {
        if (base instanceof RegisterSingletonConstantOutputImpl) {
            RegisterSingletonConstantOutputImpl impl = (RegisterSingletonConstantOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<RegisterSingletonConstantOutput>>, Augmentation<RegisterSingletonConstantOutput>> aug =((AugmentationHolder<RegisterSingletonConstantOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<RegisterSingletonConstantOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public RegisterSingletonConstantOutputBuilder addAugmentation(Class<? extends Augmentation<RegisterSingletonConstantOutput>> augmentationType, Augmentation<RegisterSingletonConstantOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RegisterSingletonConstantOutputBuilder removeAugmentation(Class<? extends Augmentation<RegisterSingletonConstantOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RegisterSingletonConstantOutput build() {
        return new RegisterSingletonConstantOutputImpl(this);
    }

    private static final class RegisterSingletonConstantOutputImpl implements RegisterSingletonConstantOutput {
    
    
        private Map<Class<? extends Augmentation<RegisterSingletonConstantOutput>>, Augmentation<RegisterSingletonConstantOutput>> augmentation = Collections.emptyMap();
    
        RegisterSingletonConstantOutputImpl(RegisterSingletonConstantOutputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<RegisterSingletonConstantOutput> getImplementedInterface() {
            return RegisterSingletonConstantOutput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<RegisterSingletonConstantOutput>> E augmentation(Class<E> augmentationType) {
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
            if (!RegisterSingletonConstantOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            RegisterSingletonConstantOutput other = (RegisterSingletonConstantOutput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RegisterSingletonConstantOutputImpl otherImpl = (RegisterSingletonConstantOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<RegisterSingletonConstantOutput>>, Augmentation<RegisterSingletonConstantOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("RegisterSingletonConstantOutput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
