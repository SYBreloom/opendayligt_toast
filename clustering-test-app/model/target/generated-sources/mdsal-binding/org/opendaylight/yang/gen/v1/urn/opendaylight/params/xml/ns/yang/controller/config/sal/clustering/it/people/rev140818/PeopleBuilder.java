package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818;
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
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818.people.Person;
import org.opendaylight.yangtools.concepts.Builder;
import org.opendaylight.yangtools.yang.binding.Augmentation;
import org.opendaylight.yangtools.yang.binding.AugmentationHolder;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;

/**
 * Class that builds {@link PeopleBuilder} instances.
 * 
 * @see PeopleBuilder
 *
 */
public class PeopleBuilder implements Builder<People> {

    private List<Person> _person;


    Map<Class<? extends Augmentation<People>>, Augmentation<People>> augmentation = Collections.emptyMap();

    public PeopleBuilder() {
    }

    public PeopleBuilder(People base) {
        this._person = base.getPerson();
        if (base instanceof PeopleImpl) {
            PeopleImpl impl = (PeopleImpl) base;
            if (!impl.augmentation.isEmpty()) {
                this.augmentation = new HashMap<>(impl.augmentation);
            }
        } else if (base instanceof AugmentationHolder) {
            @SuppressWarnings("unchecked")
            Map<Class<? extends Augmentation<People>>, Augmentation<People>> aug =((AugmentationHolder<People>) base).augmentations();
            if (!aug.isEmpty()) {
                this.augmentation = new HashMap<>(aug);
            }
        }
    }


    public List<Person> getPerson() {
        return _person;
    }
    
    @SuppressWarnings("unchecked")
    public <E extends Augmentation<People>> E augmentation(Class<E> augmentationType) {
        return (E) augmentation.get(CodeHelpers.nonNullValue(augmentationType, "augmentationType"));
    }

    public PeopleBuilder setPerson(final List<Person> values) {
        this._person = values;
        return this;
    }
    
    
    public PeopleBuilder addAugmentation(Class<? extends Augmentation<People>> augmentationType, Augmentation<People> augmentationValue) {
        if (augmentationValue == null) {
            return removeAugmentation(augmentationType);
        }
    
        if (!(this.augmentation instanceof HashMap)) {
            this.augmentation = new HashMap<>();
        }
    
        this.augmentation.put(augmentationType, augmentationValue);
        return this;
    }
    
    public PeopleBuilder removeAugmentation(Class<? extends Augmentation<People>> augmentationType) {
        if (this.augmentation instanceof HashMap) {
            this.augmentation.remove(augmentationType);
        }
        return this;
    }

    @Override
    public People build() {
        return new PeopleImpl(this);
    }

    private static final class PeopleImpl implements People {
    
        private final List<Person> _person;
    
        private Map<Class<? extends Augmentation<People>>, Augmentation<People>> augmentation = Collections.emptyMap();
    
        PeopleImpl(PeopleBuilder base) {
            this._person = base.getPerson();
            this.augmentation = ImmutableMap.copyOf(base.augmentation);
        }
    
        @Override
        public Class<People> getImplementedInterface() {
            return People.class;
        }
    
        @Override
        public List<Person> getPerson() {
            return _person;
        }
        
        @SuppressWarnings("unchecked")
        @Override
        public <E extends Augmentation<People>> E augmentation(Class<E> augmentationType) {
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
            result = prime * result + Objects.hashCode(_person);
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
            if (!People.class.equals(((DataObject)obj).getImplementedInterface())) {
                return false;
            }
            People other = (People)obj;
            if (!Objects.equals(_person, other.getPerson())) {
                return false;
            }
            if (getClass() == obj.getClass()) {
                // Simple case: we are comparing against self
                PeopleImpl otherImpl = (PeopleImpl) obj;
                if (!Objects.equals(augmentation, otherImpl.augmentation)) {
                    return false;
                }
            } else {
                // Hard case: compare our augments with presence there...
                for (Map.Entry<Class<? extends Augmentation<People>>, Augmentation<People>> e : augmentation.entrySet()) {
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
            final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper("People");
            CodeHelpers.appendValue(helper, "_person", _person);
            CodeHelpers.appendValue(helper, "augmentation", augmentation.values());
            return helper.toString();
        }
    }
}
