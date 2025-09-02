package com.bornfire.xbrl.recon.xml;

import java.io.IOException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="CREDIT_RETURNS")
public enum CreditReturns {
	
	 THE_7695004420;

    public String toValue() {
        switch (this) {
            case THE_7695004420: return "76,950,044.20";
        }
        return null;
    }

    public static CreditReturns forValue(String value) throws IOException {
        if (value.equals("76,950,044.20")) return THE_7695004420;
        throw new IOException("Cannot deserialize CreditReturns");
    }

}
