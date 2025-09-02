package com.bornfire.xbrl.recon.xml;

import java.io.IOException;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TIMESTAMP")
public enum Timestamp {
	
	 THE_20201222035036, THE_22122020035036;

    public String toValue() {
        switch (this) {
            case THE_20201222035036: return "2020.12.22 03:50:36";
            case THE_22122020035036: return "22/12/2020 03:50:36";
        }
        return null;
    }

    public static Timestamp forValue(String value) throws IOException {
        if (value.equals("2020.12.22 03:50:36")) return THE_20201222035036;
        if (value.equals("22/12/2020 03:50:36")) return THE_22122020035036;
        throw new IOException("Cannot deserialize Timestamp");
    }

}
