package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.toaster.app.config.rev160503;
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
import org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.DisplayString;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link ToasterAppConfigBuilder} instances.
 * 
 * @see ToasterAppConfigBuilder
 *
 */
public class ToasterAppConfigBuilder implements Builder<ToasterAppConfig> {

    private DisplayString _manufacturer;
    private Integer _maxMakeToastTries;
    private DisplayString _modelNumber;


    Map<Class<? extends Augmentation<ToasterAppConfig>>, Augmentation<ToasterAppConfig>> augmentation = Collections.emptyMap();

    public ToasterAppConfigBuilder() {
    }

    public ToasterAppConfigBuilder(ToasterAppConfig base) {
        this._manufacturer = base.getManufacturer();
        this._maxMakeToastTries = base.getMaxMakeToastTries();
        this._modelNumber = base.getModelNumber();
        if (base instanceof ToasterAppConfigImpl) {
            ToasterAppConfigImpl impl = (ToasterAppConfigImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<ToasterAppConfig>>, Augmentation<ToasterAppConfig>> aug =((AugmentationHolder<ToasterAppConfig>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public DisplayString getManufacturer() {
        return _manufacturer;
    }
    
    public Integer getMaxMakeToastTries() {
        return _maxMakeToastTries;
    }
    
    public DisplayString getModelNumber() {
        return _modelNumber;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<ToasterAppConfig>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public ToasterAppConfigBuilder setManufacturer(final DisplayString value) {
        this._manufacturer = value;
        return this;
    }
    private static void checkMaxMakeToastTriesRange(final int value) {
        if (value >= 0 && value <= 65535) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..65535]]", value);
    }
    
    public ToasterAppConfigBuilder setMaxMakeToastTries(final Integer value) {
    if (value != null) {
        checkMaxMakeToastTriesRange(value);
        
    }
        this._maxMakeToastTries = value;
        return this;
    }
    
    public ToasterAppConfigBuilder setModelNumber(final DisplayString value) {
        this._modelNumber = value;
        return this;
    }
    
    public ToasterAppConfigBuilder addAugmentation(Class<? extends Augmentation<ToasterAppConfig>> augmentationType, Augmentation<ToasterAppConfig> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public ToasterAppConfigBuilder removeAugmentation(Class<? extends Augmentation<ToasterAppConfig>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public ToasterAppConfig build() {
        return new ToasterAppConfigImpl(this);
    }

    private static final class ToasterAppConfigImpl implements ToasterAppConfig {
    
        private final DisplayString _manufacturer;
        private final Integer _maxMakeToastTries;
        private final DisplayString _modelNumber;
    
        private Map<Class<? extends Augmentation<ToasterAppConfig>>, Augmentation<ToasterAppConfig>> augmentation = Collections.emptyMap();
    
        ToasterAppConfigImpl(ToasterAppConfigBuilder base) {
            this._manufacturer = base.getManufacturer();
            this._maxMakeToastTries = base.getMaxMakeToastTries();
            this._modelNumber = base.getModelNumber();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<ToasterAppConfig> getImplementedInterface() {
            return ToasterAppConfig.class;
        }
    
        @Override
        public DisplayString getManufacturer() {
            return _manufacturer;
        }
        
        @Override
        public Integer getMaxMakeToastTries() {
            return _maxMakeToastTries;
        }
        
        @Override
        public DisplayString getModelNumber() {
            return _modelNumber;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<ToasterAppConfig>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_manufacturer);
            result = prime * result + Objects.hashCode(_maxMakeToastTries);
            result = prime * result + Objects.hashCode(_modelNumber);
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
            if (!ToasterAppConfig.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            ToasterAppConfig other = (ToasterAppConfig)obj;
            if (!Objects.equals(_manufacturer, other.getManufacturer())) {
                return false;
            }
            if (!Objects.equals(_maxMakeToastTries, other.getMaxMakeToastTries())) {
                return false;
            }
            if (!Objects.equals(_modelNumber, other.getModelNumber())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                ToasterAppConfigImpl otherImpl = (ToasterAppConfigImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<ToasterAppConfig>>, Augmentation<ToasterAppConfig>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("ToasterAppConfig");
            CodeHelpers.appendValue(helper, "_manufacturer", _manufacturer);
            CodeHelpers.appendValue(helper, "_maxMakeToastTries", _maxMakeToastTries);
            CodeHelpers.appendValue(helper, "_modelNumber", _modelNumber);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
