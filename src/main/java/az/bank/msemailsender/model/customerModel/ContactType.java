package az.bank.msemailsender.model.customerModel;

import com.fasterxml.jackson.annotation.JsonValue;

import java.io.Serializable;
import java.util.Locale;

public enum ContactType implements Serializable {
    EMAIL, WORK_EMAIL, PHONE, HOME_PHONE;

    @JsonValue
    public String toLower() {
        return this.toString().toLowerCase(Locale.ENGLISH);
    }
}
