package com.bornfire.xbrl.recon.xml;

import java.io.IOException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="OPERDAY")
public enum Operday {
	
	 THE_20201221, THE_21122020;

    public String toValue() {
        switch (this) {
            case THE_20201221: return "2020.12.21";
            case THE_21122020: return "21/12/2020";
        }
        return null;
    }

    public static Operday forValue(String value) throws IOException {
        if (value.equals("2020.12.21")) return THE_20201221;
        if (value.equals("21/12/2020")) return THE_21122020;
        throw new IOException("Cannot deserialize Operday");
    }

}
