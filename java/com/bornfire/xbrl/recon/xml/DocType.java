package com.bornfire.xbrl.recon.xml;

import java.io.IOException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DOC_TYPE")
public enum DocType {
	
	THE_096_RTO, THE_103_RTOS, THE_202_CLCNCN, THE_202_CLCNDN, THE_202_RTOS;

    public String toValue() {
        switch (this) {
            case THE_096_RTO: return "096RTO";
            case THE_103_RTOS: return "103RTOS";
            case THE_202_CLCNCN: return "202CLCNCN";
            case THE_202_CLCNDN: return "202CLCNDN";
            case THE_202_RTOS: return "202RTOS";
        }
        return null;
    }

    public static DocType forValue(String value) throws IOException {
        if (value.equals("096RTO")) return THE_096_RTO;
        if (value.equals("103RTOS")) return THE_103_RTOS;
        if (value.equals("202CLCNCN")) return THE_202_CLCNCN;
        if (value.equals("202CLCNDN")) return THE_202_CLCNDN;
        if (value.equals("202RTOS")) return THE_202_RTOS;
        throw new IOException("Cannot deserialize DocType");
    }

}
