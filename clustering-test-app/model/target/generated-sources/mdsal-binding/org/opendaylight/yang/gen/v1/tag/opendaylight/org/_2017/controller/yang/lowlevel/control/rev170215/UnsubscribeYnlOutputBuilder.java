package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
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
 * Class that builds {@link UnsubscribeYnlOutputBuilder} instances.
 * 
 * @see UnsubscribeYnlOutputBuilder
 *
 */
public class UnsubscribeYnlOutputBuilder implements Builder<UnsubscribeYnlOutput> {

    private Long _allNot;
    private Long _errNot;
    private Long _idNot;
    private Long _localNumber;


    Map<Class<? extends Augmentation<UnsubscribeYnlOutput>>, Augmentation<UnsubscribeYnlOutput>> augmentation = Collections.emptyMap();

    public UnsubscribeYnlOutputBuilder() {
    }

    public UnsubscribeYnlOutputBuilder(UnsubscribeYnlOutput base) {
        this._allNot = base.getAllNot();
        this._errNot = base.getErrNot();
        this._idNot = base.getIdNot();
        this._localNumber = base.getLocalNumber();
        if (base instanceof UnsubscribeYnlOutputImpl) {
            UnsubscribeYnlOutputImpl impl = (UnsubscribeYnlOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<UnsubscribeYnlOutput>>, Augmentation<UnsubscribeYnlOutput>> aug =((AugmentationHolder<UnsubscribeYnlOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Long getAllNot() {
        return _allNot;
    }
    
    public Long getErrNot() {
        return _errNot;
    }
    
    public Long getIdNot() {
        return _idNot;
    }
    
    public Long getLocalNumber() {
        return _localNumber;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<UnsubscribeYnlOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public UnsubscribeYnlOutputBuilder setAllNot(final Long value) {
        this._allNot = value;
        return this;
    }
    
    public UnsubscribeYnlOutputBuilder setErrNot(final Long value) {
        this._errNot = value;
        return this;
    }
    
    public UnsubscribeYnlOutputBuilder setIdNot(final Long value) {
        this._idNot = value;
        return this;
    }
    
    public UnsubscribeYnlOutputBuilder setLocalNumber(final Long value) {
        this._localNumber = value;
        return this;
    }
    
    public UnsubscribeYnlOutputBuilder addAugmentation(Class<? extends Augmentation<UnsubscribeYnlOutput>> augmentationType, Augmentation<UnsubscribeYnlOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UnsubscribeYnlOutputBuilder removeAugmentation(Class<? extends Augmentation<UnsubscribeYnlOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UnsubscribeYnlOutput build() {
        return new UnsubscribeYnlOutputImpl(this);
    }

    private static final class UnsubscribeYnlOutputImpl implements UnsubscribeYnlOutput {
    
        private final Long _allNot;
        private final Long _errNot;
        private final Long _idNot;
        private final Long _localNumber;
    
        private Map<Class<? extends Augmentation<UnsubscribeYnlOutput>>, Augmentation<UnsubscribeYnlOutput>> augmentation = Collections.emptyMap();
    
        UnsubscribeYnlOutputImpl(UnsubscribeYnlOutputBuilder base) {
            this._allNot = base.getAllNot();
            this._errNot = base.getErrNot();
            this._idNot = base.getIdNot();
            this._localNumber = base.getLocalNumber();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<UnsubscribeYnlOutput> getImplementedInterface() {
            return UnsubscribeYnlOutput.class;
        }
    
        @Override
        public Long getAllNot() {
            return _allNot;
        }
        
        @Override
        public Long getErrNot() {
            return _errNot;
        }
        
        @Override
        public Long getIdNot() {
            return _idNot;
        }
        
        @Override
        public Long getLocalNumber() {
            return _localNumber;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<UnsubscribeYnlOutput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_allNot);
            result = prime * result + Objects.hashCode(_errNot);
            result = prime * result + Objects.hashCode(_idNot);
            result = prime * result + Objects.hashCode(_localNumber);
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
            if (!UnsubscribeYnlOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            UnsubscribeYnlOutput other = (UnsubscribeYnlOutput)obj;
            if (!Objects.equals(_allNot, other.getAllNot())) {
                return false;
            }
            if (!Objects.equals(_errNot, other.getErrNot())) {
                return false;
            }
            if (!Objects.equals(_idNot, other.getIdNot())) {
                return false;
            }
            if (!Objects.equals(_localNumber, other.getLocalNumber())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UnsubscribeYnlOutputImpl otherImpl = (UnsubscribeYnlOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<UnsubscribeYnlOutput>>, Augmentation<UnsubscribeYnlOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("UnsubscribeYnlOutput");
            CodeHelpers.appendValue(helper, "_allNot", _allNot);
            CodeHelpers.appendValue(helper, "_errNot", _errNot);
            CodeHelpers.appendValue(helper, "_idNot", _idNot);
            CodeHelpers.appendValue(helper, "_localNumber", _localNumber);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
