package com.bornfire.xbrl.recon.xml;

import java.io.IOException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="ACC_NAME")
public enum AccName {
	BANK_OF_BARODA_MUR;

    public String toValue() {
        switch (this) {
            case BANK_OF_BARODA_MUR: return "Bank of Baroda(MUR)";
        }
        return null;
    }

    public static AccName forValue(String value) throws IOException {
        if (value.equals("Bank of Baroda(MUR)")) return BANK_OF_BARODA_MUR;
        throw new IOException("Cannot deserialize AccName");
    }
	

}
