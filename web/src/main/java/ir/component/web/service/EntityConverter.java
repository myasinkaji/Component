package ir.component.web.service;

import ir.component.core.dao.model.NotificationType;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import java.io.Serializable;

/**
 * @author Zahra Afsharinia
 */
@FacesConverter(value = "entityConverter")
public class EntityConverter implements Converter, Serializable {

    public Object getAsObject(FacesContext context, UIComponent component, String value) {
        return NotificationType.valueOf(value);
    }

    public String getAsString(FacesContext context, UIComponent component, Object value) {
        return value.toString();
    }
}
