/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE TARGET_ABSOLUTE PACKING
package com.MAVLink.development;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Current motion information from sensors on a target
 */
public class msg_target_absolute extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_TARGET_ABSOLUTE = 510;
    public static final int MAVLINK_MSG_LENGTH = 106;
    private static final long serialVersionUID = MAVLINK_MSG_ID_TARGET_ABSOLUTE;

    
    /**
     * Timestamp (UNIX epoch time).
     */
    @Description("Timestamp (UNIX epoch time).")
    @Units("us")
    public long timestamp;
    
    /**
     * Target's latitude (WGS84)
     */
    @Description("Target's latitude (WGS84)")
    @Units("degE7")
    public int lat;
    
    /**
     * Target's longitude (WGS84)
     */
    @Description("Target's longitude (WGS84)")
    @Units("degE7")
    public int lon;
    
    /**
     * Target's altitude (AMSL)
     */
    @Description("Target's altitude (AMSL)")
    @Units("m")
    public float alt;
    
    /**
     * Target's velocity in its body frame
     */
    @Description("Target's velocity in its body frame")
    @Units("m/s")
    public float vel[] = new float[3];
    
    /**
     * Linear target's acceleration in its body frame
     */
    @Description("Linear target's acceleration in its body frame")
    @Units("m/s/s")
    public float acc[] = new float[3];
    
    /**
     * Quaternion of the target's orientation from its body frame to the vehicle's NED frame.
     */
    @Description("Quaternion of the target's orientation from its body frame to the vehicle's NED frame.")
    @Units("")
    public float q_target[] = new float[4];
    
    /**
     * Target's roll, pitch and yaw rates
     */
    @Description("Target's roll, pitch and yaw rates")
    @Units("rad/s")
    public float rates[] = new float[3];
    
    /**
     * Standard deviation of horizontal (eph) and vertical (epv) position errors
     */
    @Description("Standard deviation of horizontal (eph) and vertical (epv) position errors")
    @Units("m")
    public float position_std[] = new float[2];
    
    /**
     * Standard deviation of the target's velocity in its body frame
     */
    @Description("Standard deviation of the target's velocity in its body frame")
    @Units("m/s")
    public float vel_std[] = new float[3];
    
    /**
     * Standard deviation of the target's acceleration in its body frame
     */
    @Description("Standard deviation of the target's acceleration in its body frame")
    @Units("m/s/s")
    public float acc_std[] = new float[3];
    
    /**
     * The ID of the target if multiple targets are present
     */
    @Description("The ID of the target if multiple targets are present")
    @Units("")
    public short id;
    
    /**
     * Bitmap to indicate the sensor's reporting capabilities
     */
    @Description("Bitmap to indicate the sensor's reporting capabilities")
    @Units("")
    public short sensor_capabilities;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_TARGET_ABSOLUTE;

        packet.payload.putUnsignedLong(timestamp);
        packet.payload.putInt(lat);
        packet.payload.putInt(lon);
        packet.payload.putFloat(alt);
        
        for (int i = 0; i < vel.length; i++) {
            packet.payload.putFloat(vel[i]);
        }
                    
        
        for (int i = 0; i < acc.length; i++) {
            packet.payload.putFloat(acc[i]);
        }
                    
        
        for (int i = 0; i < q_target.length; i++) {
            packet.payload.putFloat(q_target[i]);
        }
                    
        
        for (int i = 0; i < rates.length; i++) {
            packet.payload.putFloat(rates[i]);
        }
                    
        
        for (int i = 0; i < position_std.length; i++) {
            packet.payload.putFloat(position_std[i]);
        }
                    
        
        for (int i = 0; i < vel_std.length; i++) {
            packet.payload.putFloat(vel_std[i]);
        }
                    
        
        for (int i = 0; i < acc_std.length; i++) {
            packet.payload.putFloat(acc_std[i]);
        }
                    
        packet.payload.putUnsignedByte(id);
        packet.payload.putUnsignedByte(sensor_capabilities);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a target_absolute message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.timestamp = payload.getUnsignedLong();
        this.lat = payload.getInt();
        this.lon = payload.getInt();
        this.alt = payload.getFloat();
        
        for (int i = 0; i < this.vel.length; i++) {
            this.vel[i] = payload.getFloat();
        }
                
        
        for (int i = 0; i < this.acc.length; i++) {
            this.acc[i] = payload.getFloat();
        }
                
        
        for (int i = 0; i < this.q_target.length; i++) {
            this.q_target[i] = payload.getFloat();
        }
                
        
        for (int i = 0; i < this.rates.length; i++) {
            this.rates[i] = payload.getFloat();
        }
                
        
        for (int i = 0; i < this.position_std.length; i++) {
            this.position_std[i] = payload.getFloat();
        }
                
        
        for (int i = 0; i < this.vel_std.length; i++) {
            this.vel_std[i] = payload.getFloat();
        }
                
        
        for (int i = 0; i < this.acc_std.length; i++) {
            this.acc_std[i] = payload.getFloat();
        }
                
        this.id = payload.getUnsignedByte();
        this.sensor_capabilities = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_target_absolute() {
        this.msgid = MAVLINK_MSG_ID_TARGET_ABSOLUTE;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_target_absolute( long timestamp, int lat, int lon, float alt, float[] vel, float[] acc, float[] q_target, float[] rates, float[] position_std, float[] vel_std, float[] acc_std, short id, short sensor_capabilities) {
        this.msgid = MAVLINK_MSG_ID_TARGET_ABSOLUTE;

        this.timestamp = timestamp;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.vel = vel;
        this.acc = acc;
        this.q_target = q_target;
        this.rates = rates;
        this.position_std = position_std;
        this.vel_std = vel_std;
        this.acc_std = acc_std;
        this.id = id;
        this.sensor_capabilities = sensor_capabilities;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_target_absolute( long timestamp, int lat, int lon, float alt, float[] vel, float[] acc, float[] q_target, float[] rates, float[] position_std, float[] vel_std, float[] acc_std, short id, short sensor_capabilities, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_TARGET_ABSOLUTE;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.timestamp = timestamp;
        this.lat = lat;
        this.lon = lon;
        this.alt = alt;
        this.vel = vel;
        this.acc = acc;
        this.q_target = q_target;
        this.rates = rates;
        this.position_std = position_std;
        this.vel_std = vel_std;
        this.acc_std = acc_std;
        this.id = id;
        this.sensor_capabilities = sensor_capabilities;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_target_absolute(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_TARGET_ABSOLUTE;

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
        return "MAVLINK_MSG_ID_TARGET_ABSOLUTE - sysid:"+sysid+" compid:"+compid+" timestamp:"+timestamp+" lat:"+lat+" lon:"+lon+" alt:"+alt+" vel:"+vel+" acc:"+acc+" q_target:"+q_target+" rates:"+rates+" position_std:"+position_std+" vel_std:"+vel_std+" acc_std:"+acc_std+" id:"+id+" sensor_capabilities:"+sensor_capabilities+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_TARGET_ABSOLUTE";
    }
}
        