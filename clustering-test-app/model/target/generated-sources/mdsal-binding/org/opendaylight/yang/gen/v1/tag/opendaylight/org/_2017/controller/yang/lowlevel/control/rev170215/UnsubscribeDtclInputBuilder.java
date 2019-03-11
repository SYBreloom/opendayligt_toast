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
 * Class that builds {@link UnsubscribeDtclInputBuilder} instances.
 * 
 * @see UnsubscribeDtclInputBuilder
 *
 */
public class UnsubscribeDtclInputBuilder implements Builder<UnsubscribeDtclInput> {



    Map<Class<? extends Augmentation<UnsubscribeDtclInput>>, Augmentation<UnsubscribeDtclInput>> augmentation = Collections.emptyMap();

    public UnsubscribeDtclInputBuilder() {
    }

    public UnsubscribeDtclInputBuilder(UnsubscribeDtclInput base) {
        if (base instanceof UnsubscribeDtclInputImpl) {
            UnsubscribeDtclInputImpl impl = (UnsubscribeDtclInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<UnsubscribeDtclInput>>, Augmentation<UnsubscribeDtclInput>> aug =((AugmentationHolder<UnsubscribeDtclInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<UnsubscribeDtclInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public UnsubscribeDtclInputBuilder addAugmentation(Class<? extends Augmentation<UnsubscribeDtclInput>> augmentationType, Augmentation<UnsubscribeDtclInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UnsubscribeDtclInputBuilder removeAugmentation(Class<? extends Augmentation<UnsubscribeDtclInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UnsubscribeDtclInput build() {
        return new UnsubscribeDtclInputImpl(this);
    }

    private static final class UnsubscribeDtclInputImpl implements UnsubscribeDtclInput {
    
    
        private Map<Class<? extends Augmentation<UnsubscribeDtclInput>>, Augmentation<UnsubscribeDtclInput>> augmentation = Collections.emptyMap();
    
        UnsubscribeDtclInputImpl(UnsubscribeDtclInputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<UnsubscribeDtclInput> getImplementedInterface() {
            return UnsubscribeDtclInput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<UnsubscribeDtclInput>> E augmentation(Class<E> augmentationType) {
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
            if (!UnsubscribeDtclInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            UnsubscribeDtclInput other = (UnsubscribeDtclInput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UnsubscribeDtclInputImpl otherImpl = (UnsubscribeDtclInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<UnsubscribeDtclInput>>, Augmentation<UnsubscribeDtclInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("UnsubscribeDtclInput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
