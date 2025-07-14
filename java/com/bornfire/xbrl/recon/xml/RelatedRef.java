package com.bornfire.xbrl.recon.xml;

import java.io.IOException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="RELATED_REF")
public enum RelatedRef {

	
	BANK_OF_BARODA, EMPTY, INTERBANK_REFUND, INT_ON_BOM_NOTES, NONREF, RET_OF_FUND, THE_000001, VISA_ACC;

    public String toValue() {
        switch (this) {
            case BANK_OF_BARODA: return "BANK OF BARODA";
            case EMPTY: return "";
            case INTERBANK_REFUND: return "Interbank Refund";
            case INT_ON_BOM_NOTES: return "INT ON BOM NOTES";
            case NONREF: return "NONREF";
            case RET_OF_FUND: return "RET OF FUND";
            case THE_000001: return "000001";
            case VISA_ACC: return "VISA ACC";
        }
        return null;
    }

    public static RelatedRef forValue(String value) throws IOException {
        if (value.equals("BANK OF BARODA")) return BANK_OF_BARODA;
        if (value.equals("")) return EMPTY;
        if (value.equals("Interbank Refund")) return INTERBANK_REFUND;
        if (value.equals("INT ON BOM NOTES")) return INT_ON_BOM_NOTES;
        if (value.equals("NONREF")) return NONREF;
        if (value.equals("RET OF FUND")) return RET_OF_FUND;
        if (value.equals("000001")) return THE_000001;
        if (value.equals("VISA ACC")) return VISA_ACC;
        throw new IOException("Cannot deserialize RelatedRef");
    }
}
