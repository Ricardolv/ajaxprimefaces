package br.com.richard.bean;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter("pais")
public class PaisConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext context, UIComponent component, String value) {
    	Integer codigo = null;
    	
    	try {
    		codigo = Integer.valueOf(value);
    	} catch (NumberFormatException e) { }
        
    	if (value != null) {
            for (Pais pais : PerfilUsuarioBeanPojo.PAISES) {
                if (codigo.equals(pais.getCodigo())) {
                    return pais;
                }
            }
        }
        return null;
    }
    
	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value != null && !value.equals("")) {
			Pais pais = (Pais) value;
			return String.valueOf(pais.getCodigo());
		}
		return null;
	}

}