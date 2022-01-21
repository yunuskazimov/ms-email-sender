package az.bank.msemailsender.mailSender;


import az.bank.msemailsender.model.MailDto;
import az.bank.msemailsender.service.EmailSenderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EMailSender {
    private EmailSenderService senderService;

    public EMailSender(EmailSenderService senderService) {
        this.senderService = senderService;
    }


    // @EventListener(MailListener.class)
    public void sendMail(MailDto dto) {
        log.info("mail dto :,{}", dto);
        if (dto.getUsername() != null && dto.getPassword() != null) {
            String text = dto.getText();
            String username = dto.getUsername();
            String pass = dto.getPassword();
            String email = dto.getEmail();

            String msgBody =
                    "Hello " + text + "." +
                            "\nYour new account created successfully." +
                            "\n----------------------------------------------" +
                            "\n- Account username            :  " + username + ";" +
                            "\n- Password   :  <   " + pass + "   > ;" +
                            "\n- Please enter your account and change your password" +
                            "\n----------------------------------------------" +
                            "\n" +
                            "   \n\n\n  Best Regards,\n\n*** Xazar TV ***";

            senderService.sendEmail(email,
                    "Account Info Service",
                    msgBody);
        } else {
            String email = "yunus.kazimov@gmail.com";
            senderService.sendEmail(email,
                    "Account Report Service",
                    dto.getText());
        }
    }
}
