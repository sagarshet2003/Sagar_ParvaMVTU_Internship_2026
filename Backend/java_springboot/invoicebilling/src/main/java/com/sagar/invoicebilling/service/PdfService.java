package com.sagar.invoicebilling.service;

import java.io.ByteArrayOutputStream;

import org.springframework.stereotype.Service;

import com.itextpdf.html2pdf.HtmlConverter;

@Service
public class PdfService {

    public byte[] generatePdf(String html) {

        ByteArrayOutputStream outputStream =
                new ByteArrayOutputStream();

        HtmlConverter.convertToPdf(html, outputStream);

        return outputStream.toByteArray();
    }
}