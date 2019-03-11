package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215;
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
 * Class that builds {@link RpcContextBuilder} instances.
 * 
 * @see RpcContextBuilder
 *
 */
public class RpcContextBuilder implements Builder<RpcContext> {

    private String _identifier;
    private RpcContextKey key;


    Map<Class<? extends Augmentation<RpcContext>>, Augmentation<RpcContext>> augmentation = Collections.emptyMap();

    public RpcContextBuilder() {
    }

    public RpcContextBuilder(RpcContext base) {
        this.key = base.key();
        this._identifier = base.getIdentifier();
        if (base instanceof RpcContextImpl) {
            RpcContextImpl impl = (RpcContextImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<RpcContext>>, Augmentation<RpcContext>> aug =((AugmentationHolder<RpcContext>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public RpcContextKey key() {
        return key;
    }
    
    public String getIdentifier() {
        return _identifier;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<RpcContext>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public RpcContextBuilder withKey(final RpcContextKey key) {
        this.key = key;
        return this;
    }
    
    public RpcContextBuilder setIdentifier(final String value) {
        this._identifier = value;
        return this;
    }
    
    public RpcContextBuilder addAugmentation(Class<? extends Augmentation<RpcContext>> augmentationType, Augmentation<RpcContext> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RpcContextBuilder removeAugmentation(Class<? extends Augmentation<RpcContext>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RpcContext build() {
        return new RpcContextImpl(this);
    }

    private static final class RpcContextImpl implements RpcContext {
    
        private final String _identifier;
        private final RpcContextKey key;
    
        private Map<Class<? extends Augmentation<RpcContext>>, Augmentation<RpcContext>> augmentation = Collections.emptyMap();
    
        RpcContextImpl(RpcContextBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new RpcContextKey(base.getIdentifier());
            }
            this._identifier = key.getIdentifier();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<RpcContext> getImplementedInterface() {
            return RpcContext.class;
        }
    
        @Override
        public RpcContextKey key() {
            return key;
        }
        
        @Override
        public String getIdentifier() {
            return _identifier;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<RpcContext>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_identifier);
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
            if (!RpcContext.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            RpcContext other = (RpcContext)obj;
            if (!Objects.equals(_identifier, other.getIdentifier())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RpcContextImpl otherImpl = (RpcContextImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<RpcContext>>, Augmentation<RpcContext>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("RpcContext");
            CodeHelpers.appendValue(helper, "_identifier", _identifier);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
