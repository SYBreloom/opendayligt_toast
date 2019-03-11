package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Integer;
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
 * Class that builds {@link StressTestInputBuilder} instances.
 * 
 * @see StressTestInputBuilder
 *
 */
public class StressTestInputBuilder implements Builder<StressTestInput> {

    private Long _count;
    private Integer _rate;


    Map<Class<? extends Augmentation<StressTestInput>>, Augmentation<StressTestInput>> augmentation = Collections.emptyMap();

    public StressTestInputBuilder() {
    }

    public StressTestInputBuilder(StressTestInput base) {
        this._count = base.getCount();
        this._rate = base.getRate();
        if (base instanceof StressTestInputImpl) {
            StressTestInputImpl impl = (StressTestInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<StressTestInput>>, Augmentation<StressTestInput>> aug =((AugmentationHolder<StressTestInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Long getCount() {
        return _count;
    }
    
    public Integer getRate() {
        return _rate;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<StressTestInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkCountRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public StressTestInputBuilder setCount(final Long value) {
    if (value != null) {
        checkCountRange(value);
        
    }
        this._count = value;
        return this;
    }
    private static void checkRateRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..65535]]", value);
    }
    
    public StressTestInputBuilder setRate(final Integer value) {
    if (value != null) {
        checkRateRange(value);
        
    }
        this._rate = value;
        return this;
    }
    
    public StressTestInputBuilder addAugmentation(Class<? extends Augmentation<StressTestInput>> augmentationType, Augmentation<StressTestInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public StressTestInputBuilder removeAugmentation(Class<? extends Augmentation<StressTestInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public StressTestInput build() {
        return new StressTestInputImpl(this);
    }

    private static final class StressTestInputImpl implements StressTestInput {
    
        private final Long _count;
        private final Integer _rate;
    
        private Map<Class<? extends Augmentation<StressTestInput>>, Augmentation<StressTestInput>> augmentation = Collections.emptyMap();
    
        StressTestInputImpl(StressTestInputBuilder base) {
            this._count = base.getCount();
            this._rate = base.getRate();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<StressTestInput> getImplementedInterface() {
            return StressTestInput.class;
        }
    
        @Override
        public Long getCount() {
            return _count;
        }
        
        @Override
        public Integer getRate() {
            return _rate;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<StressTestInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_count);
            result = prime * result + Objects.hashCode(_rate);
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
            if (!StressTestInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            StressTestInput other = (StressTestInput)obj;
            if (!Objects.equals(_count, other.getCount())) {
                return false;
            }
            if (!Objects.equals(_rate, other.getRate())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StressTestInputImpl otherImpl = (StressTestInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<StressTestInput>>, Augmentation<StressTestInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("StressTestInput");
            CodeHelpers.appendValue(helper, "_count", _count);
            CodeHelpers.appendValue(helper, "_rate", _rate);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
