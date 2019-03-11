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
 * Class that builds {@link RegisterConstantInputBuilder} instances.
 * 
 * @see RegisterConstantInputBuilder
 *
 */
public class RegisterConstantInputBuilder implements Builder<RegisterConstantInput> {

    private String _constant;


    Map<Class<? extends Augmentation<RegisterConstantInput>>, Augmentation<RegisterConstantInput>> augmentation = Collections.emptyMap();

    public RegisterConstantInputBuilder() {
    }
    public RegisterConstantInputBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ConstantGrouping arg) {
        this._constant = arg.getConstant();
    }

    public RegisterConstantInputBuilder(RegisterConstantInput base) {
        this._constant = base.getConstant();
        if (base instanceof RegisterConstantInputImpl) {
            RegisterConstantInputImpl impl = (RegisterConstantInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<RegisterConstantInput>>, Augmentation<RegisterConstantInput>> aug =((AugmentationHolder<RegisterConstantInput>) base).augmentations();
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
    public <E extends Augmentation<RegisterConstantInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public RegisterConstantInputBuilder setConstant(final String value) {
        this._constant = value;
        return this;
    }
    
    public RegisterConstantInputBuilder addAugmentation(Class<? extends Augmentation<RegisterConstantInput>> augmentationType, Augmentation<RegisterConstantInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public RegisterConstantInputBuilder removeAugmentation(Class<? extends Augmentation<RegisterConstantInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public RegisterConstantInput build() {
        return new RegisterConstantInputImpl(this);
    }

    private static final class RegisterConstantInputImpl implements RegisterConstantInput {
    
        private final String _constant;
    
        private Map<Class<? extends Augmentation<RegisterConstantInput>>, Augmentation<RegisterConstantInput>> augmentation = Collections.emptyMap();
    
        RegisterConstantInputImpl(RegisterConstantInputBuilder base) {
            this._constant = base.getConstant();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<RegisterConstantInput> getImplementedInterface() {
            return RegisterConstantInput.class;
        }
    
        @Override
        public String getConstant() {
            return _constant;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<RegisterConstantInput>> E augmentation(Class<E> augmentationType) {
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
            if (!RegisterConstantInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            RegisterConstantInput other = (RegisterConstantInput)obj;
            if (!Objects.equals(_constant, other.getConstant())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                RegisterConstantInputImpl otherImpl = (RegisterConstantInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<RegisterConstantInput>>, Augmentation<RegisterConstantInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("RegisterConstantInput");
            CodeHelpers.appendValue(helper, "_constant", _constant);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
