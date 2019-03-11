package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
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
 * Class that builds {@link CancelToastOutputBuilder} instances.
 * 
 * @see CancelToastOutputBuilder
 *
 */
public class CancelToastOutputBuilder implements Builder<CancelToastOutput> {



    Map<Class<? extends Augmentation<CancelToastOutput>>, Augmentation<CancelToastOutput>> augmentation = Collections.emptyMap();

    public CancelToastOutputBuilder() {
    }

    public CancelToastOutputBuilder(CancelToastOutput base) {
        if (base instanceof CancelToastOutputImpl) {
            CancelToastOutputImpl impl = (CancelToastOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CancelToastOutput>>, Augmentation<CancelToastOutput>> aug =((AugmentationHolder<CancelToastOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CancelToastOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public CancelToastOutputBuilder addAugmentation(Class<? extends Augmentation<CancelToastOutput>> augmentationType, Augmentation<CancelToastOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CancelToastOutputBuilder removeAugmentation(Class<? extends Augmentation<CancelToastOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CancelToastOutput build() {
        return new CancelToastOutputImpl(this);
    }

    private static final class CancelToastOutputImpl implements CancelToastOutput {
    
    
        private Map<Class<? extends Augmentation<CancelToastOutput>>, Augmentation<CancelToastOutput>> augmentation = Collections.emptyMap();
    
        CancelToastOutputImpl(CancelToastOutputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CancelToastOutput> getImplementedInterface() {
            return CancelToastOutput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CancelToastOutput>> E augmentation(Class<E> augmentationType) {
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
            if (!CancelToastOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CancelToastOutput other = (CancelToastOutput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CancelToastOutputImpl otherImpl = (CancelToastOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CancelToastOutput>>, Augmentation<CancelToastOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CancelToastOutput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
