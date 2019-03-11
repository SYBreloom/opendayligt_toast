package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818;
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
 * Class that builds {@link AddPersonInputBuilder} instances.
 * 
 * @see AddPersonInputBuilder
 *
 */
public class AddPersonInputBuilder implements Builder<AddPersonInput> {

    private String _address;
    private Long _age;
    private String _contactNo;
    private String _gender;
    private PersonId _id;


    Map<Class<? extends Augmentation<AddPersonInput>>, Augmentation<AddPersonInput>> augmentation = Collections.emptyMap();

    public AddPersonInputBuilder() {
    }
    public AddPersonInputBuilder(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.Person arg) {
        this._id = arg.getId();
        this._gender = arg.getGender();
        this._age = arg.getAge();
        this._address = arg.getAddress();
        this._contactNo = arg.getContactNo();
    }

    public AddPersonInputBuilder(AddPersonInput base) {
        this._address = base.getAddress();
        this._age = base.getAge();
        this._contactNo = base.getContactNo();
        this._gender = base.getGender();
        this._id = base.getId();
        if (base instanceof AddPersonInputImpl) {
            AddPersonInputImpl impl = (AddPersonInputImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<AddPersonInput>>, Augmentation<AddPersonInput>> aug =((AugmentationHolder<AddPersonInput>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }

    /**
     * Set fields from given grouping argument. Valid argument is instance of one of following types:
     * <ul>
     * <li>org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.Person</li>
     * </ul>
     *
     * @param arg grouping object
     * @throws IllegalArgumentException if given argument is none of valid types
    */
    public void fieldsFrom(DataObject arg) {
        boolean isValidArg = false;
        if (arg instanceof org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.Person) {
            this._id = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.Person)arg).getId();
            this._gender = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.Person)arg).getGender();
            this._age = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.Person)arg).getAge();
            this._address = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.Person)arg).getAddress();
            this._contactNo = ((org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.Person)arg).getContactNo();
            isValidArg = true;
        }
        CodeHelpers.validValue(isValidArg, arg, "[org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.Person]");
    }

    public String getAddress() {
        return _address;
    }
    
    public Long getAge() {
        return _age;
    }
    
    public String getContactNo() {
        return _contactNo;
    }
    
    public String getGender() {
        return _gender;
    }
    
    public PersonId getId() {
        return _id;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<AddPersonInput>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    
    public AddPersonInputBuilder setAddress(final String value) {
        this._address = value;
        return this;
    }
    private static void checkAgeRange(final long value) {
        if (value >= 0L && value <= 4294967295L) {
            return;
        }
        CodeHelpers.throwInvalidRange("[[0..4294967295]]", value);
    }
    
    public AddPersonInputBuilder setAge(final Long value) {
    if (value != null) {
        checkAgeRange(value);
        
    }
        this._age = value;
        return this;
    }
    
    public AddPersonInputBuilder setContactNo(final String value) {
        this._contactNo = value;
        return this;
    }
    
    public AddPersonInputBuilder setGender(final String value) {
        this._gender = value;
        return this;
    }
    
    public AddPersonInputBuilder setId(final PersonId value) {
        this._id = value;
        return this;
    }
    
    public AddPersonInputBuilder addAugmentation(Class<? extends Augmentation<AddPersonInput>> augmentationType, Augmentation<AddPersonInput> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public AddPersonInputBuilder removeAugmentation(Class<? extends Augmentation<AddPersonInput>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public AddPersonInput build() {
        return new AddPersonInputImpl(this);
    }

    private static final class AddPersonInputImpl implements AddPersonInput {
    
        private final String _address;
        private final Long _age;
        private final String _contactNo;
        private final String _gender;
        private final PersonId _id;
    
        private Map<Class<? extends Augmentation<AddPersonInput>>, Augmentation<AddPersonInput>> augmentation = Collections.emptyMap();
    
        AddPersonInputImpl(AddPersonInputBuilder base) {
            this._address = base.getAddress();
            this._age = base.getAge();
            this._contactNo = base.getContactNo();
            this._gender = base.getGender();
            this._id = base.getId();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<AddPersonInput> getImplementedInterface() {
            return AddPersonInput.class;
        }
    
        @Override
        public String getAddress() {
            return _address;
        }
        
        @Override
        public Long getAge() {
            return _age;
        }
        
        @Override
        public String getContactNo() {
            return _contactNo;
        }
        
        @Override
        public String getGender() {
            return _gender;
        }
        
        @Override
        public PersonId getId() {
            return _id;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<AddPersonInput>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_address);
            result = prime * result + Objects.hashCode(_age);
            result = prime * result + Objects.hashCode(_contactNo);
            result = prime * result + Objects.hashCode(_gender);
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
            if (!AddPersonInput.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            AddPersonInput other = (AddPersonInput)obj;
            if (!Objects.equals(_address, other.getAddress())) {
                return false;
            }
            if (!Objects.equals(_age, other.getAge())) {
                return false;
            }
            if (!Objects.equals(_contactNo, other.getContactNo())) {
                return false;
            }
            if (!Objects.equals(_gender, other.getGender())) {
                return false;
            }
            if (!Objects.equals(_id, other.getId())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                AddPersonInputImpl otherImpl = (AddPersonInputImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<AddPersonInput>>, Augmentation<AddPersonInput>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("AddPersonInput");
            CodeHelpers.appendValue(helper, "_address", _address);
            CodeHelpers.appendValue(helper, "_age", _age);
            CodeHelpers.appendValue(helper, "_contactNo", _contactNo);
            CodeHelpers.appendValue(helper, "_gender", _gender);
            CodeHelpers.appendValue(helper, "_id", _id);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
