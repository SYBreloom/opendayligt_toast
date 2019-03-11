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
 * Class that builds {@link RestockToasterOutputBuilder} instances.
 * 
 * @see RestockToasterOutputBuilder
 *
 */
public class RestockToasterOutputBuilder implements Builder<RestockToasterOutput> {



    Map<Class<? extends Augmentation<RestockToasterOutput>>, Augmentation<RestockToasterOutput>> augmentation = Collections.emptyMap();

    public RestockToasterOutputBuilder() {
    }

    public RestockToasterOutputBuilder(RestockToasterOutput base) {
        if (base instanceof RestockToasterOutputImpl) {
            RestockToasterOutputImpl impl = (RestockToasterOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<RestockToasterOutput>>, Augmentation<RestockToasterOutput>> aug =((AugmentationHolder<RestockToasterOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<RestockToasterOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public RestockToasterOutputBuilder addAugmentation(Class<? extends Augmentation<RestockToasterOutput>> augmentationType, Augmentation<RestockToasterOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RestockToasterOutputBuilder removeAugmentation(Class<? extends Augmentation<RestockToasterOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RestockToasterOutput build() {
        return new RestockToasterOutputImpl(this);
    }

    private static final class RestockToasterOutputImpl implements RestockToasterOutput {
    
    
        private Map<Class<? extends Augmentation<RestockToasterOutput>>, Augmentation<RestockToasterOutput>> augmentation = Collections.emptyMap();
    
        RestockToasterOutputImpl(RestockToasterOutputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<RestockToasterOutput> getImplementedInterface() {
            return RestockToasterOutput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<RestockToasterOutput>> E augmentation(Class<E> augmentationType) {
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
            if (!RestockToasterOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            RestockToasterOutput other = (RestockToasterOutput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RestockToasterOutputImpl otherImpl = (RestockToasterOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<RestockToasterOutput>>, Augmentation<RestockToasterOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("RestockToasterOutput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
