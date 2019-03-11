package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
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
 * Class that builds {@link StopStressTestOutputBuilder} instances.
 * 
 * @see StopStressTestOutputBuilder
 *
 */
public class StopStressTestOutputBuilder implements Builder<StopStressTestOutput> {

    private Long _failureCount;
    private Long _successCount;


    Map<Class<? extends Augmentation<StopStressTestOutput>>, Augmentation<StopStressTestOutput>> augmentation = Collections.emptyMap();

    public StopStressTestOutputBuilder() {
    }

    public StopStressTestOutputBuilder(StopStressTestOutput base) {
        this._failureCount = base.getFailureCount();
        this._successCount = base.getSuccessCount();
        if (base instanceof StopStressTestOutputImpl) {
            StopStressTestOutputImpl impl = (StopStressTestOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<StopStressTestOutput>>, Augmentation<StopStressTestOutput>> aug =((AugmentationHolder<StopStressTestOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Long getFailureCount() {
        return _failureCount;
    }
    
    public Long getSuccessCount() {
        return _successCount;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<StopStressTestOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    private static void checkFailureCountRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public StopStressTestOutputBuilder setFailureCount(final Long value) {
    if (value != null) {
        checkFailureCountRange(value);
        
    }
        this._failureCount = value;
        return this;
    }
    private static void checkSuccessCountRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public StopStressTestOutputBuilder setSuccessCount(final Long value) {
    if (value != null) {
        checkSuccessCountRange(value);
        
    }
        this._successCount = value;
        return this;
    }
    
    public StopStressTestOutputBuilder addAugmentation(Class<? extends Augmentation<StopStressTestOutput>> augmentationType, Augmentation<StopStressTestOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public StopStressTestOutputBuilder removeAugmentation(Class<? extends Augmentation<StopStressTestOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public StopStressTestOutput build() {
        return new StopStressTestOutputImpl(this);
    }

    private static final class StopStressTestOutputImpl implements StopStressTestOutput {
    
        private final Long _failureCount;
        private final Long _successCount;
    
        private Map<Class<? extends Augmentation<StopStressTestOutput>>, Augmentation<StopStressTestOutput>> augmentation = Collections.emptyMap();
    
        StopStressTestOutputImpl(StopStressTestOutputBuilder base) {
            this._failureCount = base.getFailureCount();
            this._successCount = base.getSuccessCount();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<StopStressTestOutput> getImplementedInterface() {
            return StopStressTestOutput.class;
        }
    
        @Override
        public Long getFailureCount() {
            return _failureCount;
        }
        
        @Override
        public Long getSuccessCount() {
            return _successCount;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<StopStressTestOutput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_failureCount);
            result = prime * result + Objects.hashCode(_successCount);
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
            if (!StopStressTestOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            StopStressTestOutput other = (StopStressTestOutput)obj;
            if (!Objects.equals(_failureCount, other.getFailureCount())) {
                return false;
            }
            if (!Objects.equals(_successCount, other.getSuccessCount())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StopStressTestOutputImpl otherImpl = (StopStressTestOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<StopStressTestOutput>>, Augmentation<StopStressTestOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("StopStressTestOutput");
            CodeHelpers.appendValue(helper, "_failureCount", _failureCount);
            CodeHelpers.appendValue(helper, "_successCount", _successCount);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
