package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Boolean;
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
 * Class that builds {@link IsClientAbortedOutputBuilder} instances.
 * 
 * @see IsClientAbortedOutputBuilder
 *
 */
public class IsClientAbortedOutputBuilder implements Builder<IsClientAbortedOutput> {

    private Boolean _aborted;


    Map<Class<? extends Augmentation<IsClientAbortedOutput>>, Augmentation<IsClientAbortedOutput>> augmentation = Collections.emptyMap();

    public IsClientAbortedOutputBuilder() {
    }

    public IsClientAbortedOutputBuilder(IsClientAbortedOutput base) {
        this._aborted = base.isAborted();
        if (base instanceof IsClientAbortedOutputImpl) {
            IsClientAbortedOutputImpl impl = (IsClientAbortedOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<IsClientAbortedOutput>>, Augmentation<IsClientAbortedOutput>> aug =((AugmentationHolder<IsClientAbortedOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Boolean isAborted() {
        return _aborted;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<IsClientAbortedOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public IsClientAbortedOutputBuilder setAborted(final Boolean value) {
        this._aborted = value;
        return this;
    }
    
    public IsClientAbortedOutputBuilder addAugmentation(Class<? extends Augmentation<IsClientAbortedOutput>> augmentationType, Augmentation<IsClientAbortedOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IsClientAbortedOutputBuilder removeAugmentation(Class<? extends Augmentation<IsClientAbortedOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IsClientAbortedOutput build() {
        return new IsClientAbortedOutputImpl(this);
    }

    private static final class IsClientAbortedOutputImpl implements IsClientAbortedOutput {
    
        private final Boolean _aborted;
    
        private Map<Class<? extends Augmentation<IsClientAbortedOutput>>, Augmentation<IsClientAbortedOutput>> augmentation = Collections.emptyMap();
    
        IsClientAbortedOutputImpl(IsClientAbortedOutputBuilder base) {
            this._aborted = base.isAborted();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<IsClientAbortedOutput> getImplementedInterface() {
            return IsClientAbortedOutput.class;
        }
    
        @Override
        public Boolean isAborted() {
            return _aborted;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<IsClientAbortedOutput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_aborted);
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
            if (!IsClientAbortedOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            IsClientAbortedOutput other = (IsClientAbortedOutput)obj;
            if (!Objects.equals(_aborted, other.isAborted())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IsClientAbortedOutputImpl otherImpl = (IsClientAbortedOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<IsClientAbortedOutput>>, Augmentation<IsClientAbortedOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("IsClientAbortedOutput");
            CodeHelpers.appendValue(helper, "_aborted", _aborted);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
