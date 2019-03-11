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
 * Class that builds {@link AddShardReplicaInputBuilder} instances.
 * 
 * @see AddShardReplicaInputBuilder
 *
 */
public class AddShardReplicaInputBuilder implements Builder<AddShardReplicaInput> {

    private String _shardName;


    Map<Class<? extends Augmentation<AddShardReplicaInput>>, Augmentation<AddShardReplicaInput>> augmentation = Collections.emptyMap();

    public AddShardReplicaInputBuilder() {
    }

    public AddShardReplicaInputBuilder(AddShardReplicaInput base) {
        this._shardName = base.getShardName();
        if (base instanceof AddShardReplicaInputImpl) {
            AddShardReplicaInputImpl impl = (AddShardReplicaInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<AddShardReplicaInput>>, Augmentation<AddShardReplicaInput>> aug =((AugmentationHolder<AddShardReplicaInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public String getShardName() {
        return _shardName;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<AddShardReplicaInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public AddShardReplicaInputBuilder setShardName(final String value) {
        this._shardName = value;
        return this;
    }
    
    public AddShardReplicaInputBuilder addAugmentation(Class<? extends Augmentation<AddShardReplicaInput>> augmentationType, Augmentation<AddShardReplicaInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AddShardReplicaInputBuilder removeAugmentation(Class<? extends Augmentation<AddShardReplicaInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AddShardReplicaInput build() {
        return new AddShardReplicaInputImpl(this);
    }

    private static final class AddShardReplicaInputImpl implements AddShardReplicaInput {
    
        private final String _shardName;
    
        private Map<Class<? extends Augmentation<AddShardReplicaInput>>, Augmentation<AddShardReplicaInput>> augmentation = Collections.emptyMap();
    
        AddShardReplicaInputImpl(AddShardReplicaInputBuilder base) {
            this._shardName = base.getShardName();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<AddShardReplicaInput> getImplementedInterface() {
            return AddShardReplicaInput.class;
        }
    
        @Override
        public String getShardName() {
            return _shardName;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<AddShardReplicaInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_shardName);
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
            if (!AddShardReplicaInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            AddShardReplicaInput other = (AddShardReplicaInput)obj;
            if (!Objects.equals(_shardName, other.getShardName())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AddShardReplicaInputImpl otherImpl = (AddShardReplicaInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<AddShardReplicaInput>>, Augmentation<AddShardReplicaInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("AddShardReplicaInput");
            CodeHelpers.appendValue(helper, "_shardName", _shardName);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
