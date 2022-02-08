package az.bank.msemailsender.mailSender;


//@Component
public class EMailSenderAccount {
//    private EmailSenderService senderService;
//
//    public EMailSenderAccount(EmailSenderService senderService) {
//        this.senderService = senderService;
//    }


//    // @EventListener(MailListener.class)
//    public void sendMail(MailDto dto) {
//     if (dto.getAccountDtos()!=null&&dto.getCustomerDto()!=null){
//         String title = dto
//                 .getCustomerDto()
//                 .getTitle()
//                 .name();
//
//         String email = dto.getCustomerDto().getContacts().get(ContactType.EMAIL);
//         String customerName = dto.getCustomerDto().getFirstName() + " " + dto.getCustomerDto().getLastName();
//         String accCurrency = dto.getAccountDtos().get(dto.getAccountDtos().size() - 1).getCurrency().name();
//         String accNo = dto.getAccountDtos().get(dto.getAccountDtos().size() - 1).getAccountNo();
//         Double accAmount = dto.getAccountDtos().get(dto.getAccountDtos().size() - 1).getAmount();
//         Long accId = dto.getAccountDtos().get(dto.getAccountDtos().size() - 1).getId();
//         String status = dto.getAccountDtos().get(dto.getAccountDtos().size()-1).getStatus().toString();
//         int accCount = dto.getAccountDtos().size();
//         String msgBody =
//                 "Hello " + title + " " + customerName +
//                         ".\nYour new account created successfully." +
//                         "\n----------------------------------------------" +
//                         "\n- Account ID            :  " + accId + ";" +
//                         "\n- Account Number   :  " + accNo + ";" +
//                         "\n- Account Amount   :  " + accAmount + ";" +
//                         "\n- Account Status     :  " +status+ ";" +
//                         "\n- Account Currency :  " + accCurrency + ";" +
//                         "\n----------------------------------------------" +
//                         "\n" +
//                         "\n- Now You have " + accCount + " accounts. Thank you for choosing our bank." +
//                         "   \n\n\n  Best Regards,\n\n*** YK Bank ***";
//
//         senderService.sendEmail(email,
//                 "Account Info Service",
//                 msgBody);
//     }else{
//         String email = "yunus.kazimov@gmail.com";
//         senderService.sendEmail(email,
//                 "Account Report Service",
//                 dto.getText());
//     }
    //  }
}
