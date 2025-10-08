package com.paymentchain.billing.common;

import com.paymentchain.billing.dto.InvoiceResponse;
import com.paymentchain.billing.entities.Invoice;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-10-08T13:12:24-0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Oracle Corporation)"
)
@Component
public class InvoiceResponseMapperImpl implements InvoiceResponseMapper {

    @Override
    public InvoiceResponse InvoiceToInvoiceRespose(Invoice source) {
        if ( source == null ) {
            return null;
        }

        InvoiceResponse invoiceResponse = new InvoiceResponse();

        invoiceResponse.setCustomer( source.getCustomerId() );
        invoiceResponse.setInvoiceId( source.getId() );
        invoiceResponse.setNumber( source.getNumber() );
        invoiceResponse.setDetail( source.getDetail() );
        invoiceResponse.setAmount( source.getAmount() );

        return invoiceResponse;
    }

    @Override
    public List<InvoiceResponse> InvoiceListToInvoiceResposeList(List<Invoice> source) {
        if ( source == null ) {
            return null;
        }

        List<InvoiceResponse> list = new ArrayList<InvoiceResponse>( source.size() );
        for ( Invoice invoice : source ) {
            list.add( InvoiceToInvoiceRespose( invoice ) );
        }

        return list;
    }

    @Override
    public Invoice InvoiceResponseToInvoice(InvoiceResponse srr) {
        if ( srr == null ) {
            return null;
        }

        Invoice invoice = new Invoice();

        invoice.setCustomerId( srr.getCustomer() );
        invoice.setId( srr.getInvoiceId() );
        invoice.setNumber( srr.getNumber() );
        invoice.setDetail( srr.getDetail() );
        invoice.setAmount( srr.getAmount() );

        return invoice;
    }

    @Override
    public List<Invoice> InvoiceResponseToInvoiceList(List<InvoiceResponse> source) {
        if ( source == null ) {
            return null;
        }

        List<Invoice> list = new ArrayList<Invoice>( source.size() );
        for ( InvoiceResponse invoiceResponse : source ) {
            list.add( InvoiceResponseToInvoice( invoiceResponse ) );
        }

        return list;
    }
}
