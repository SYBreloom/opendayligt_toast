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
 * Class that builds {@link SubscribeDtclInputBuilder} instances.
 * 
 * @see SubscribeDtclInputBuilder
 *
 */
public class SubscribeDtclInputBuilder implements Builder<SubscribeDtclInput> {



    Map<Class<? extends Augmentation<SubscribeDtclInput>>, Augmentation<SubscribeDtclInput>> augmentation = Collections.emptyMap();

    public SubscribeDtclInputBuilder() {
    }

    public SubscribeDtclInputBuilder(SubscribeDtclInput base) {
        if (base instanceof SubscribeDtclInputImpl) {
            SubscribeDtclInputImpl impl = (SubscribeDtclInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<SubscribeDtclInput>>, Augmentation<SubscribeDtclInput>> aug =((AugmentationHolder<SubscribeDtclInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<SubscribeDtclInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public SubscribeDtclInputBuilder addAugmentation(Class<? extends Augmentation<SubscribeDtclInput>> augmentationType, Augmentation<SubscribeDtclInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public SubscribeDtclInputBuilder removeAugmentation(Class<? extends Augmentation<SubscribeDtclInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public SubscribeDtclInput build() {
        return new SubscribeDtclInputImpl(this);
    }

    private static final class SubscribeDtclInputImpl implements SubscribeDtclInput {
    
    
        private Map<Class<? extends Augmentation<SubscribeDtclInput>>, Augmentation<SubscribeDtclInput>> augmentation = Collections.emptyMap();
    
        SubscribeDtclInputImpl(SubscribeDtclInputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<SubscribeDtclInput> getImplementedInterface() {
            return SubscribeDtclInput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<SubscribeDtclInput>> E augmentation(Class<E> augmentationType) {
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
            if (!SubscribeDtclInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            SubscribeDtclInput other = (SubscribeDtclInput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                SubscribeDtclInputImpl otherImpl = (SubscribeDtclInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<SubscribeDtclInput>>, Augmentation<SubscribeDtclInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("SubscribeDtclInput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
