/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

package com.MAVLink.enums;

/**
 * STorM32 gimbal prearm check flags.
 */
public class MAV_STORM32_GIMBAL_PREARM_FLAGS {
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_IS_NORMAL = 1; /* STorM32 gimbal is in normal state. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_IMUS_WORKING = 2; /* The IMUs are healthy and working normally. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_MOTORS_WORKING = 4; /* The motors are active and working normally. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_ENCODERS_WORKING = 8; /* The encoders are healthy and working normally. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_VOLTAGE_OK = 16; /* A battery voltage is applied and is in range. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_VIRTUALCHANNELS_RECEIVING = 32; /* Virtual input channels are receiving data. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_MAVLINK_RECEIVING = 64; /* Mavlink messages are being received. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_STORM32LINK_QFIX = 128; /* The STorM32Link data indicates QFix. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_STORM32LINK_WORKING = 256; /* The STorM32Link is working. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_CAMERA_CONNECTED = 512; /* The camera has been found and is connected. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_AUX0_LOW = 1024; /* The signal on the AUX0 input pin is low. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_AUX1_LOW = 2048; /* The signal on the AUX1 input pin is low. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_NTLOGGER_WORKING = 4096; /* The NTLogger is working normally. | */
   public static final int MAV_STORM32_GIMBAL_PREARM_FLAGS_ENUM_END = 4097; /*  | */
}