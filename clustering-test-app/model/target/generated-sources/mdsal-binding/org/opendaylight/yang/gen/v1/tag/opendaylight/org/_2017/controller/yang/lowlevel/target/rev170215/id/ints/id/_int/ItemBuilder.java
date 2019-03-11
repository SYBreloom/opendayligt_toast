package org.opendaylight.yang.gen.v1.tag.opendaylight.org._2017.controller.yang.lowlevel.target.rev170215.id.ints.id._int;
import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableMap;
import java.lang.Class;
import java.lang.Integer;
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
 * Class that builds {@link ItemBuilder} instances.
 * 
 * @see ItemBuilder
 *
 */
public class ItemBuilder implements Builder<Item> {

    private Integer _number;
    private ItemKey key;


    Map<Class<? extends Augmentation<Item>>, Augmentation<Item>> augmentation = Collections.emptyMap();

    public ItemBuilder() {
    }

    public ItemBuilder(Item base) {
        this.key = base.key();
        this._number = base.getNumber();
        if (base instanceof ItemImpl) {
            ItemImpl impl = (ItemImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<Item>>, Augmentation<Item>> aug =((AugmentationHolder<Item>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public ItemKey key() {
        return key;
    }
    
    public Integer getNumber() {
        return _number;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<Item>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public ItemBuilder withKey(final ItemKey key) {
        this.key = key;
        return this;
    }
    
    public ItemBuilder setNumber(final Integer value) {
        this._number = value;
        return this;
    }
    
    public ItemBuilder addAugmentation(Class<? extends Augmentation<Item>> augmentationType, Augmentation<Item> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ItemBuilder removeAugmentation(Class<? extends Augmentation<Item>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public Item build() {
        return new ItemImpl(this);
    }

    private static final class ItemImpl implements Item {
    
        private final Integer _number;
        private final ItemKey key;
    
        private Map<Class<? extends Augmentation<Item>>, Augmentation<Item>> augmentation = Collections.emptyMap();
    
        ItemImpl(ItemBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new ItemKey(base.getNumber());
            }
            this._number = key.getNumber();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<Item> getImplementedInterface() {
            return Item.class;
        }
    
        @Override
        public ItemKey key() {
            return key;
        }
        
        @Override
        public Integer getNumber() {
            return _number;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<Item>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_number);
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
            if (!Item.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            Item other = (Item)obj;
            if (!Objects.equals(_number, other.getNumber())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ItemImpl otherImpl = (ItemImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<Item>>, Augmentation<Item>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("Item");
            CodeHelpers.appendValue(helper, "_number", _number);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
