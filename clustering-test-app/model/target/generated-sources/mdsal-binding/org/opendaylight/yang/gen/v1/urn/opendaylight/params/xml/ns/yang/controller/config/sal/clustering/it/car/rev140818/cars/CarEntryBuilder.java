package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.cars;
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
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarId;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link CarEntryBuilder} instances.
 * 
 * @see CarEntryBuilder
 *
 */
public class CarEntryBuilder implements Builder<CarEntry> {

    private String _category;
    private CarId _id;
    private String _manufacturer;
    private String _model;
    private Long _year;
    private CarEntryKey key;


    Map<Class<? extends Augmentation<CarEntry>>, Augmentation<CarEntry>> augmentation = Collections.emptyMap();

    public CarEntryBuilder() {
    }
    public CarEntryBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarEntry arg) {
        this._id = arg.getId();
        this._model = arg.getModel();
        this._manufacturer = arg.getManufacturer();
        this._year = arg.getYear();
        this._category = arg.getCategory();
    }

    public CarEntryBuilder(CarEntry base) {
        this.key = base.key();
        this._id = base.getId();
        this._category = base.getCategory();
        this._manufacturer = base.getManufacturer();
        this._model = base.getModel();
        this._year = base.getYear();
        if (base instanceof CarEntryImpl) {
            CarEntryImpl impl = (CarEntryImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<CarEntry>>, Augmentation<CarEntry>> aug =((AugmentationHolder<CarEntry>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarEntry</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarEntry) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarEntry)arg).getId();
            this._model = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarEntry)arg).getModel();
            this._manufacturer = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarEntry)arg).getManufacturer();
            this._year = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarEntry)arg).getYear();
            this._category = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarEntry)arg).getCategory();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.car.rev140818.CarEntry]");
    }

    public CarEntryKey key() {
        return key;
    }
    
    public String getCategory() {
        return _category;
    }
    
    public CarId getId() {
        return _id;
    }
    
    public String getManufacturer() {
        return _manufacturer;
    }
    
    public String getModel() {
        return _model;
    }
    
    public Long getYear() {
        return _year;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<CarEntry>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public CarEntryBuilder withKey(final CarEntryKey key) {
        this.key = key;
        return this;
    }
    
    public CarEntryBuilder setCategory(final String value) {
        this._category = value;
        return this;
    }
    
    public CarEntryBuilder setId(final CarId value) {
        this._id = value;
        return this;
    }
    
    public CarEntryBuilder setManufacturer(final String value) {
        this._manufacturer = value;
        return this;
    }
    
    public CarEntryBuilder setModel(final String value) {
        this._model = value;
        return this;
    }
    private static void checkYearRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public CarEntryBuilder setYear(final Long value) {
    if (value != null) {
        checkYearRange(value);
        
    }
        this._year = value;
        return this;
    }
    
    public CarEntryBuilder addAugmentation(Class<? extends Augmentation<CarEntry>> augmentationType, Augmentation<CarEntry> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public CarEntryBuilder removeAugmentation(Class<? extends Augmentation<CarEntry>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public CarEntry build() {
        return new CarEntryImpl(this);
    }

    private static final class CarEntryImpl implements CarEntry {
    
        private final String _category;
        private final CarId _id;
        private final String _manufacturer;
        private final String _model;
        private final Long _year;
        private final CarEntryKey key;
    
        private Map<Class<? extends Augmentation<CarEntry>>, Augmentation<CarEntry>> augmentation = Collections.emptyMap();
    
        CarEntryImpl(CarEntryBuilder base) {
            if (base.key() != null) {
                this.key = base.key();
            } else {
                this.key = new CarEntryKey(base.getId());
            }
            this._id = key.getId();
            this._category = base.getCategory();
            this._manufacturer = base.getManufacturer();
            this._model = base.getModel();
            this._year = base.getYear();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<CarEntry> getImplementedInterface() {
            return CarEntry.class;
        }
    
        @Override
        public CarEntryKey key() {
            return key;
        }
        
        @Override
        public String getCategory() {
            return _category;
        }
        
        @Override
        public CarId getId() {
            return _id;
        }
        
        @Override
        public String getManufacturer() {
            return _manufacturer;
        }
        
        @Override
        public String getModel() {
            return _model;
        }
        
        @Override
        public Long getYear() {
            return _year;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<CarEntry>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_category);
            result = prime * result + Objects.hashCode(_id);
            result = prime * result + Objects.hashCode(_manufacturer);
            result = prime * result + Objects.hashCode(_model);
            result = prime * result + Objects.hashCode(_year);
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
            if (!CarEntry.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            CarEntry other = (CarEntry)obj;
            if (!Objects.equals(_category, other.getCategory())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (!Objects.equals(_manufacturer, other.getManufacturer())) {
                return false;
            }
            if (!Objects.equals(_model, other.getModel())) {
                return false;
            }
            if (!Objects.equals(_year, other.getYear())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                CarEntryImpl otherImpl = (CarEntryImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<CarEntry>>, Augmentation<CarEntry>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("CarEntry");
            CodeHelpers.appendValue(helper, "_category", _category);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "_manufacturer", _manufacturer);
            CodeHelpers.appendValue(helper, "_model", _model);
            CodeHelpers.appendValue(helper, "_year", _year);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
