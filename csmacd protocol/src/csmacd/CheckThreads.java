/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csmacd;

/**
 *
 * @author PAVILION
 */
public class CheckThreads implements ChannelConstants {
    public static int checking(String StationName)
    {   int stat;
        switch (StationName)
        {
            case("Station 1") : stat = 1;
                                break;
            case ("Station 2") : stat = 2;
                                break;
            case("Station 3") : stat = 3;
                                break;
            case ("Station 4") : stat = 4;
                                break;
            default : stat = 0;

        }
        return(stat);
    }
}