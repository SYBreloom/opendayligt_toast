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
 * Class that builds {@link RegisterConstantOutputBuilder} instances.
 * 
 * @see RegisterConstantOutputBuilder
 *
 */
public class RegisterConstantOutputBuilder implements Builder<RegisterConstantOutput> {



    Map<Class<? extends Augmentation<RegisterConstantOutput>>, Augmentation<RegisterConstantOutput>> augmentation = Collections.emptyMap();

    public RegisterConstantOutputBuilder() {
    }

    public RegisterConstantOutputBuilder(RegisterConstantOutput base) {
        if (base instanceof RegisterConstantOutputImpl) {
            RegisterConstantOutputImpl impl = (RegisterConstantOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<RegisterConstantOutput>>, Augmentation<RegisterConstantOutput>> aug =((AugmentationHolder<RegisterConstantOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<RegisterConstantOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public RegisterConstantOutputBuilder addAugmentation(Class<? extends Augmentation<RegisterConstantOutput>> augmentationType, Augmentation<RegisterConstantOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RegisterConstantOutputBuilder removeAugmentation(Class<? extends Augmentation<RegisterConstantOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RegisterConstantOutput build() {
        return new RegisterConstantOutputImpl(this);
    }

    private static final class RegisterConstantOutputImpl implements RegisterConstantOutput {
    
    
        private Map<Class<? extends Augmentation<RegisterConstantOutput>>, Augmentation<RegisterConstantOutput>> augmentation = Collections.emptyMap();
    
        RegisterConstantOutputImpl(RegisterConstantOutputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<RegisterConstantOutput> getImplementedInterface() {
            return RegisterConstantOutput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<RegisterConstantOutput>> E augmentation(Class<E> augmentationType) {
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
            if (!RegisterConstantOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            RegisterConstantOutput other = (RegisterConstantOutput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RegisterConstantOutputImpl otherImpl = (RegisterConstantOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<RegisterConstantOutput>>, Augmentation<RegisterConstantOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("RegisterConstantOutput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
