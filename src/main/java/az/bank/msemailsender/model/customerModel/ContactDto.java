package az.bank.msemailsender.model.customerModel;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactDto implements Serializable {
    private String phoneNumber;
    private String email;
}
