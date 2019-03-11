package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
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
 * Class that builds {@link CancelToastInputBuilder} instances.
 * 
 * @see CancelToastInputBuilder
 *
 */
public class CancelToastInputBuilder implements Builder<CancelToastInput> {



    Map<Class<? extends Augmentation<CancelToastInput>>, Augmentation<CancelToastInput>> augmentation = Collections.emptyMap();

    public CancelToastInputBuilder() {
    }

    public CancelToastInputBuilder(CancelToastInput base) {
        if (base instanceof CancelToastInputImpl) {
            CancelToastInputImpl impl = (CancelToastInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CancelToastInput>>, Augmentation<CancelToastInput>> aug =((AugmentationHolder<CancelToastInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CancelToastInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public CancelToastInputBuilder addAugmentation(Class<? extends Augmentation<CancelToastInput>> augmentationType, Augmentation<CancelToastInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CancelToastInputBuilder removeAugmentation(Class<? extends Augmentation<CancelToastInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CancelToastInput build() {
        return new CancelToastInputImpl(this);
    }

    private static final class CancelToastInputImpl implements CancelToastInput {
    
    
        private Map<Class<? extends Augmentation<CancelToastInput>>, Augmentation<CancelToastInput>> augmentation = Collections.emptyMap();
    
        CancelToastInputImpl(CancelToastInputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CancelToastInput> getImplementedInterface() {
            return CancelToastInput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CancelToastInput>> E augmentation(Class<E> augmentationType) {
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
            if (!CancelToastInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CancelToastInput other = (CancelToastInput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CancelToastInputImpl otherImpl = (CancelToastInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CancelToastInput>>, Augmentation<CancelToastInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CancelToastInput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
