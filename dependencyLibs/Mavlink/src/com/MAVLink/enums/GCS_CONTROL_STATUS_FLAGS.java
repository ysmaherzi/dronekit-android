/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/**
 * CONTROL_STATUS flags.
 */
public class GCS_CONTROL_STATUS_FLAGS {
   public static final int GCS_CONTROL_STATUS_FLAGS_SYSTEM_MANAGER = 1; /* If set, this CONTROL_STATUS publishes the controlling GCS for the whole system. If unset, the CONTROL_STATUS indicates the controlling GCS for just the component emitting the message. Note that to request control of the system a GCS should send MAV_CMD_REQUEST_OPERATOR_CONTROL to the component emitting CONTROL_STATUS with this flag set. | */
   public static final int GCS_CONTROL_STATUS_FLAGS_TAKEOVER_ALLOWED = 2; /* Takeover allowed (requests for control will be granted). If not set requests for control will be rejected, but the controlling GCS will be notified (and may release control or allow takeover). | */
   public static final int GCS_CONTROL_STATUS_FLAGS_ENUM_END = 3; /*  | */
}