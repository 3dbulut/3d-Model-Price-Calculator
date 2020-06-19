package org.model3d.util.android;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;

public class AndroidURLStreamHandlerFactory implements URLStreamHandlerFactory {

    @Override
    public URLStreamHandler createURLStreamHandler(String protocol) {
        if ("assets".equals(protocol)) {
            return new org.model3d.util.android.assets.Handler();
        } else if ("content".equals(protocol)){
            return new org.model3d.util.android.content.Handler();
        }
        return null;
    }
}
