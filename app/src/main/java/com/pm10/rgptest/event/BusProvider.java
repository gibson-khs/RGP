package com.pm10.rgptest.event;

import com.squareup.otto.Bus;

public class BusProvider {
    private static Bus bus;

    public static Bus getInstance() {
        if (bus == null)
            bus = new Bus();
        return bus;
    }
}
