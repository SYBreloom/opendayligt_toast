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
 * Class that builds {@link ToasterOutOfBreadBuilder} instances.
 * 
 * @see ToasterOutOfBreadBuilder
 *
 */
public class ToasterOutOfBreadBuilder implements Builder<ToasterOutOfBread> {



    Map<Class<? extends Augmentation<ToasterOutOfBread>>, Augmentation<ToasterOutOfBread>> augmentation = Collections.emptyMap();

    public ToasterOutOfBreadBuilder() {
    }

    public ToasterOutOfBreadBuilder(ToasterOutOfBread base) {
        if (base instanceof ToasterOutOfBreadImpl) {
            ToasterOutOfBreadImpl impl = (ToasterOutOfBreadImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ToasterOutOfBread>>, Augmentation<ToasterOutOfBread>> aug =((AugmentationHolder<ToasterOutOfBread>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ToasterOutOfBread>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ToasterOutOfBreadBuilder addAugmentation(Class<? extends Augmentation<ToasterOutOfBread>> augmentationType, Augmentation<ToasterOutOfBread> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ToasterOutOfBreadBuilder removeAugmentation(Class<? extends Augmentation<ToasterOutOfBread>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ToasterOutOfBread build() {
        return new ToasterOutOfBreadImpl(this);
    }

    private static final class ToasterOutOfBreadImpl implements ToasterOutOfBread {
    
    
        private Map<Class<? extends Augmentation<ToasterOutOfBread>>, Augmentation<ToasterOutOfBread>> augmentation = Collections.emptyMap();
    
        ToasterOutOfBreadImpl(ToasterOutOfBreadBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ToasterOutOfBread> getImplementedInterface() {
            return ToasterOutOfBread.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ToasterOutOfBread>> E augmentation(Class<E> augmentationType) {
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
            if (!ToasterOutOfBread.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ToasterOutOfBread other = (ToasterOutOfBread)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ToasterOutOfBreadImpl otherImpl = (ToasterOutOfBreadImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ToasterOutOfBread>>, Augmentation<ToasterOutOfBread>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ToasterOutOfBread");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
