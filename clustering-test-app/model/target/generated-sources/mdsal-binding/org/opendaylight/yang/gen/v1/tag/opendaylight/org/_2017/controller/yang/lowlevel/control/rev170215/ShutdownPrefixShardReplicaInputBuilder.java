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
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

/**
 * Class that builds {@link ShutdownPrefixShardReplicaInputBuilder} instances.
 * 
 * @see ShutdownPrefixShardReplicaInputBuilder
 *
 */
public class ShutdownPrefixShardReplicaInputBuilder implements Builder<ShutdownPrefixShardReplicaInput> {

    private InstanceIdentifier<?> _prefix;


    Map<Class<? extends Augmentation<ShutdownPrefixShardReplicaInput>>, Augmentation<ShutdownPrefixShardReplicaInput>> augmentation = Collections.emptyMap();

    public ShutdownPrefixShardReplicaInputBuilder() {
    }

    public ShutdownPrefixShardReplicaInputBuilder(ShutdownPrefixShardReplicaInput base) {
        this._prefix = base.getPrefix();
        if (base instanceof ShutdownPrefixShardReplicaInputImpl) {
            ShutdownPrefixShardReplicaInputImpl impl = (ShutdownPrefixShardReplicaInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ShutdownPrefixShardReplicaInput>>, Augmentation<ShutdownPrefixShardReplicaInput>> aug =((AugmentationHolder<ShutdownPrefixShardReplicaInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public InstanceIdentifier<?> getPrefix() {
        return _prefix;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ShutdownPrefixShardReplicaInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ShutdownPrefixShardReplicaInputBuilder setPrefix(final InstanceIdentifier<?> value) {
        this._prefix = value;
        return this;
    }
    
    public ShutdownPrefixShardReplicaInputBuilder addAugmentation(Class<? extends Augmentation<ShutdownPrefixShardReplicaInput>> augmentationType, Augmentation<ShutdownPrefixShardReplicaInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ShutdownPrefixShardReplicaInputBuilder removeAugmentation(Class<? extends Augmentation<ShutdownPrefixShardReplicaInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ShutdownPrefixShardReplicaInput build() {
        return new ShutdownPrefixShardReplicaInputImpl(this);
    }

    private static final class ShutdownPrefixShardReplicaInputImpl implements ShutdownPrefixShardReplicaInput {
    
        private final InstanceIdentifier<?> _prefix;
    
        private Map<Class<? extends Augmentation<ShutdownPrefixShardReplicaInput>>, Augmentation<ShutdownPrefixShardReplicaInput>> augmentation = Collections.emptyMap();
    
        ShutdownPrefixShardReplicaInputImpl(ShutdownPrefixShardReplicaInputBuilder base) {
            this._prefix = base.getPrefix();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ShutdownPrefixShardReplicaInput> getImplementedInterface() {
            return ShutdownPrefixShardReplicaInput.class;
        }
    
        @Override
        public InstanceIdentifier<?> getPrefix() {
            return _prefix;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ShutdownPrefixShardReplicaInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_prefix);
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
            if (!ShutdownPrefixShardReplicaInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ShutdownPrefixShardReplicaInput other = (ShutdownPrefixShardReplicaInput)obj;
            if (!Objects.equals(_prefix, other.getPrefix())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ShutdownPrefixShardReplicaInputImpl otherImpl = (ShutdownPrefixShardReplicaInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ShutdownPrefixShardReplicaInput>>, Augmentation<ShutdownPrefixShardReplicaInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ShutdownPrefixShardReplicaInput");
            CodeHelpers.appendValue(helper, "_prefix", _prefix);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
