package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
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
 * Class that builds {@link MakeToastInputBuilder} instances.
 * 
 * @see MakeToastInputBuilder
 *
 */
public class MakeToastInputBuilder implements Builder<MakeToastInput> {

    private Long _toasterDoneness;
    private Class<? extends ToastType> _toasterToastType;


    Map<Class<? extends Augmentation<MakeToastInput>>, Augmentation<MakeToastInput>> augmentation = Collections.emptyMap();

    public MakeToastInputBuilder() {
    }

    public MakeToastInputBuilder(MakeToastInput base) {
        this._toasterDoneness = base.getToasterDoneness();
        this._toasterToastType = base.getToasterToastType();
        if (base instanceof MakeToastInputImpl) {
            MakeToastInputImpl impl = (MakeToastInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<MakeToastInput>>, Augmentation<MakeToastInput>> aug =((AugmentationHolder<MakeToastInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Long getToasterDoneness() {
        return _toasterDoneness;
    }
    
    public Class<? extends ToastType> getToasterToastType() {
        return _toasterToastType;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<MakeToastInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkToasterDonenessRange(final long value) {
        if (value >= 1L && value <= 10L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[1..10]]", value);
    }
    
    public MakeToastInputBuilder setToasterDoneness(final Long value) {
    if (value != null) {
        checkToasterDonenessRange(value);
        
    }
        this._toasterDoneness = value;
        return this;
    }
    
    public MakeToastInputBuilder setToasterToastType(final Class<? extends ToastType> value) {
        this._toasterToastType = value;
        return this;
    }
    
    public MakeToastInputBuilder addAugmentation(Class<? extends Augmentation<MakeToastInput>> augmentationType, Augmentation<MakeToastInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MakeToastInputBuilder removeAugmentation(Class<? extends Augmentation<MakeToastInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MakeToastInput build() {
        return new MakeToastInputImpl(this);
    }

    private static final class MakeToastInputImpl implements MakeToastInput {
    
        private final Long _toasterDoneness;
        private final Class<? extends ToastType> _toasterToastType;
    
        private Map<Class<? extends Augmentation<MakeToastInput>>, Augmentation<MakeToastInput>> augmentation = Collections.emptyMap();
    
        MakeToastInputImpl(MakeToastInputBuilder base) {
            this._toasterDoneness = base.getToasterDoneness();
            this._toasterToastType = base.getToasterToastType();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<MakeToastInput> getImplementedInterface() {
            return MakeToastInput.class;
        }
    
        @Override
        public Long getToasterDoneness() {
            return _toasterDoneness;
        }
        
        @Override
        public Class<? extends ToastType> getToasterToastType() {
            return _toasterToastType;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<MakeToastInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_toasterDoneness);
            result = prime * result + Objects.hashCode(_toasterToastType);
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
            if (!MakeToastInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            MakeToastInput other = (MakeToastInput)obj;
            if (!Objects.equals(_toasterDoneness, other.getToasterDoneness())) {
                return false;
            }
            if (!Objects.equals(_toasterToastType, other.getToasterToastType())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MakeToastInputImpl otherImpl = (MakeToastInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MakeToastInput>>, Augmentation<MakeToastInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MakeToastInput");
            CodeHelpers.appendValue(helper, "_toasterDoneness", _toasterDoneness);
            CodeHelpers.appendValue(helper, "_toasterToastType", _toasterToastType);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
