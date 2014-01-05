package com.andune.laghunter;

import com.andune.minecraft.commonlib.Logger;
import com.andune.minecraft.commonlib.LoggerFactory;

/**
 * @author andune
 */
public class Timer {
    private static final long NANOS_IN_MILLIS = 1000000;

    private final Logger log = LoggerFactory.getLogger(Timer.class);

    private long nanoLimit;
    private long timerStartNano;

    public Timer() {
        // set sane 150ms default
        nanoLimit = 150 * NANOS_IN_MILLIS;
    }

    public void startTimer() {
        timerStartNano = System.nanoTime();
    }

    /**
     * Stop the timer and evaluate results.
     *
     * @param event the event this timer was related to, which is used if the
     *              timer needs to be logged to identify the offending event
     *              chain
     */
    public void stopTimer(Object event) {
        if( timerStartNano == 0 ) {
            // TODO: log something about this later, for now just ignore
            return;
        }

        long totalNanos = System.nanoTime() - timerStartNano;
        timerStartNano = 0L;

        if( totalNanos <= 0L ) {
            // TODO: log something about this later, for now just ignore
            return;
        }

        if( totalNanos > nanoLimit ) {
            String className = event.getClass().getSimpleName();
            log.info("Long event "+className+". Took "+totalNanos/NANOS_IN_MILLIS+" ms");
        }
    }

    /**
     * Set the event timer limit in milliseconds.
     *
     * @param millis
     */
    public void setLimitMillis(long millis) {
        setNanoLimit(millis * NANOS_IN_MILLIS);
    }

    /**
     * Set the event timer limit in nanoseconds.
     *
     * @param nanos
     */
    public void setNanoLimit(long nanos) {
        this.nanoLimit = nanoLimit;
    }
}
