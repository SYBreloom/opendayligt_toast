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
 * Class that builds {@link RestockToasterInputBuilder} instances.
 * 
 * @see RestockToasterInputBuilder
 *
 */
public class RestockToasterInputBuilder implements Builder<RestockToasterInput> {

    private Long _amountOfBreadToStock;


    Map<Class<? extends Augmentation<RestockToasterInput>>, Augmentation<RestockToasterInput>> augmentation = Collections.emptyMap();

    public RestockToasterInputBuilder() {
    }

    public RestockToasterInputBuilder(RestockToasterInput base) {
        this._amountOfBreadToStock = base.getAmountOfBreadToStock();
        if (base instanceof RestockToasterInputImpl) {
            RestockToasterInputImpl impl = (RestockToasterInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<RestockToasterInput>>, Augmentation<RestockToasterInput>> aug =((AugmentationHolder<RestockToasterInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Long getAmountOfBreadToStock() {
        return _amountOfBreadToStock;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<RestockToasterInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkAmountOfBreadToStockRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public RestockToasterInputBuilder setAmountOfBreadToStock(final Long value) {
    if (value != null) {
        checkAmountOfBreadToStockRange(value);
        
    }
        this._amountOfBreadToStock = value;
        return this;
    }
    
    public RestockToasterInputBuilder addAugmentation(Class<? extends Augmentation<RestockToasterInput>> augmentationType, Augmentation<RestockToasterInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RestockToasterInputBuilder removeAugmentation(Class<? extends Augmentation<RestockToasterInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RestockToasterInput build() {
        return new RestockToasterInputImpl(this);
    }

    private static final class RestockToasterInputImpl implements RestockToasterInput {
    
        private final Long _amountOfBreadToStock;
    
        private Map<Class<? extends Augmentation<RestockToasterInput>>, Augmentation<RestockToasterInput>> augmentation = Collections.emptyMap();
    
        RestockToasterInputImpl(RestockToasterInputBuilder base) {
            this._amountOfBreadToStock = base.getAmountOfBreadToStock();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<RestockToasterInput> getImplementedInterface() {
            return RestockToasterInput.class;
        }
    
        @Override
        public Long getAmountOfBreadToStock() {
            return _amountOfBreadToStock;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<RestockToasterInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_amountOfBreadToStock);
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
            if (!RestockToasterInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            RestockToasterInput other = (RestockToasterInput)obj;
            if (!Objects.equals(_amountOfBreadToStock, other.getAmountOfBreadToStock())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RestockToasterInputImpl otherImpl = (RestockToasterInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<RestockToasterInput>>, Augmentation<RestockToasterInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("RestockToasterInput");
            CodeHelpers.appendValue(helper, "_amountOfBreadToStock", _amountOfBreadToStock);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
