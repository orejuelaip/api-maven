
package edu.cibertec.soap.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import edu.cibertec.bean.JugadordDTO;

@XmlRootElement(name = "obtenerListaConvocadosResponse", namespace = "http://soap.cibertec.edu/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerListaConvocadosResponse", namespace = "http://soap.cibertec.edu/")
public class ObtenerListaConvocadosResponse {

    @XmlElement(name = "return", namespace = "")
    private List<JugadordDTO> _return;

    /**
     * 
     * @return
     *     returns List<JugadordDTO>
     */
    public List<JugadordDTO> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<JugadordDTO> _return) {
        this._return = _return;
    }

}
