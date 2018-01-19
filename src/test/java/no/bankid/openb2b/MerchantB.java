package no.bankid.openb2b;

import java.net.URL;

public class MerchantB extends Merchant {

    @Override
    protected String getCommonName() {
        return "Merchant B";
    }

    @Override
    protected String getOrganizationNumber() {
        return "111111111";
    }

    @Override
    protected String getKeyAlias() {
        return "1";
    }

    @Override
    protected char[] getKeyStorePassword() {
        return "xxxx".toCharArray();
    }

    @Override
    protected URL getKeyStoreUrl() {
        return MerchantB.class.getResource("/roflmao AS-BINAS-sign.p12");
    }

    @Override
    protected char[] getKeyPassword() {
        return "xxx".toCharArray();
    }
}
