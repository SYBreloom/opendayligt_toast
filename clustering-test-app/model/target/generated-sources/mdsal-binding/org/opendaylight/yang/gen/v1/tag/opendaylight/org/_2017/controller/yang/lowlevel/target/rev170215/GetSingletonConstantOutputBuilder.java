package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215;
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
 * Class that builds {@link GetSingletonConstantOutputBuilder} instances.
 * 
 * @see GetSingletonConstantOutputBuilder
 *
 */
public class GetSingletonConstantOutputBuilder implements Builder<GetSingletonConstantOutput> {

    private String _constant;


    Map<Class<? extends Augmentation<GetSingletonConstantOutput>>, Augmentation<GetSingletonConstantOutput>> augmentation = Collections.emptyMap();

    public GetSingletonConstantOutputBuilder() {
    }
    public GetSingletonConstantOutputBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ConstantGrouping arg) {
        this._constant = arg.getConstant();
    }

    public GetSingletonConstantOutputBuilder(GetSingletonConstantOutput base) {
        this._constant = base.getConstant();
        if (base instanceof GetSingletonConstantOutputImpl) {
            GetSingletonConstantOutputImpl impl = (GetSingletonConstantOutputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<GetSingletonConstantOutput>>, Augmentation<GetSingletonConstantOutput>> aug =((AugmentationHolder<GetSingletonConstantOutput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ConstantGrouping</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ConstantGrouping) {
            this._constant = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ConstantGrouping)arg).getConstant();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ConstantGrouping]");
    }

    public String getConstant() {
        return _constant;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<GetSingletonConstantOutput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public GetSingletonConstantOutputBuilder setConstant(final String value) {
        this._constant = value;
        return this;
    }
    
    public GetSingletonConstantOutputBuilder addAugmentation(Class<? extends Augmentation<GetSingletonConstantOutput>> augmentationType, Augmentation<GetSingletonConstantOutput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GetSingletonConstantOutputBuilder removeAugmentation(Class<? extends Augmentation<GetSingletonConstantOutput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetSingletonConstantOutput build() {
        return new GetSingletonConstantOutputImpl(this);
    }

    private static final class GetSingletonConstantOutputImpl implements GetSingletonConstantOutput {
    
        private final String _constant;
    
        private Map<Class<? extends Augmentation<GetSingletonConstantOutput>>, Augmentation<GetSingletonConstantOutput>> augmentation = Collections.emptyMap();
    
        GetSingletonConstantOutputImpl(GetSingletonConstantOutputBuilder base) {
            this._constant = base.getConstant();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<GetSingletonConstantOutput> getImplementedInterface() {
            return GetSingletonConstantOutput.class;
        }
    
        @Override
        public String getConstant() {
            return _constant;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<GetSingletonConstantOutput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_constant);
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
            if (!GetSingletonConstantOutput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            GetSingletonConstantOutput other = (GetSingletonConstantOutput)obj;
            if (!Objects.equals(_constant, other.getConstant())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetSingletonConstantOutputImpl otherImpl = (GetSingletonConstantOutputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<GetSingletonConstantOutput>>, Augmentation<GetSingletonConstantOutput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("GetSingletonConstantOutput");
            CodeHelpers.appendValue(helper, "_constant", _constant);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
