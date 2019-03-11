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
 * Class that builds {@link CheckPublishNotificationsInputBuilder} instances.
 * 
 * @see CheckPublishNotificationsInputBuilder
 *
 */
public class CheckPublishNotificationsInputBuilder implements Builder<CheckPublishNotificationsInput> {

    private String _id;


    Map<Class<? extends Augmentation<CheckPublishNotificationsInput>>, Augmentation<CheckPublishNotificationsInput>> augmentation = Collections.emptyMap();

    public CheckPublishNotificationsInputBuilder() {
    }
    public CheckPublishNotificationsInputBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping arg) {
        this._id = arg.getId();
    }

    public CheckPublishNotificationsInputBuilder(CheckPublishNotificationsInput base) {
        this._id = base.getId();
        if (base instanceof CheckPublishNotificationsInputImpl) {
            CheckPublishNotificationsInputImpl impl = (CheckPublishNotificationsInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CheckPublishNotificationsInput>>, Augmentation<CheckPublishNotificationsInput>> aug =((AugmentationHolder<CheckPublishNotificationsInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping) {
            this._id = ((org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping)arg).getId();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping]");
    }

    public String getId() {
        return _id;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CheckPublishNotificationsInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public CheckPublishNotificationsInputBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    
    public CheckPublishNotificationsInputBuilder addAugmentation(Class<? extends Augmentation<CheckPublishNotificationsInput>> augmentationType, Augmentation<CheckPublishNotificationsInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CheckPublishNotificationsInputBuilder removeAugmentation(Class<? extends Augmentation<CheckPublishNotificationsInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CheckPublishNotificationsInput build() {
        return new CheckPublishNotificationsInputImpl(this);
    }

    private static final class CheckPublishNotificationsInputImpl implements CheckPublishNotificationsInput {
    
        private final String _id;
    
        private Map<Class<? extends Augmentation<CheckPublishNotificationsInput>>, Augmentation<CheckPublishNotificationsInput>> augmentation = Collections.emptyMap();
    
        CheckPublishNotificationsInputImpl(CheckPublishNotificationsInputBuilder base) {
            this._id = base.getId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CheckPublishNotificationsInput> getImplementedInterface() {
            return CheckPublishNotificationsInput.class;
        }
    
        @Override
        public String getId() {
            return _id;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CheckPublishNotificationsInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_id);
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
            if (!CheckPublishNotificationsInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CheckPublishNotificationsInput other = (CheckPublishNotificationsInput)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CheckPublishNotificationsInputImpl otherImpl = (CheckPublishNotificationsInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CheckPublishNotificationsInput>>, Augmentation<CheckPublishNotificationsInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CheckPublishNotificationsInput");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
