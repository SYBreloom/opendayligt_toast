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
 * Class that builds {@link RegisterDefaultConstantInputBuilder} instances.
 * 
 * @see RegisterDefaultConstantInputBuilder
 *
 */
public class RegisterDefaultConstantInputBuilder implements Builder<RegisterDefaultConstantInput> {

    private String _constant;


    Map<Class<? extends Augmentation<RegisterDefaultConstantInput>>, Augmentation<RegisterDefaultConstantInput>> augmentation = Collections.emptyMap();

    public RegisterDefaultConstantInputBuilder() {
    }
    public RegisterDefaultConstantInputBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ConstantGrouping arg) {
        this._constant = arg.getConstant();
    }

    public RegisterDefaultConstantInputBuilder(RegisterDefaultConstantInput base) {
        this._constant = base.getConstant();
        if (base instanceof RegisterDefaultConstantInputImpl) {
            RegisterDefaultConstantInputImpl impl = (RegisterDefaultConstantInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<RegisterDefaultConstantInput>>, Augmentation<RegisterDefaultConstantInput>> aug =((AugmentationHolder<RegisterDefaultConstantInput>) base).augmentations();
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
    public <E extends Augmentation<RegisterDefaultConstantInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public RegisterDefaultConstantInputBuilder setConstant(final String value) {
        this._constant = value;
        return this;
    }
    
    public RegisterDefaultConstantInputBuilder addAugmentation(Class<? extends Augmentation<RegisterDefaultConstantInput>> augmentationType, Augmentation<RegisterDefaultConstantInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RegisterDefaultConstantInputBuilder removeAugmentation(Class<? extends Augmentation<RegisterDefaultConstantInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RegisterDefaultConstantInput build() {
        return new RegisterDefaultConstantInputImpl(this);
    }

    private static final class RegisterDefaultConstantInputImpl implements RegisterDefaultConstantInput {
    
        private final String _constant;
    
        private Map<Class<? extends Augmentation<RegisterDefaultConstantInput>>, Augmentation<RegisterDefaultConstantInput>> augmentation = Collections.emptyMap();
    
        RegisterDefaultConstantInputImpl(RegisterDefaultConstantInputBuilder base) {
            this._constant = base.getConstant();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<RegisterDefaultConstantInput> getImplementedInterface() {
            return RegisterDefaultConstantInput.class;
        }
    
        @Override
        public String getConstant() {
            return _constant;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<RegisterDefaultConstantInput>> E augmentation(Class<E> augmentationType) {
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
            if (!RegisterDefaultConstantInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            RegisterDefaultConstantInput other = (RegisterDefaultConstantInput)obj;
            if (!Objects.equals(_constant, other.getConstant())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RegisterDefaultConstantInputImpl otherImpl = (RegisterDefaultConstantInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<RegisterDefaultConstantInput>>, Augmentation<RegisterDefaultConstantInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("RegisterDefaultConstantInput");
            CodeHelpers.appendValue(helper, "_constant", _constant);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
