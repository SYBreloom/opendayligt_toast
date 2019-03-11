package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Boolean;
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
 * Class that builds {@link UnsubscribeDtclOutputBuilder} instances.
 * 
 * @see UnsubscribeDtclOutputBuilder
 *
 */
public class UnsubscribeDtclOutputBuilder implements Builder<UnsubscribeDtclOutput> {

    private Boolean _copyMatches;


    Map<Class<? extends Augmentation<UnsubscribeDtclOutput>>, Augmentation<UnsubscribeDtclOutput>> augmentation = Collections.emptyMap();

    public UnsubscribeDtclOutputBuilder() {
    }

    public UnsubscribeDtclOutputBuilder(UnsubscribeDtclOutput base) {
        this._copyMatches = base.isCopyMatches();
        if (base instanceof UnsubscribeDtclOutputImpl) {
            UnsubscribeDtclOutputImpl impl = (UnsubscribeDtclOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<UnsubscribeDtclOutput>>, Augmentation<UnsubscribeDtclOutput>> aug =((AugmentationHolder<UnsubscribeDtclOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public Boolean isCopyMatches() {
        return _copyMatches;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<UnsubscribeDtclOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public UnsubscribeDtclOutputBuilder setCopyMatches(final Boolean value) {
        this._copyMatches = value;
        return this;
    }
    
    public UnsubscribeDtclOutputBuilder addAugmentation(Class<? extends Augmentation<UnsubscribeDtclOutput>> augmentationType, Augmentation<UnsubscribeDtclOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public UnsubscribeDtclOutputBuilder removeAugmentation(Class<? extends Augmentation<UnsubscribeDtclOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public UnsubscribeDtclOutput build() {
        return new UnsubscribeDtclOutputImpl(this);
    }

    private static final class UnsubscribeDtclOutputImpl implements UnsubscribeDtclOutput {
    
        private final Boolean _copyMatches;
    
        private Map<Class<? extends Augmentation<UnsubscribeDtclOutput>>, Augmentation<UnsubscribeDtclOutput>> augmentation = Collections.emptyMap();
    
        UnsubscribeDtclOutputImpl(UnsubscribeDtclOutputBuilder base) {
            this._copyMatches = base.isCopyMatches();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<UnsubscribeDtclOutput> getImplementedInterface() {
            return UnsubscribeDtclOutput.class;
        }
    
        @Override
        public Boolean isCopyMatches() {
            return _copyMatches;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<UnsubscribeDtclOutput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_copyMatches);
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
            if (!UnsubscribeDtclOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            UnsubscribeDtclOutput other = (UnsubscribeDtclOutput)obj;
            if (!Objects.equals(_copyMatches, other.isCopyMatches())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                UnsubscribeDtclOutputImpl otherImpl = (UnsubscribeDtclOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<UnsubscribeDtclOutput>>, Augmentation<UnsubscribeDtclOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("UnsubscribeDtclOutput");
            CodeHelpers.appendValue(helper, "_copyMatches", _copyMatches);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
