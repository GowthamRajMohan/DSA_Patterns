package io.samcs.singleton;

import java.io.Serial;
import java.io.Serializable;

public class MessageSingleton implements Serializable {
    public static MessageSingleton instance = null;

    private MessageSingleton() {
    }

    public static MessageSingleton getInstance() {
        synchronized (MessageSingleton.class) {
            if (instance == null) {
                instance = new MessageSingleton();
            }
        }
        return instance;
    }

    @Serial
    protected Object readResolve() {
        return instance;
    }

}
