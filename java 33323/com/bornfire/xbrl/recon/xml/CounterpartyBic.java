package com.bornfire.xbrl.recon.xml;

import java.io.IOException;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="COUNTERPARTY_BIC")
@XmlEnum
public enum CounterpartyBic {
	
	
	
	    BARCMUMU, BKONMUMU, BOMMMUPL, HABBMUMU, HSBCMUMU, INILMUMU, MCBLMUMU, MPCBMUMU, STCBMUMU;

	    public String toValue() {
	        switch (this) {
	            case BARCMUMU: return "BARCMUMU";
	            case BKONMUMU: return "BKONMUMU";
	            case BOMMMUPL: return "BOMMMUPL";
	            case HABBMUMU: return "HABBMUMU";
	            case HSBCMUMU: return "HSBCMUMU";
	            case INILMUMU: return "INILMUMU";
	            case MCBLMUMU: return "MCBLMUMU";
	            case MPCBMUMU: return "MPCBMUMU";
	            case STCBMUMU: return "STCBMUMU";
	        }
	        return null;
	    }

	    public static CounterpartyBic forValue(String value) throws IOException {
	        if (value.equals("BARCMUMU")) return BARCMUMU;
	        if (value.equals("BKONMUMU")) return BKONMUMU;
	        if (value.equals("BOMMMUPL")) return BOMMMUPL;
	        if (value.equals("HABBMUMU")) return HABBMUMU;
	        if (value.equals("HSBCMUMU")) return HSBCMUMU;
	        if (value.equals("INILMUMU")) return INILMUMU;
	        if (value.equals("MCBLMUMU")) return MCBLMUMU;
	        if (value.equals("MPCBMUMU")) return MPCBMUMU;
	        if (value.equals("STCBMUMU")) return STCBMUMU;
	        throw new IOException("Cannot deserialize CounterpartyBic");
	    }
	    
	    
	    
	}


