package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.Long;
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
 * Class that builds {@link CheckPublishNotificationsOutputBuilder} instances.
 * 
 * @see CheckPublishNotificationsOutputBuilder
 *
 */
public class CheckPublishNotificationsOutputBuilder implements Builder<CheckPublishNotificationsOutput> {

    private String _lastError;
    private Long _publishCount;
    private Boolean _active;


    Map<Class<? extends Augmentation<CheckPublishNotificationsOutput>>, Augmentation<CheckPublishNotificationsOutput>> augmentation = Collections.emptyMap();

    public CheckPublishNotificationsOutputBuilder() {
    }

    public CheckPublishNotificationsOutputBuilder(CheckPublishNotificationsOutput base) {
        this._lastError = base.getLastError();
        this._publishCount = base.getPublishCount();
        this._active = base.isActive();
        if (base instanceof CheckPublishNotificationsOutputImpl) {
            CheckPublishNotificationsOutputImpl impl = (CheckPublishNotificationsOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CheckPublishNotificationsOutput>>, Augmentation<CheckPublishNotificationsOutput>> aug =((AugmentationHolder<CheckPublishNotificationsOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public String getLastError() {
        return _lastError;
    }
    
    public Long getPublishCount() {
        return _publishCount;
    }
    
    public Boolean isActive() {
        return _active;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CheckPublishNotificationsOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public CheckPublishNotificationsOutputBuilder setLastError(final String value) {
        this._lastError = value;
        return this;
    }
    
    public CheckPublishNotificationsOutputBuilder setPublishCount(final Long value) {
        this._publishCount = value;
        return this;
    }
    
    public CheckPublishNotificationsOutputBuilder setActive(final Boolean value) {
        this._active = value;
        return this;
    }
    
    public CheckPublishNotificationsOutputBuilder addAugmentation(Class<? extends Augmentation<CheckPublishNotificationsOutput>> augmentationType, Augmentation<CheckPublishNotificationsOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CheckPublishNotificationsOutputBuilder removeAugmentation(Class<? extends Augmentation<CheckPublishNotificationsOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CheckPublishNotificationsOutput build() {
        return new CheckPublishNotificationsOutputImpl(this);
    }

    private static final class CheckPublishNotificationsOutputImpl implements CheckPublishNotificationsOutput {
    
        private final String _lastError;
        private final Long _publishCount;
        private final Boolean _active;
    
        private Map<Class<? extends Augmentation<CheckPublishNotificationsOutput>>, Augmentation<CheckPublishNotificationsOutput>> augmentation = Collections.emptyMap();
    
        CheckPublishNotificationsOutputImpl(CheckPublishNotificationsOutputBuilder base) {
            this._lastError = base.getLastError();
            this._publishCount = base.getPublishCount();
            this._active = base.isActive();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CheckPublishNotificationsOutput> getImplementedInterface() {
            return CheckPublishNotificationsOutput.class;
        }
    
        @Override
        public String getLastError() {
            return _lastError;
        }
        
        @Override
        public Long getPublishCount() {
            return _publishCount;
        }
        
        @Override
        public Boolean isActive() {
            return _active;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CheckPublishNotificationsOutput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_lastError);
            result = prime * result + Objects.hashCode(_publishCount);
            result = prime * result + Objects.hashCode(_active);
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
            if (!CheckPublishNotificationsOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CheckPublishNotificationsOutput other = (CheckPublishNotificationsOutput)obj;
            if (!Objects.equals(_lastError, other.getLastError())) {
                return false;
            }
            if (!Objects.equals(_publishCount, other.getPublishCount())) {
                return false;
            }
            if (!Objects.equals(_active, other.isActive())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CheckPublishNotificationsOutputImpl otherImpl = (CheckPublishNotificationsOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CheckPublishNotificationsOutput>>, Augmentation<CheckPublishNotificationsOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CheckPublishNotificationsOutput");
            CodeHelpers.appendValue(helper, "_lastError", _lastError);
            CodeHelpers.appendValue(helper, "_publishCount", _publishCount);
            CodeHelpers.appendValue(helper, "_active", _active);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
