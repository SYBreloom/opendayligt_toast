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
 * Class that builds {@link ToasterRestockedBuilder} instances.
 * 
 * @see ToasterRestockedBuilder
 *
 */
public class ToasterRestockedBuilder implements Builder<ToasterRestocked> {

    private Long _amountOfBread;


    Map<Class<? extends Augmentation<ToasterRestocked>>, Augmentation<ToasterRestocked>> augmentation = Collections.emptyMap();

    public ToasterRestockedBuilder() {
    }

    public ToasterRestockedBuilder(ToasterRestocked base) {
        this._amountOfBread = base.getAmountOfBread();
        if (base instanceof ToasterRestockedImpl) {
            ToasterRestockedImpl impl = (ToasterRestockedImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ToasterRestocked>>, Augmentation<ToasterRestocked>> aug =((AugmentationHolder<ToasterRestocked>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Long getAmountOfBread() {
        return _amountOfBread;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ToasterRestocked>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkAmountOfBreadRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public ToasterRestockedBuilder setAmountOfBread(final Long value) {
    if (value != null) {
        checkAmountOfBreadRange(value);
        
    }
        this._amountOfBread = value;
        return this;
    }
    
    public ToasterRestockedBuilder addAugmentation(Class<? extends Augmentation<ToasterRestocked>> augmentationType, Augmentation<ToasterRestocked> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ToasterRestockedBuilder removeAugmentation(Class<? extends Augmentation<ToasterRestocked>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ToasterRestocked build() {
        return new ToasterRestockedImpl(this);
    }

    private static final class ToasterRestockedImpl implements ToasterRestocked {
    
        private final Long _amountOfBread;
    
        private Map<Class<? extends Augmentation<ToasterRestocked>>, Augmentation<ToasterRestocked>> augmentation = Collections.emptyMap();
    
        ToasterRestockedImpl(ToasterRestockedBuilder base) {
            this._amountOfBread = base.getAmountOfBread();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ToasterRestocked> getImplementedInterface() {
            return ToasterRestocked.class;
        }
    
        @Override
        public Long getAmountOfBread() {
            return _amountOfBread;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ToasterRestocked>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_amountOfBread);
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
            if (!ToasterRestocked.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ToasterRestocked other = (ToasterRestocked)obj;
            if (!Objects.equals(_amountOfBread, other.getAmountOfBread())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ToasterRestockedImpl otherImpl = (ToasterRestockedImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ToasterRestocked>>, Augmentation<ToasterRestocked>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ToasterRestocked");
            CodeHelpers.appendValue(helper, "_amountOfBread", _amountOfBread);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
