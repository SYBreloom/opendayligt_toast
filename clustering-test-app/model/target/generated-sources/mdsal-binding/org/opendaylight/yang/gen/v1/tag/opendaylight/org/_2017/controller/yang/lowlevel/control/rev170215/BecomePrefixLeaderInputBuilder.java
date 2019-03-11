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
 * Class that builds {@link BecomePrefixLeaderInputBuilder} instances.
 * 
 * @see BecomePrefixLeaderInputBuilder
 *
 */
public class BecomePrefixLeaderInputBuilder implements Builder<BecomePrefixLeaderInput> {

    private InstanceIdentifier<?> _prefix;


    Map<Class<? extends Augmentation<BecomePrefixLeaderInput>>, Augmentation<BecomePrefixLeaderInput>> augmentation = Collections.emptyMap();

    public BecomePrefixLeaderInputBuilder() {
    }

    public BecomePrefixLeaderInputBuilder(BecomePrefixLeaderInput base) {
        this._prefix = base.getPrefix();
        if (base instanceof BecomePrefixLeaderInputImpl) {
            BecomePrefixLeaderInputImpl impl = (BecomePrefixLeaderInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<BecomePrefixLeaderInput>>, Augmentation<BecomePrefixLeaderInput>> aug =((AugmentationHolder<BecomePrefixLeaderInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public InstanceIdentifier<?> getPrefix() {
        return _prefix;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<BecomePrefixLeaderInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public BecomePrefixLeaderInputBuilder setPrefix(final InstanceIdentifier<?> value) {
        this._prefix = value;
        return this;
    }
    
    public BecomePrefixLeaderInputBuilder addAugmentation(Class<? extends Augmentation<BecomePrefixLeaderInput>> augmentationType, Augmentation<BecomePrefixLeaderInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public BecomePrefixLeaderInputBuilder removeAugmentation(Class<? extends Augmentation<BecomePrefixLeaderInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public BecomePrefixLeaderInput build() {
        return new BecomePrefixLeaderInputImpl(this);
    }

    private static final class BecomePrefixLeaderInputImpl implements BecomePrefixLeaderInput {
    
        private final InstanceIdentifier<?> _prefix;
    
        private Map<Class<? extends Augmentation<BecomePrefixLeaderInput>>, Augmentation<BecomePrefixLeaderInput>> augmentation = Collections.emptyMap();
    
        BecomePrefixLeaderInputImpl(BecomePrefixLeaderInputBuilder base) {
            this._prefix = base.getPrefix();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<BecomePrefixLeaderInput> getImplementedInterface() {
            return BecomePrefixLeaderInput.class;
        }
    
        @Override
        public InstanceIdentifier<?> getPrefix() {
            return _prefix;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<BecomePrefixLeaderInput>> E augmentation(Class<E> augmentationType) {
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
            if (!BecomePrefixLeaderInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            BecomePrefixLeaderInput other = (BecomePrefixLeaderInput)obj;
            if (!Objects.equals(_prefix, other.getPrefix())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                BecomePrefixLeaderInputImpl otherImpl = (BecomePrefixLeaderInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<BecomePrefixLeaderInput>>, Augmentation<BecomePrefixLeaderInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("BecomePrefixLeaderInput");
            CodeHelpers.appendValue(helper, "_prefix", _prefix);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
