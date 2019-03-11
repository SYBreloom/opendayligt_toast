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
 * Class that builds {@link ToasterBuilder} instances.
 * 
 * @see ToasterBuilder
 *
 */
public class ToasterBuilder implements Builder<Toaster> {

    private Long _darknessFactor;
    private DisplayString _toasterManufacturer;
    private DisplayString _toasterModelNumber;
    private Toaster.ToasterStatus _toasterStatus;


    Map<Class<? extends Augmentation<Toaster>>, Augmentation<Toaster>> augmentation = Collections.emptyMap();

    public ToasterBuilder() {
    }

    public ToasterBuilder(Toaster base) {
        this._darknessFactor = base.getDarknessFactor();
        this._toasterManufacturer = base.getToasterManufacturer();
        this._toasterModelNumber = base.getToasterModelNumber();
        this._toasterStatus = base.getToasterStatus();
        if (base instanceof ToasterImpl) {
            ToasterImpl impl = (ToasterImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Toaster>>, Augmentation<Toaster>> aug =((AugmentationHolder<Toaster>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Long getDarknessFactor() {
        return _darknessFactor;
    }
    
    public DisplayString getToasterManufacturer() {
        return _toasterManufacturer;
    }
    
    public DisplayString getToasterModelNumber() {
        return _toasterModelNumber;
    }
    
    public Toaster.ToasterStatus getToasterStatus() {
        return _toasterStatus;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Toaster>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkDarknessFactorRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public ToasterBuilder setDarknessFactor(final Long value) {
    if (value != null) {
        checkDarknessFactorRange(value);
        
    }
        this._darknessFactor = value;
        return this;
    }
    
    public ToasterBuilder setToasterManufacturer(final DisplayString value) {
        this._toasterManufacturer = value;
        return this;
    }
    
    public ToasterBuilder setToasterModelNumber(final DisplayString value) {
        this._toasterModelNumber = value;
        return this;
    }
    
    public ToasterBuilder setToasterStatus(final Toaster.ToasterStatus value) {
        this._toasterStatus = value;
        return this;
    }
    
    public ToasterBuilder addAugmentation(Class<? extends Augmentation<Toaster>> augmentationType, Augmentation<Toaster> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ToasterBuilder removeAugmentation(Class<? extends Augmentation<Toaster>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Toaster build() {
        return new ToasterImpl(this);
    }

    private static final class ToasterImpl implements Toaster {
    
        private final Long _darknessFactor;
        private final DisplayString _toasterManufacturer;
        private final DisplayString _toasterModelNumber;
        private final Toaster.ToasterStatus _toasterStatus;
    
        private Map<Class<? extends Augmentation<Toaster>>, Augmentation<Toaster>> augmentation = Collections.emptyMap();
    
        ToasterImpl(ToasterBuilder base) {
            this._darknessFactor = base.getDarknessFactor();
            this._toasterManufacturer = base.getToasterManufacturer();
            this._toasterModelNumber = base.getToasterModelNumber();
            this._toasterStatus = base.getToasterStatus();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Toaster> getImplementedInterface() {
            return Toaster.class;
        }
    
        @Override
        public Long getDarknessFactor() {
            return _darknessFactor;
        }
        
        @Override
        public DisplayString getToasterManufacturer() {
            return _toasterManufacturer;
        }
        
        @Override
        public DisplayString getToasterModelNumber() {
            return _toasterModelNumber;
        }
        
        @Override
        public Toaster.ToasterStatus getToasterStatus() {
            return _toasterStatus;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Toaster>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_darknessFactor);
            result = prime * result + Objects.hashCode(_toasterManufacturer);
            result = prime * result + Objects.hashCode(_toasterModelNumber);
            result = prime * result + Objects.hashCode(_toasterStatus);
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
            if (!Toaster.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Toaster other = (Toaster)obj;
            if (!Objects.equals(_darknessFactor, other.getDarknessFactor())) {
                return false;
            }
            if (!Objects.equals(_toasterManufacturer, other.getToasterManufacturer())) {
                return false;
            }
            if (!Objects.equals(_toasterModelNumber, other.getToasterModelNumber())) {
                return false;
            }
            if (!Objects.equals(_toasterStatus, other.getToasterStatus())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ToasterImpl otherImpl = (ToasterImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Toaster>>, Augmentation<Toaster>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Toaster");
            CodeHelpers.appendValue(helper, "_darknessFactor", _darknessFactor);
            CodeHelpers.appendValue(helper, "_toasterManufacturer", _toasterManufacturer);
            CodeHelpers.appendValue(helper, "_toasterModelNumber", _toasterModelNumber);
            CodeHelpers.appendValue(helper, "_toasterStatus", _toasterStatus);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
