package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

/**
 * Class that builds {@link CreatePrefixShardInputBuilder} instances.
 * 
 * @see CreatePrefixShardInputBuilder
 *
 */
public class CreatePrefixShardInputBuilder implements Builder<CreatePrefixShardInput> {

    private InstanceIdentifier<?> _prefix;
    private List<String> _replicas;


    Map<Class<? extends Augmentation<CreatePrefixShardInput>>, Augmentation<CreatePrefixShardInput>> augmentation = Collections.emptyMap();

    public CreatePrefixShardInputBuilder() {
    }

    public CreatePrefixShardInputBuilder(CreatePrefixShardInput base) {
        this._prefix = base.getPrefix();
        this._replicas = base.getReplicas();
        if (base instanceof CreatePrefixShardInputImpl) {
            CreatePrefixShardInputImpl impl = (CreatePrefixShardInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CreatePrefixShardInput>>, Augmentation<CreatePrefixShardInput>> aug =((AugmentationHolder<CreatePrefixShardInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public InstanceIdentifier<?> getPrefix() {
        return _prefix;
    }
    
    public List<String> getReplicas() {
        return _replicas;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CreatePrefixShardInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public CreatePrefixShardInputBuilder setPrefix(final InstanceIdentifier<?> value) {
        this._prefix = value;
        return this;
    }
    public CreatePrefixShardInputBuilder setReplicas(final List<String> values) {
        this._replicas = values;
        return this;
    }
    
    
    public CreatePrefixShardInputBuilder addAugmentation(Class<? extends Augmentation<CreatePrefixShardInput>> augmentationType, Augmentation<CreatePrefixShardInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CreatePrefixShardInputBuilder removeAugmentation(Class<? extends Augmentation<CreatePrefixShardInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CreatePrefixShardInput build() {
        return new CreatePrefixShardInputImpl(this);
    }

    private static final class CreatePrefixShardInputImpl implements CreatePrefixShardInput {
    
        private final InstanceIdentifier<?> _prefix;
        private final List<String> _replicas;
    
        private Map<Class<? extends Augmentation<CreatePrefixShardInput>>, Augmentation<CreatePrefixShardInput>> augmentation = Collections.emptyMap();
    
        CreatePrefixShardInputImpl(CreatePrefixShardInputBuilder base) {
            this._prefix = base.getPrefix();
            this._replicas = base.getReplicas();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CreatePrefixShardInput> getImplementedInterface() {
            return CreatePrefixShardInput.class;
        }
    
        @Override
        public InstanceIdentifier<?> getPrefix() {
            return _prefix;
        }
        
        @Override
        public List<String> getReplicas() {
            return _replicas;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CreatePrefixShardInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_replicas);
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
            if (!CreatePrefixShardInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CreatePrefixShardInput other = (CreatePrefixShardInput)obj;
            if (!Objects.equals(_prefix, other.getPrefix())) {
                return false;
            }
            if (!Objects.equals(_replicas, other.getReplicas())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CreatePrefixShardInputImpl otherImpl = (CreatePrefixShardInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CreatePrefixShardInput>>, Augmentation<CreatePrefixShardInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CreatePrefixShardInput");
            CodeHelpers.appendValue(helper, "_prefix", _prefix);
            CodeHelpers.appendValue(helper, "_replicas", _replicas);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
