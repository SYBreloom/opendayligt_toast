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
 * Class that builds {@link RegisterLoggingDtclInputBuilder} instances.
 * 
 * @see RegisterLoggingDtclInputBuilder
 *
 */
public class RegisterLoggingDtclInputBuilder implements Builder<RegisterLoggingDtclInput> {



    Map<Class<? extends Augmentation<RegisterLoggingDtclInput>>, Augmentation<RegisterLoggingDtclInput>> augmentation = Collections.emptyMap();

    public RegisterLoggingDtclInputBuilder() {
    }

    public RegisterLoggingDtclInputBuilder(RegisterLoggingDtclInput base) {
        if (base instanceof RegisterLoggingDtclInputImpl) {
            RegisterLoggingDtclInputImpl impl = (RegisterLoggingDtclInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<RegisterLoggingDtclInput>>, Augmentation<RegisterLoggingDtclInput>> aug =((AugmentationHolder<RegisterLoggingDtclInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<RegisterLoggingDtclInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public RegisterLoggingDtclInputBuilder addAugmentation(Class<? extends Augmentation<RegisterLoggingDtclInput>> augmentationType, Augmentation<RegisterLoggingDtclInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RegisterLoggingDtclInputBuilder removeAugmentation(Class<? extends Augmentation<RegisterLoggingDtclInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RegisterLoggingDtclInput build() {
        return new RegisterLoggingDtclInputImpl(this);
    }

    private static final class RegisterLoggingDtclInputImpl implements RegisterLoggingDtclInput {
    
    
        private Map<Class<? extends Augmentation<RegisterLoggingDtclInput>>, Augmentation<RegisterLoggingDtclInput>> augmentation = Collections.emptyMap();
    
        RegisterLoggingDtclInputImpl(RegisterLoggingDtclInputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<RegisterLoggingDtclInput> getImplementedInterface() {
            return RegisterLoggingDtclInput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<RegisterLoggingDtclInput>> E augmentation(Class<E> augmentationType) {
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
            if (!RegisterLoggingDtclInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            RegisterLoggingDtclInput other = (RegisterLoggingDtclInput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RegisterLoggingDtclInputImpl otherImpl = (RegisterLoggingDtclInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<RegisterLoggingDtclInput>>, Augmentation<RegisterLoggingDtclInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("RegisterLoggingDtclInput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
