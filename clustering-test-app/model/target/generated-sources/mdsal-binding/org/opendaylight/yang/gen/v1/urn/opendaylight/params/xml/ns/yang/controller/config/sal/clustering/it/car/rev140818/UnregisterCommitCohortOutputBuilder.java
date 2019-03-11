package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818;
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
 * Class that builds {@link UnregisterCommitCohortOutputBuilder} instances.
 * 
 * @see UnregisterCommitCohortOutputBuilder
 *
 */
public class UnregisterCommitCohortOutputBuilder implements Builder<UnregisterCommitCohortOutput> {



    Map<Class<? extends Augmentation<UnregisterCommitCohortOutput>>, Augmentation<UnregisterCommitCohortOutput>> augmentation = Collections.emptyMap();

    public UnregisterCommitCohortOutputBuilder() {
    }

    public UnregisterCommitCohortOutputBuilder(UnregisterCommitCohortOutput base) {
        if (base instanceof UnregisterCommitCohortOutputImpl) {
            UnregisterCommitCohortOutputImpl impl = (UnregisterCommitCohortOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<UnregisterCommitCohortOutput>>, Augmentation<UnregisterCommitCohortOutput>> aug =((AugmentationHolder<UnregisterCommitCohortOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<UnregisterCommitCohortOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public UnregisterCommitCohortOutputBuilder addAugmentation(Class<? extends Augmentation<UnregisterCommitCohortOutput>> augmentationType, Augmentation<UnregisterCommitCohortOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UnregisterCommitCohortOutputBuilder removeAugmentation(Class<? extends Augmentation<UnregisterCommitCohortOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UnregisterCommitCohortOutput build() {
        return new UnregisterCommitCohortOutputImpl(this);
    }

    private static final class UnregisterCommitCohortOutputImpl implements UnregisterCommitCohortOutput {
    
    
        private Map<Class<? extends Augmentation<UnregisterCommitCohortOutput>>, Augmentation<UnregisterCommitCohortOutput>> augmentation = Collections.emptyMap();
    
        UnregisterCommitCohortOutputImpl(UnregisterCommitCohortOutputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<UnregisterCommitCohortOutput> getImplementedInterface() {
            return UnregisterCommitCohortOutput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<UnregisterCommitCohortOutput>> E augmentation(Class<E> augmentationType) {
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
            if (!UnregisterCommitCohortOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            UnregisterCommitCohortOutput other = (UnregisterCommitCohortOutput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UnregisterCommitCohortOutputImpl otherImpl = (UnregisterCommitCohortOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<UnregisterCommitCohortOutput>>, Augmentation<UnregisterCommitCohortOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("UnregisterCommitCohortOutput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
