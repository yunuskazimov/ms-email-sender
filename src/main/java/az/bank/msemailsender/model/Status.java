package az.bank.msemailsender.model;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Locale;

public enum Status {
    PENDING, CREATED, APPROVED, REJECTED;

    @JsonValue
    public String toLower() {
        return this.toString().toLowerCase(Locale.ENGLISH);
    }

}
