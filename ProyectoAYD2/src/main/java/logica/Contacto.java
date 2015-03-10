/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author cruz
 */
public class Contacto {
    
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    public boolean autenticarDireccion(String direccion){
        try{
            Pattern pattern = Pattern.compile(PATTERN_EMAIL);
            Matcher matcher = pattern.matcher(direccion);
            return matcher.matches();
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean enviarCorreo(String mensaje, String destino, String asunto){
        try
        {
            // Propiedades de la conexión
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", "lextorcross@gmail.com");
            props.setProperty("mail.smtp.auth", "true");

            // Preparamos la sesion
            Session session = Session.getDefaultInstance(props);

            // Construimos el mensaje
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("lextorcross@gmail.com"));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress("lextorcross@gmail.com"));
            message.setSubject(asunto);
            message.setText("destino"+", "+mensaje);

            // Lo enviamos.
            Transport t = session.getTransport("smtp");
            t.connect("lextorcross@gmail.com", "pass2015");
            t.sendMessage(message, message.getAllRecipients());

            // Cierre.
            t.close();
            return true;
        }
        catch (Exception e)
        {
            return false;
            //e.printStackTrace();
        }
    }
    
}
