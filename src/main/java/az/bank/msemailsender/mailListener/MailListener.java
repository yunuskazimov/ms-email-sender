package az.bank.msemailsender.mailListener;


import az.bank.msemailsender.mailSender.EMailSender;
import az.bank.msemailsender.model.MailDto;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
public class MailListener {
    private final EMailSender EMailSender;

    public MailListener(EMailSender EMailSender) {
        this.EMailSender = EMailSender;
    }


    @RabbitListener(queues = "MAIL_SENDER_Q")
    public void getMessage(MailDto dto) {
        EMailSender.sendMail(dto);
    }
}
