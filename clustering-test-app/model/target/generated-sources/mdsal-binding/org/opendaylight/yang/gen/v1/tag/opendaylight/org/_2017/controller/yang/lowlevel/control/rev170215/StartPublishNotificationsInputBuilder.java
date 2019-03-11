package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.control.rev170215;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Long;
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
 * Class that builds {@link StartPublishNotificationsInputBuilder} instances.
 * 
 * @see StartPublishNotificationsInputBuilder
 *
 */
public class StartPublishNotificationsInputBuilder implements Builder<StartPublishNotificationsInput> {

    private String _id;
    private Long _notificationsPerSecond;
    private Long _seconds;


    Map<Class<? extends Augmentation<StartPublishNotificationsInput>>, Augmentation<StartPublishNotificationsInput>> augmentation = Collections.emptyMap();

    public StartPublishNotificationsInputBuilder() {
    }
    public StartPublishNotificationsInputBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping arg) {
        this._id = arg.getId();
    }

    public StartPublishNotificationsInputBuilder(StartPublishNotificationsInput base) {
        this._id = base.getId();
        this._notificationsPerSecond = base.getNotificationsPerSecond();
        this._seconds = base.getSeconds();
        if (base instanceof StartPublishNotificationsInputImpl) {
            StartPublishNotificationsInputImpl impl = (StartPublishNotificationsInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<StartPublishNotificationsInput>>, Augmentation<StartPublishNotificationsInput>> aug =((AugmentationHolder<StartPublishNotificationsInput>) base).augmentations();
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
    
    public Long getNotificationsPerSecond() {
        return _notificationsPerSecond;
    }
    
    public Long getSeconds() {
        return _seconds;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<StartPublishNotificationsInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public StartPublishNotificationsInputBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    private static void checkNotificationsPerSecondRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public StartPublishNotificationsInputBuilder setNotificationsPerSecond(final Long value) {
    if (value != null) {
        checkNotificationsPerSecondRange(value);
        
    }
        this._notificationsPerSecond = value;
        return this;
    }
    private static void checkSecondsRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public StartPublishNotificationsInputBuilder setSeconds(final Long value) {
    if (value != null) {
        checkSecondsRange(value);
        
    }
        this._seconds = value;
        return this;
    }
    
    public StartPublishNotificationsInputBuilder addAugmentation(Class<? extends Augmentation<StartPublishNotificationsInput>> augmentationType, Augmentation<StartPublishNotificationsInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public StartPublishNotificationsInputBuilder removeAugmentation(Class<? extends Augmentation<StartPublishNotificationsInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public StartPublishNotificationsInput build() {
        return new StartPublishNotificationsInputImpl(this);
    }

    private static final class StartPublishNotificationsInputImpl implements StartPublishNotificationsInput {
    
        private final String _id;
        private final Long _notificationsPerSecond;
        private final Long _seconds;
    
        private Map<Class<? extends Augmentation<StartPublishNotificationsInput>>, Augmentation<StartPublishNotificationsInput>> augmentation = Collections.emptyMap();
    
        StartPublishNotificationsInputImpl(StartPublishNotificationsInputBuilder base) {
            this._id = base.getId();
            this._notificationsPerSecond = base.getNotificationsPerSecond();
            this._seconds = base.getSeconds();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<StartPublishNotificationsInput> getImplementedInterface() {
            return StartPublishNotificationsInput.class;
        }
    
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public Long getNotificationsPerSecond() {
            return _notificationsPerSecond;
        }
        
        @Override
        public Long getSeconds() {
            return _seconds;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<StartPublishNotificationsInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_notificationsPerSecond);
            result = prime * result + Objects.hashCode(_seconds);
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
            if (!StartPublishNotificationsInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            StartPublishNotificationsInput other = (StartPublishNotificationsInput)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_notificationsPerSecond, other.getNotificationsPerSecond())) {
                return false;
            }
            if (!Objects.equals(_seconds, other.getSeconds())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                StartPublishNotificationsInputImpl otherImpl = (StartPublishNotificationsInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<StartPublishNotificationsInput>>, Augmentation<StartPublishNotificationsInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("StartPublishNotificationsInput");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_notificationsPerSecond", _notificationsPerSecond);
            CodeHelpers.appendValue(helper, "_seconds", _seconds);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
