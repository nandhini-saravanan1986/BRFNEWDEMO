package com.bornfire.xbrl.recon.xml;

import java.io.IOException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CREDIT_CURR")
public enum CreditCurr {
	
	THE_128700798572;

    public String toValue() {
        switch (this) {
            case THE_128700798572: return "1,287,007,985.72";
        }
        return null;
    }

    public static CreditCurr forValue(String value) throws IOException {
        if (value.equals("1,287,007,985.72")) return THE_128700798572;
        throw new IOException("Cannot deserialize CreditCurr");
    }

}
