package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215;
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
 * Class that builds {@link GetSingletonConstantInputBuilder} instances.
 * 
 * @see GetSingletonConstantInputBuilder
 *
 */
public class GetSingletonConstantInputBuilder implements Builder<GetSingletonConstantInput> {



    Map<Class<? extends Augmentation<GetSingletonConstantInput>>, Augmentation<GetSingletonConstantInput>> augmentation = Collections.emptyMap();

    public GetSingletonConstantInputBuilder() {
    }

    public GetSingletonConstantInputBuilder(GetSingletonConstantInput base) {
        if (base instanceof GetSingletonConstantInputImpl) {
            GetSingletonConstantInputImpl impl = (GetSingletonConstantInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<GetSingletonConstantInput>>, Augmentation<GetSingletonConstantInput>> aug =((AugmentationHolder<GetSingletonConstantInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<GetSingletonConstantInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public GetSingletonConstantInputBuilder addAugmentation(Class<? extends Augmentation<GetSingletonConstantInput>> augmentationType, Augmentation<GetSingletonConstantInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GetSingletonConstantInputBuilder removeAugmentation(Class<? extends Augmentation<GetSingletonConstantInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetSingletonConstantInput build() {
        return new GetSingletonConstantInputImpl(this);
    }

    private static final class GetSingletonConstantInputImpl implements GetSingletonConstantInput {
    
    
        private Map<Class<? extends Augmentation<GetSingletonConstantInput>>, Augmentation<GetSingletonConstantInput>> augmentation = Collections.emptyMap();
    
        GetSingletonConstantInputImpl(GetSingletonConstantInputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<GetSingletonConstantInput> getImplementedInterface() {
            return GetSingletonConstantInput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<GetSingletonConstantInput>> E augmentation(Class<E> augmentationType) {
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
            if (!GetSingletonConstantInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            GetSingletonConstantInput other = (GetSingletonConstantInput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetSingletonConstantInputImpl otherImpl = (GetSingletonConstantInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<GetSingletonConstantInput>>, Augmentation<GetSingletonConstantInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("GetSingletonConstantInput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
