package com.andune.laghunter;

import com.andune.minecraft.commonlib.Logger;
import com.andune.minecraft.commonlib.LoggerFactory;

/**
 * @author andune
 */
public class TickMonitor implements Runnable {
    // we give a grace period of 1 ms since even on a no-load server, there's
    // a little bit of overhead beyond the stock 50ms per tick
    private final long MILLIS_IN_A_TICK = 51;

    private Logger log = LoggerFactory.getLogger(TickMonitor.class);

    // how many milliseconds constitute a "long tick" that we should warn about
    private long longTickWarning = 250;

    // how many ticks before printing out a tick report, 20 ticks per second
    private long reportTicks = 1200;

    // how many ticks in this reporting period
    private long tickReportTicks;
    // how much tick drift detected during this reporting period
    private long tickReportTickDrift;

    // last System.currentTimeMillis() a tick was run
    private long lastRun = 0;
    // total number of ticks ever run
    private long tickCount = 0;
    // the total amount of tick drift, in ms
    private long totalTickDrift;
    // the number of ticks that have drifted, for deriving average drift
    private long totalTicksDrifted;
    // maximum tick drift detected
    private long maxTickDrift = 0;

    @Override
    public void run() {
        tickCount++;
        tickReportTicks++;
        long currentTime = System.currentTimeMillis();

        if( lastRun > 0 ) {
            long tickMs = currentTime - lastRun;
            long tickDrift = tickMs - MILLIS_IN_A_TICK;
            if( tickDrift > 0 ) {
                totalTickDrift += tickDrift;
                tickReportTickDrift += tickDrift;
                totalTicksDrifted++;
                if( tickDrift > maxTickDrift )
                    maxTickDrift = tickDrift;
            }

            if( tickReportTicks >= reportTicks ) {
                log.info(String.format("TickReport: totalTicks = %d, tickDrift = %d ms, avg tick drift = %-4.2f ms",
                        tickReportTicks, tickReportTickDrift, (float) tickReportTickDrift/tickReportTicks));
                tickReportTickDrift = 0;
                tickReportTicks = 0;
            }

            if( tickDrift > longTickWarning )
                log.info("Long tick warning: tick took "+tickDrift+" ms");
        }

        lastRun = currentTime;
    }
}
