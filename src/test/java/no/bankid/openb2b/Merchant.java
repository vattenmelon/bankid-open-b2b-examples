package no.bankid.openb2b;

import java.io.InputStream;
import java.net.URL;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.util.List;

import static java.util.Arrays.asList;

abstract class Merchant {

    List<Certificate> getCertList() throws Exception {
        return asList(getKeyStore().getCertificateChain(getKeyAlias()));
    }

    PrivateKey getPrivateKey() throws Exception {
        return (PrivateKey) getKeyStore().getKey(getKeyAlias(), getKeyPassword());
    }

    protected abstract String getCommonName();

    protected abstract String getOrganizationNumber();

    protected abstract String getKeyAlias();

    protected abstract char[] getKeyStorePassword();

    protected abstract URL getKeyStoreUrl();

    protected abstract char[] getKeyPassword();

    private KeyStore getKeyStore() throws Exception {
        KeyStore keyStore = null;
        if (this instanceof MerchantA) {
            keyStore = KeyStore.getInstance("JKS");
        }else{
            keyStore = KeyStore.getInstance("PKCS12");
        }
        try (InputStream inputStream = getKeyStoreUrl().openStream()) {
            keyStore.load(inputStream, getKeyStorePassword());
        }
        return keyStore;
    }

}
