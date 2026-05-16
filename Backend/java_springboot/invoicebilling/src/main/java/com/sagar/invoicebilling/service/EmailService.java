package com.sagar.invoicebilling.service;

import java.io.File;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendInvoice(String toEmail,
                            byte[] pdfData) {

        try {

            File file =
                    File.createTempFile("invoice",
                            ".pdf");

            FileOutputStream fos =
                    new FileOutputStream(file);

            fos.write(pdfData);

            fos.close();

            MimeMessage message =
                    mailSender.createMimeMessage();

            MimeMessageHelper helper =
                    new MimeMessageHelper(message,
                            true);

            helper.setTo(toEmail);

            helper.setSubject("Invoice PDF");

            helper.setText("Please find attached invoice.");

            helper.addAttachment("invoice.pdf",
                    new FileSystemResource(file));

            mailSender.send(message);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}