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
import org.opendaylight.yangtools.yang.binding.InstanceIdentifier;

/**
 * Class that builds {@link GetContextedConstantInputBuilder} instances.
 * 
 * @see GetContextedConstantInputBuilder
 *
 */
public class GetContextedConstantInputBuilder implements Builder<GetContextedConstantInput> {

    private InstanceIdentifier<?> _context;


    Map<Class<? extends Augmentation<GetContextedConstantInput>>, Augmentation<GetContextedConstantInput>> augmentation = Collections.emptyMap();

    public GetContextedConstantInputBuilder() {
    }
    public GetContextedConstantInputBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ContextGrouping arg) {
        this._context = arg.getContext();
    }

    public GetContextedConstantInputBuilder(GetContextedConstantInput base) {
        this._context = base.getContext();
        if (base instanceof GetContextedConstantInputImpl) {
            GetContextedConstantInputImpl impl = (GetContextedConstantInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<GetContextedConstantInput>>, Augmentation<GetContextedConstantInput>> aug =((AugmentationHolder<GetContextedConstantInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ContextGrouping</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ContextGrouping) {
            this._context = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ContextGrouping)arg).getContext();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.ContextGrouping]");
    }

    public InstanceIdentifier<?> getContext() {
        return _context;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<GetContextedConstantInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public GetContextedConstantInputBuilder setContext(final InstanceIdentifier<?> value) {
        this._context = value;
        return this;
    }
    
    public GetContextedConstantInputBuilder addAugmentation(Class<? extends Augmentation<GetContextedConstantInput>> augmentationType, Augmentation<GetContextedConstantInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public GetContextedConstantInputBuilder removeAugmentation(Class<? extends Augmentation<GetContextedConstantInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public GetContextedConstantInput build() {
        return new GetContextedConstantInputImpl(this);
    }

    private static final class GetContextedConstantInputImpl implements GetContextedConstantInput {
    
        private final InstanceIdentifier<?> _context;
    
        private Map<Class<? extends Augmentation<GetContextedConstantInput>>, Augmentation<GetContextedConstantInput>> augmentation = Collections.emptyMap();
    
        GetContextedConstantInputImpl(GetContextedConstantInputBuilder base) {
            this._context = base.getContext();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<GetContextedConstantInput> getImplementedInterface() {
            return GetContextedConstantInput.class;
        }
    
        @Override
        public InstanceIdentifier<?> getContext() {
            return _context;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<GetContextedConstantInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_context);
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
            if (!GetContextedConstantInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            GetContextedConstantInput other = (GetContextedConstantInput)obj;
            if (!Objects.equals(_context, other.getContext())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                GetContextedConstantInputImpl otherImpl = (GetContextedConstantInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<GetContextedConstantInput>>, Augmentation<GetContextedConstantInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("GetContextedConstantInput");
            CodeHelpers.appendValue(helper, "_context", _context);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
