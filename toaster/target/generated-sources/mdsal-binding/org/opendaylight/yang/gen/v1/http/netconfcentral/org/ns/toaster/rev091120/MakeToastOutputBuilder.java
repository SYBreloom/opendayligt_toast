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
 * Class that builds {@link MakeToastOutputBuilder} instances.
 * 
 * @see MakeToastOutputBuilder
 *
 */
public class MakeToastOutputBuilder implements Builder<MakeToastOutput> {



    Map<Class<? extends Augmentation<MakeToastOutput>>, Augmentation<MakeToastOutput>> augmentation = Collections.emptyMap();

    public MakeToastOutputBuilder() {
    }

    public MakeToastOutputBuilder(MakeToastOutput base) {
        if (base instanceof MakeToastOutputImpl) {
            MakeToastOutputImpl impl = (MakeToastOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<MakeToastOutput>>, Augmentation<MakeToastOutput>> aug =((AugmentationHolder<MakeToastOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<MakeToastOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public MakeToastOutputBuilder addAugmentation(Class<? extends Augmentation<MakeToastOutput>> augmentationType, Augmentation<MakeToastOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public MakeToastOutputBuilder removeAugmentation(Class<? extends Augmentation<MakeToastOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public MakeToastOutput build() {
        return new MakeToastOutputImpl(this);
    }

    private static final class MakeToastOutputImpl implements MakeToastOutput {
    
    
        private Map<Class<? extends Augmentation<MakeToastOutput>>, Augmentation<MakeToastOutput>> augmentation = Collections.emptyMap();
    
        MakeToastOutputImpl(MakeToastOutputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<MakeToastOutput> getImplementedInterface() {
            return MakeToastOutput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<MakeToastOutput>> E augmentation(Class<E> augmentationType) {
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
            if (!MakeToastOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            MakeToastOutput other = (MakeToastOutput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                MakeToastOutputImpl otherImpl = (MakeToastOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<MakeToastOutput>>, Augmentation<MakeToastOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("MakeToastOutput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
