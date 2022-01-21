package az.bank.msemailsender.model;

import az.bank.msemailsender.model.customerModel.CustomerApiDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Configuration
public class MailDtoAccount implements Serializable {
    private String text;
    private List<AccountDto> accountDtos;
    private CustomerApiDto customerDto;
}
