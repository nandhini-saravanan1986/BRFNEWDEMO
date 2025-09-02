package com.bornfire.xbrl.recon.xml;

import java.io.IOException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CREDIT_OPEN")
public enum CreditOpen {
	
	 THE_122620856166;

    public String toValue() {
        switch (this) {
            case THE_122620856166: return "1,226,208,561.66";
        }
        return null;
    }

    public static CreditOpen forValue(String value) throws IOException {
        if (value.equals("1,226,208,561.66")) return THE_122620856166;
        throw new IOException("Cannot deserialize CreditOpen");
    }
	
	

}
