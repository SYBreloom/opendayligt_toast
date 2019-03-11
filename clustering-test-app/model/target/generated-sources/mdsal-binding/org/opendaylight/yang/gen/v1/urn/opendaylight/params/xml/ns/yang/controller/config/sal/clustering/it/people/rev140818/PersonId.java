package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.sal.clustering.it.people.rev140818;
import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.inet.types.rev130715.Uri;

public class PersonId extends Uri
 implements Serializable {
    private static final long serialVersionUID = 4810666446198959419L;


    @ConstructorProperties("value")
    public PersonId(String _value) {
        super(_value);
    
        Objects.requireNonNull(_value, "Supplied value may not be null");
    
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public PersonId(PersonId source) {
        super(source);
    }
    /**
     * Creates a new instance from Uri
     *
     * @param source Source object
     */
    public PersonId(Uri source) {
        super(source);
    }

    public static PersonId getDefaultInstance(String defaultValue) {
        return new PersonId(defaultValue);
    }





}

