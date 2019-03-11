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
 * Class that builds {@link RemovePrefixShardInputBuilder} instances.
 * 
 * @see RemovePrefixShardInputBuilder
 *
 */
public class RemovePrefixShardInputBuilder implements Builder<RemovePrefixShardInput> {

    private InstanceIdentifier<?> _prefix;


    Map<Class<? extends Augmentation<RemovePrefixShardInput>>, Augmentation<RemovePrefixShardInput>> augmentation = Collections.emptyMap();

    public RemovePrefixShardInputBuilder() {
    }

    public RemovePrefixShardInputBuilder(RemovePrefixShardInput base) {
        this._prefix = base.getPrefix();
        if (base instanceof RemovePrefixShardInputImpl) {
            RemovePrefixShardInputImpl impl = (RemovePrefixShardInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<RemovePrefixShardInput>>, Augmentation<RemovePrefixShardInput>> aug =((AugmentationHolder<RemovePrefixShardInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public InstanceIdentifier<?> getPrefix() {
        return _prefix;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<RemovePrefixShardInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public RemovePrefixShardInputBuilder setPrefix(final InstanceIdentifier<?> value) {
        this._prefix = value;
        return this;
    }
    
    public RemovePrefixShardInputBuilder addAugmentation(Class<? extends Augmentation<RemovePrefixShardInput>> augmentationType, Augmentation<RemovePrefixShardInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RemovePrefixShardInputBuilder removeAugmentation(Class<? extends Augmentation<RemovePrefixShardInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RemovePrefixShardInput build() {
        return new RemovePrefixShardInputImpl(this);
    }

    private static final class RemovePrefixShardInputImpl implements RemovePrefixShardInput {
    
        private final InstanceIdentifier<?> _prefix;
    
        private Map<Class<? extends Augmentation<RemovePrefixShardInput>>, Augmentation<RemovePrefixShardInput>> augmentation = Collections.emptyMap();
    
        RemovePrefixShardInputImpl(RemovePrefixShardInputBuilder base) {
            this._prefix = base.getPrefix();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<RemovePrefixShardInput> getImplementedInterface() {
            return RemovePrefixShardInput.class;
        }
    
        @Override
        public InstanceIdentifier<?> getPrefix() {
            return _prefix;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<RemovePrefixShardInput>> E augmentation(Class<E> augmentationType) {
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
            if (!RemovePrefixShardInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            RemovePrefixShardInput other = (RemovePrefixShardInput)obj;
            if (!Objects.equals(_prefix, other.getPrefix())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RemovePrefixShardInputImpl otherImpl = (RemovePrefixShardInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<RemovePrefixShardInput>>, Augmentation<RemovePrefixShardInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("RemovePrefixShardInput");
            CodeHelpers.appendValue(helper, "_prefix", _prefix);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
