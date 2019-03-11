package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int.Item;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link IdIntBuilder} instances.
 * 
 * @see IdIntBuilder
 *
 */
public class IdIntBuilder implements Builder<IdInt> {

    private String _id;
    private List<Item> _item;
    private IdIntKey key;


    Map<Class<? extends Augmentation<IdInt>>, Augmentation<IdInt>> augmentation = Collections.emptyMap();

    public IdIntBuilder() {
    }
    public IdIntBuilder(org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.common.rev170215.IdGrouping arg) {
        this._id = arg.getId();
    }

    public IdIntBuilder(IdInt base) {
        this.key = base.key();
        this._id = base.getId();
        this._item = base.getItem();
        if (base instanceof IdIntImpl) {
            IdIntImpl impl = (IdIntImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<IdInt>>, Augmentation<IdInt>> aug =((AugmentationHolder<IdInt>) base).augmentations();
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

    public IdIntKey key() {
        return key;
    }
    
    public String getId() {
        return _id;
    }
    
    public List<Item> getItem() {
        return _item;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<IdInt>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public IdIntBuilder withKey(final IdIntKey key) {
        this.key = key;
        return this;
    }
    
    public IdIntBuilder setId(final String value) {
        this._id = value;
        return this;
    }
    public IdIntBuilder setItem(final List<Item> values) {
        this._item = values;
        return this;
    }
    
    
    public IdIntBuilder addAugmentation(Class<? extends Augmentation<IdInt>> augmentationType, Augmentation<IdInt> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public IdIntBuilder removeAugmentation(Class<? extends Augmentation<IdInt>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public IdInt build() {
        return new IdIntImpl(this);
    }

    private static final class IdIntImpl implements IdInt {
    
        private final String _id;
        private final List<Item> _item;
        private final IdIntKey key;
    
        private Map<Class<? extends Augmentation<IdInt>>, Augmentation<IdInt>> augmentation = Collections.emptyMap();
    
        IdIntImpl(IdIntBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new IdIntKey(base.getId());
            }
            this._id = key.getId();
            this._item = base.getItem();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<IdInt> getImplementedInterface() {
            return IdInt.class;
        }
    
        @Override
        public IdIntKey key() {
            return key;
        }
        
        @Override
        public String getId() {
            return _id;
        }
        
        @Override
        public List<Item> getItem() {
            return _item;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<IdInt>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_item);
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
            if (!IdInt.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            IdInt other = (IdInt)obj;
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_item, other.getItem())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                IdIntImpl otherImpl = (IdIntImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<IdInt>>, Augmentation<IdInt>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("IdInt");
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_item", _item);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
