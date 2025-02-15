/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/**
 * Signal spoofing state in a GPS receiver.
 */
public class GPS_SPOOFING_STATE {
   public static final int GPS_SPOOFING_STATE_UNKNOWN = 0; /* The GPS receiver does not provide GPS signal spoofing info. | */
   public static final int GPS_SPOOFING_STATE_OK = 1; /* The GPS receiver detected no signal spoofing. | */
   public static final int GPS_SPOOFING_STATE_MITIGATED = 2; /* The GPS receiver detected and mitigated signal spoofing. | */
   public static final int GPS_SPOOFING_STATE_DETECTED = 3; /* The GPS receiver detected signal spoofing but still has a fix. | */
   public static final int GPS_SPOOFING_STATE_ENUM_END = 4; /*  | */
}