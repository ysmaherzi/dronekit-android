/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE AVSS_DRONE_IMU PACKING
package com.MAVLink.AVSSUAS;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 *  Drone IMU data. Quaternion order is w, x, y, z and a zero rotation would be expressed as (1 0 0 0).
 */
public class msg_avss_drone_imu extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_AVSS_DRONE_IMU = 60052;
    public static final int MAVLINK_MSG_LENGTH = 44;
    private static final long serialVersionUID = MAVLINK_MSG_ID_AVSS_DRONE_IMU;

    
    /**
     * Timestamp (time since FC boot).
     */
    @Description("Timestamp (time since FC boot).")
    @Units("ms")
    public long time_boot_ms;
    
    /**
     * Quaternion component 1, w (1 in null-rotation)
     */
    @Description("Quaternion component 1, w (1 in null-rotation)")
    @Units("")
    public float q1;
    
    /**
     * Quaternion component 2, x (0 in null-rotation)
     */
    @Description("Quaternion component 2, x (0 in null-rotation)")
    @Units("")
    public float q2;
    
    /**
     * Quaternion component 3, y (0 in null-rotation)
     */
    @Description("Quaternion component 3, y (0 in null-rotation)")
    @Units("")
    public float q3;
    
    /**
     * Quaternion component 4, z (0 in null-rotation)
     */
    @Description("Quaternion component 4, z (0 in null-rotation)")
    @Units("")
    public float q4;
    
    /**
     * X acceleration
     */
    @Description("X acceleration")
    @Units("m/s/s")
    public float xacc;
    
    /**
     * Y acceleration
     */
    @Description("Y acceleration")
    @Units("m/s/s")
    public float yacc;
    
    /**
     * Z acceleration
     */
    @Description("Z acceleration")
    @Units("m/s/s")
    public float zacc;
    
    /**
     * Angular speed around X axis
     */
    @Description("Angular speed around X axis")
    @Units("rad/s")
    public float xgyro;
    
    /**
     * Angular speed around Y axis
     */
    @Description("Angular speed around Y axis")
    @Units("rad/s")
    public float ygyro;
    
    /**
     * Angular speed around Z axis
     */
    @Description("Angular speed around Z axis")
    @Units("rad/s")
    public float zgyro;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_AVSS_DRONE_IMU;

        packet.payload.putUnsignedInt(time_boot_ms);
        packet.payload.putFloat(q1);
        packet.payload.putFloat(q2);
        packet.payload.putFloat(q3);
        packet.payload.putFloat(q4);
        packet.payload.putFloat(xacc);
        packet.payload.putFloat(yacc);
        packet.payload.putFloat(zacc);
        packet.payload.putFloat(xgyro);
        packet.payload.putFloat(ygyro);
        packet.payload.putFloat(zgyro);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a avss_drone_imu message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();
        this.q1 = payload.getFloat();
        this.q2 = payload.getFloat();
        this.q3 = payload.getFloat();
        this.q4 = payload.getFloat();
        this.xacc = payload.getFloat();
        this.yacc = payload.getFloat();
        this.zacc = payload.getFloat();
        this.xgyro = payload.getFloat();
        this.ygyro = payload.getFloat();
        this.zgyro = payload.getFloat();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_avss_drone_imu() {
        this.msgid = MAVLINK_MSG_ID_AVSS_DRONE_IMU;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_avss_drone_imu( long time_boot_ms, float q1, float q2, float q3, float q4, float xacc, float yacc, float zacc, float xgyro, float ygyro, float zgyro) {
        this.msgid = MAVLINK_MSG_ID_AVSS_DRONE_IMU;

        this.time_boot_ms = time_boot_ms;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        this.xgyro = xgyro;
        this.ygyro = ygyro;
        this.zgyro = zgyro;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_avss_drone_imu( long time_boot_ms, float q1, float q2, float q3, float q4, float xacc, float yacc, float zacc, float xgyro, float ygyro, float zgyro, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_AVSS_DRONE_IMU;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.time_boot_ms = time_boot_ms;
        this.q1 = q1;
        this.q2 = q2;
        this.q3 = q3;
        this.q4 = q4;
        this.xacc = xacc;
        this.yacc = yacc;
        this.zacc = zacc;
        this.xgyro = xgyro;
        this.ygyro = ygyro;
        this.zgyro = zgyro;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_avss_drone_imu(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_AVSS_DRONE_IMU;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                          
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_AVSS_DRONE_IMU - sysid:"+sysid+" compid:"+compid+" time_boot_ms:"+time_boot_ms+" q1:"+q1+" q2:"+q2+" q3:"+q3+" q4:"+q4+" xacc:"+xacc+" yacc:"+yacc+" zacc:"+zacc+" xgyro:"+xgyro+" ygyro:"+ygyro+" zgyro:"+zgyro+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_AVSS_DRONE_IMU";
    }
}
        