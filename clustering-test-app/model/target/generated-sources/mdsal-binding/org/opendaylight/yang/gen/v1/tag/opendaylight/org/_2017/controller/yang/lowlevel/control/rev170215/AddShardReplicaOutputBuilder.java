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
 * Class that builds {@link AddShardReplicaOutputBuilder} instances.
 * 
 * @see AddShardReplicaOutputBuilder
 *
 */
public class AddShardReplicaOutputBuilder implements Builder<AddShardReplicaOutput> {



    Map<Class<? extends Augmentation<AddShardReplicaOutput>>, Augmentation<AddShardReplicaOutput>> augmentation = Collections.emptyMap();

    public AddShardReplicaOutputBuilder() {
    }

    public AddShardReplicaOutputBuilder(AddShardReplicaOutput base) {
        if (base instanceof AddShardReplicaOutputImpl) {
            AddShardReplicaOutputImpl impl = (AddShardReplicaOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<AddShardReplicaOutput>>, Augmentation<AddShardReplicaOutput>> aug =((AugmentationHolder<AddShardReplicaOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<AddShardReplicaOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public AddShardReplicaOutputBuilder addAugmentation(Class<? extends Augmentation<AddShardReplicaOutput>> augmentationType, Augmentation<AddShardReplicaOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AddShardReplicaOutputBuilder removeAugmentation(Class<? extends Augmentation<AddShardReplicaOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AddShardReplicaOutput build() {
        return new AddShardReplicaOutputImpl(this);
    }

    private static final class AddShardReplicaOutputImpl implements AddShardReplicaOutput {
    
    
        private Map<Class<? extends Augmentation<AddShardReplicaOutput>>, Augmentation<AddShardReplicaOutput>> augmentation = Collections.emptyMap();
    
        AddShardReplicaOutputImpl(AddShardReplicaOutputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<AddShardReplicaOutput> getImplementedInterface() {
            return AddShardReplicaOutput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<AddShardReplicaOutput>> E augmentation(Class<E> augmentationType) {
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
            if (!AddShardReplicaOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            AddShardReplicaOutput other = (AddShardReplicaOutput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AddShardReplicaOutputImpl otherImpl = (AddShardReplicaOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<AddShardReplicaOutput>>, Augmentation<AddShardReplicaOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("AddShardReplicaOutput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
