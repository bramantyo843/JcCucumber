package org.example.driver.strategies;


//bramantyopratamaujiantiga.pageobjekbramantyopratama.Utils;


import org.example.driver.util.Constants;

public class DriveStrategyImplementor {

    public static DriveStrategy chooseStrategy(String strategy) {
        switch (strategy) {
            case Constants.CHROME:
                return new Chrome();

              case Constants.CHROMEHEADLESS:
                  return new ChromeHeadles();


       //     case Constants.FIREFOX:
       //         return new Firefox();

            default:
                return null;
        }
    }
}
