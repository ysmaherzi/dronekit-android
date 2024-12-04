/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE BATTERY_STATUS_V2 PACKING
package com.MAVLink.development;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Battery dynamic information.
        This should be streamed (nominally at 1Hz).
        Static/invariant battery information is sent in BATTERY_INFO.
        Note that smart batteries should set the MAV_BATTERY_STATUS_FLAGS_CAPACITY_RELATIVE_TO_FULL bit to indicate that supplied capacity values are relative to a battery that is known to be full.
        Power monitors would not set this bit, indicating that capacity_consumed is relative to drone power-on, and that other values are estimated based on the assumption that the battery was full on power-on.
      
 */
public class msg_battery_status_v2 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_BATTERY_STATUS_V2 = 369;
    public static final int MAVLINK_MSG_LENGTH = 24;
    private static final long serialVersionUID = MAVLINK_MSG_ID_BATTERY_STATUS_V2;

    
    /**
     * Battery voltage (total). NaN: field not provided.
     */
    @Description("Battery voltage (total). NaN: field not provided.")
    @Units("V")
    public float voltage;
    
    /**
     * Battery current (through all cells/loads). Positive value when discharging and negative if charging. NaN: field not provided.
     */
    @Description("Battery current (through all cells/loads). Positive value when discharging and negative if charging. NaN: field not provided.")
    @Units("A")
    public float current;
    
    /**
     * Consumed charge. NaN: field not provided. This is either the consumption since power-on or since the battery was full, depending on the value of MAV_BATTERY_STATUS_FLAGS_CAPACITY_RELATIVE_TO_FULL.
     */
    @Description("Consumed charge. NaN: field not provided. This is either the consumption since power-on or since the battery was full, depending on the value of MAV_BATTERY_STATUS_FLAGS_CAPACITY_RELATIVE_TO_FULL.")
    @Units("Ah")
    public float capacity_consumed;
    
    /**
     * Remaining charge (until empty). NaN: field not provided. Note: If MAV_BATTERY_STATUS_FLAGS_CAPACITY_RELATIVE_TO_FULL is unset, this value is based on the assumption the battery was full when the system was powered.
     */
    @Description("Remaining charge (until empty). NaN: field not provided. Note: If MAV_BATTERY_STATUS_FLAGS_CAPACITY_RELATIVE_TO_FULL is unset, this value is based on the assumption the battery was full when the system was powered.")
    @Units("Ah")
    public float capacity_remaining;
    
    /**
     * Fault, health, readiness, and other status indications.
     */
    @Description("Fault, health, readiness, and other status indications.")
    @Units("")
    public long status_flags;
    
    /**
     * Temperature of the whole battery pack (not internal electronics). INT16_MAX field not provided.
     */
    @Description("Temperature of the whole battery pack (not internal electronics). INT16_MAX field not provided.")
    @Units("cdegC")
    public short temperature;
    
    /**
     * Battery ID
     */
    @Description("Battery ID")
    @Units("")
    public short id;
    
    /**
     * Remaining battery energy. Values: [0-100], UINT8_MAX: field not provided.
     */
    @Description("Remaining battery energy. Values: [0-100], UINT8_MAX: field not provided.")
    @Units("%")
    public short percent_remaining;
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_BATTERY_STATUS_V2;

        packet.payload.putFloat(voltage);
        packet.payload.putFloat(current);
        packet.payload.putFloat(capacity_consumed);
        packet.payload.putFloat(capacity_remaining);
        packet.payload.putUnsignedInt(status_flags);
        packet.payload.putShort(temperature);
        packet.payload.putUnsignedByte(id);
        packet.payload.putUnsignedByte(percent_remaining);
        
        if (isMavlink2) {
            
        }
        return packet;
    }

    /**
     * Decode a battery_status_v2 message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.voltage = payload.getFloat();
        this.current = payload.getFloat();
        this.capacity_consumed = payload.getFloat();
        this.capacity_remaining = payload.getFloat();
        this.status_flags = payload.getUnsignedInt();
        this.temperature = payload.getShort();
        this.id = payload.getUnsignedByte();
        this.percent_remaining = payload.getUnsignedByte();
        
        if (isMavlink2) {
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_battery_status_v2() {
        this.msgid = MAVLINK_MSG_ID_BATTERY_STATUS_V2;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_battery_status_v2( float voltage, float current, float capacity_consumed, float capacity_remaining, long status_flags, short temperature, short id, short percent_remaining) {
        this.msgid = MAVLINK_MSG_ID_BATTERY_STATUS_V2;

        this.voltage = voltage;
        this.current = current;
        this.capacity_consumed = capacity_consumed;
        this.capacity_remaining = capacity_remaining;
        this.status_flags = status_flags;
        this.temperature = temperature;
        this.id = id;
        this.percent_remaining = percent_remaining;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_battery_status_v2( float voltage, float current, float capacity_consumed, float capacity_remaining, long status_flags, short temperature, short id, short percent_remaining, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_BATTERY_STATUS_V2;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.voltage = voltage;
        this.current = current;
        this.capacity_consumed = capacity_consumed;
        this.capacity_remaining = capacity_remaining;
        this.status_flags = status_flags;
        this.temperature = temperature;
        this.id = id;
        this.percent_remaining = percent_remaining;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_battery_status_v2(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_BATTERY_STATUS_V2;

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
        return "MAVLINK_MSG_ID_BATTERY_STATUS_V2 - sysid:"+sysid+" compid:"+compid+" voltage:"+voltage+" current:"+current+" capacity_consumed:"+capacity_consumed+" capacity_remaining:"+capacity_remaining+" status_flags:"+status_flags+" temperature:"+temperature+" id:"+id+" percent_remaining:"+percent_remaining+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_BATTERY_STATUS_V2";
    }
}
        