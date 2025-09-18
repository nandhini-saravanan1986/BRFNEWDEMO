package com.bornfire.xbrl.recon.xml;

import java.io.IOException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="DB_CR")
public enum DBCR {
	
	THE_1_D, THE_2_C;

    public String toValue() {
        switch (this) {
            case THE_1_D: return "1D";
            case THE_2_C: return "2C";
        }
        return null;
    }

    public static DBCR forValue(String value) throws IOException {
        if (value.equals("1D")) return THE_1_D;
        if (value.equals("2C")) return THE_2_C;
        throw new IOException("Cannot deserialize DBCR");
    }

}
