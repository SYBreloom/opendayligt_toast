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
 * Class that builds {@link StopStressTestInputBuilder} instances.
 * 
 * @see StopStressTestInputBuilder
 *
 */
public class StopStressTestInputBuilder implements Builder<StopStressTestInput> {



    Map<Class<? extends Augmentation<StopStressTestInput>>, Augmentation<StopStressTestInput>> augmentation = Collections.emptyMap();

    public StopStressTestInputBuilder() {
    }

    public StopStressTestInputBuilder(StopStressTestInput base) {
        if (base instanceof StopStressTestInputImpl) {
            StopStressTestInputImpl impl = (StopStressTestInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<StopStressTestInput>>, Augmentation<StopStressTestInput>> aug =((AugmentationHolder<StopStressTestInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<StopStressTestInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public StopStressTestInputBuilder addAugmentation(Class<? extends Augmentation<StopStressTestInput>> augmentationType, Augmentation<StopStressTestInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public StopStressTestInputBuilder removeAugmentation(Class<? extends Augmentation<StopStressTestInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public StopStressTestInput build() {
        return new StopStressTestInputImpl(this);
    }

    private static final class StopStressTestInputImpl implements StopStressTestInput {
    
    
        private Map<Class<? extends Augmentation<StopStressTestInput>>, Augmentation<StopStressTestInput>> augmentation = Collections.emptyMap();
    
        StopStressTestInputImpl(StopStressTestInputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<StopStressTestInput> getImplementedInterface() {
            return StopStressTestInput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<StopStressTestInput>> E augmentation(Class<E> augmentationType) {
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
            if (!StopStressTestInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            StopStressTestInput other = (StopStressTestInput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StopStressTestInputImpl otherImpl = (StopStressTestInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<StopStressTestInput>>, Augmentation<StopStressTestInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("StopStressTestInput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
