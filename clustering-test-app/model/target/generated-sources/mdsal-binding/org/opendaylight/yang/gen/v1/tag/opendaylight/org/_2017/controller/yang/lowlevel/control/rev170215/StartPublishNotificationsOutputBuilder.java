package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
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
 * Class that builds {@link StartPublishNotificationsOutputBuilder} instances.
 * 
 * @see StartPublishNotificationsOutputBuilder
 *
 */
public class StartPublishNotificationsOutputBuilder implements Builder<StartPublishNotificationsOutput> {



    Map<Class<? extends Augmentation<StartPublishNotificationsOutput>>, Augmentation<StartPublishNotificationsOutput>> augmentation = Collections.emptyMap();

    public StartPublishNotificationsOutputBuilder() {
    }

    public StartPublishNotificationsOutputBuilder(StartPublishNotificationsOutput base) {
        if (base instanceof StartPublishNotificationsOutputImpl) {
            StartPublishNotificationsOutputImpl impl = (StartPublishNotificationsOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<StartPublishNotificationsOutput>>, Augmentation<StartPublishNotificationsOutput>> aug =((AugmentationHolder<StartPublishNotificationsOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<StartPublishNotificationsOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public StartPublishNotificationsOutputBuilder addAugmentation(Class<? extends Augmentation<StartPublishNotificationsOutput>> augmentationType, Augmentation<StartPublishNotificationsOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public StartPublishNotificationsOutputBuilder removeAugmentation(Class<? extends Augmentation<StartPublishNotificationsOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public StartPublishNotificationsOutput build() {
        return new StartPublishNotificationsOutputImpl(this);
    }

    private static final class StartPublishNotificationsOutputImpl implements StartPublishNotificationsOutput {
    
    
        private Map<Class<? extends Augmentation<StartPublishNotificationsOutput>>, Augmentation<StartPublishNotificationsOutput>> augmentation = Collections.emptyMap();
    
        StartPublishNotificationsOutputImpl(StartPublishNotificationsOutputBuilder base) {
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<StartPublishNotificationsOutput> getImplementedInterface() {
            return StartPublishNotificationsOutput.class;
        }
    
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<StartPublishNotificationsOutput>> E augmentation(Class<E> augmentationType) {
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
            if (!StartPublishNotificationsOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            StartPublishNotificationsOutput other = (StartPublishNotificationsOutput)obj;
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StartPublishNotificationsOutputImpl otherImpl = (StartPublishNotificationsOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<StartPublishNotificationsOutput>>, Augmentation<StartPublishNotificationsOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("StartPublishNotificationsOutput");
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
