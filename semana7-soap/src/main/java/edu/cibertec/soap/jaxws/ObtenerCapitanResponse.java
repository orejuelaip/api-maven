
package edu.cibertec.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import edu.cibertec.bean.JugadordDTO;

@XmlRootElement(name = "obtenerCapitanResponse", namespace = "http://soap.cibertec.edu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerCapitanResponse", namespace = "http://soap.cibertec.edu/")
public class ObtenerCapitanResponse {

    @XmlElement(name = "return", namespace = "")
    private JugadordDTO _return;

    /**
     * 
     * @return
     *     returns JugadordDTO
     */
    public JugadordDTO getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(JugadordDTO _return) {
        this._return = _return;
    }

}
