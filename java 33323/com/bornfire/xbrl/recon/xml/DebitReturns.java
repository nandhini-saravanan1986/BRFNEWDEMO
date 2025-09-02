package com.bornfire.xbrl.recon.xml;

import java.io.IOException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DEBIT_RETURNS")
public enum DebitReturns {
	
	 THE_1615062014;

    public String toValue() {
        switch (this) {
            case THE_1615062014: return "16,150,620.14";
        }
        return null;
    }

    public static DebitReturns forValue(String value) throws IOException {
        if (value.equals("16,150,620.14")) return THE_1615062014;
        throw new IOException("Cannot deserialize DebitReturns");
    }

}
