/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SMART_BATTERY_INFO PACKING
package com.MAVLink.common;
import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;
import com.MAVLink.Messages.Units;
import com.MAVLink.Messages.Description;

/**
 * Smart Battery information (static/infrequent update). Use for updates from: smart battery to flight stack, flight stack to GCS. Use BATTERY_STATUS for the frequent battery updates.
 */
public class msg_smart_battery_info extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SMART_BATTERY_INFO = 370;
    public static final int MAVLINK_MSG_LENGTH = 109;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SMART_BATTERY_INFO;

    
    /**
     * Capacity when full according to manufacturer, -1: field not provided.
     */
    @Description("Capacity when full according to manufacturer, -1: field not provided.")
    @Units("mAh")
    public int capacity_full_specification;
    
    /**
     * Capacity when full (accounting for battery degradation), -1: field not provided.
     */
    @Description("Capacity when full (accounting for battery degradation), -1: field not provided.")
    @Units("mAh")
    public int capacity_full;
    
    /**
     * Charge/discharge cycle count. UINT16_MAX: field not provided.
     */
    @Description("Charge/discharge cycle count. UINT16_MAX: field not provided.")
    @Units("")
    public int cycle_count;
    
    /**
     * Battery weight. 0: field not provided.
     */
    @Description("Battery weight. 0: field not provided.")
    @Units("g")
    public int weight;
    
    /**
     * Minimum per-cell voltage when discharging. If not supplied set to UINT16_MAX value.
     */
    @Description("Minimum per-cell voltage when discharging. If not supplied set to UINT16_MAX value.")
    @Units("mV")
    public int discharge_minimum_voltage;
    
    /**
     * Minimum per-cell voltage when charging. If not supplied set to UINT16_MAX value.
     */
    @Description("Minimum per-cell voltage when charging. If not supplied set to UINT16_MAX value.")
    @Units("mV")
    public int charging_minimum_voltage;
    
    /**
     * Minimum per-cell voltage when resting. If not supplied set to UINT16_MAX value.
     */
    @Description("Minimum per-cell voltage when resting. If not supplied set to UINT16_MAX value.")
    @Units("mV")
    public int resting_minimum_voltage;
    
    /**
     * Battery ID
     */
    @Description("Battery ID")
    @Units("")
    public short id;
    
    /**
     * Function of the battery
     */
    @Description("Function of the battery")
    @Units("")
    public short battery_function;
    
    /**
     * Type (chemistry) of the battery
     */
    @Description("Type (chemistry) of the battery")
    @Units("")
    public short type;
    
    /**
     * Serial number in ASCII characters, 0 terminated. All 0: field not provided.
     */
    @Description("Serial number in ASCII characters, 0 terminated. All 0: field not provided.")
    @Units("")
    public byte serial_number[] = new byte[16];
    
    /**
     * Static device name in ASCII characters, 0 terminated. All 0: field not provided. Encode as manufacturer name then product name separated using an underscore.
     */
    @Description("Static device name in ASCII characters, 0 terminated. All 0: field not provided. Encode as manufacturer name then product name separated using an underscore.")
    @Units("")
    public byte device_name[] = new byte[50];
    
    /**
     * Maximum per-cell voltage when charged. 0: field not provided.
     */
    @Description("Maximum per-cell voltage when charged. 0: field not provided.")
    @Units("mV")
    public int charging_maximum_voltage;
    
    /**
     * Number of battery cells in series. 0: field not provided.
     */
    @Description("Number of battery cells in series. 0: field not provided.")
    @Units("")
    public short cells_in_series;
    
    /**
     * Maximum pack discharge current. 0: field not provided.
     */
    @Description("Maximum pack discharge current. 0: field not provided.")
    @Units("mA")
    public long discharge_maximum_current;
    
    /**
     * Maximum pack discharge burst current. 0: field not provided.
     */
    @Description("Maximum pack discharge burst current. 0: field not provided.")
    @Units("mA")
    public long discharge_maximum_burst_current;
    
    /**
     * Manufacture date (DD/MM/YYYY) in ASCII characters, 0 terminated. All 0: field not provided.
     */
    @Description("Manufacture date (DD/MM/YYYY) in ASCII characters, 0 terminated. All 0: field not provided.")
    @Units("")
    public byte manufacture_date[] = new byte[11];
    

    /**
     * Generates the payload for a mavlink message for a message of this type
     * @return
     */
    @Override
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH,isMavlink2);
        packet.sysid = sysid;
        packet.compid = compid;
        packet.msgid = MAVLINK_MSG_ID_SMART_BATTERY_INFO;

        packet.payload.putInt(capacity_full_specification);
        packet.payload.putInt(capacity_full);
        packet.payload.putUnsignedShort(cycle_count);
        packet.payload.putUnsignedShort(weight);
        packet.payload.putUnsignedShort(discharge_minimum_voltage);
        packet.payload.putUnsignedShort(charging_minimum_voltage);
        packet.payload.putUnsignedShort(resting_minimum_voltage);
        packet.payload.putUnsignedByte(id);
        packet.payload.putUnsignedByte(battery_function);
        packet.payload.putUnsignedByte(type);
        
        for (int i = 0; i < serial_number.length; i++) {
            packet.payload.putByte(serial_number[i]);
        }
                    
        
        for (int i = 0; i < device_name.length; i++) {
            packet.payload.putByte(device_name[i]);
        }
                    
        
        if (isMavlink2) {
             packet.payload.putUnsignedShort(charging_maximum_voltage);
             packet.payload.putUnsignedByte(cells_in_series);
             packet.payload.putUnsignedInt(discharge_maximum_current);
             packet.payload.putUnsignedInt(discharge_maximum_burst_current);
             
        for (int i = 0; i < manufacture_date.length; i++) {
            packet.payload.putByte(manufacture_date[i]);
        }
                    
            
        }
        return packet;
    }

    /**
     * Decode a smart_battery_info message into this class fields
     *
     * @param payload The message to decode
     */
    @Override
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.capacity_full_specification = payload.getInt();
        this.capacity_full = payload.getInt();
        this.cycle_count = payload.getUnsignedShort();
        this.weight = payload.getUnsignedShort();
        this.discharge_minimum_voltage = payload.getUnsignedShort();
        this.charging_minimum_voltage = payload.getUnsignedShort();
        this.resting_minimum_voltage = payload.getUnsignedShort();
        this.id = payload.getUnsignedByte();
        this.battery_function = payload.getUnsignedByte();
        this.type = payload.getUnsignedByte();
        
        for (int i = 0; i < this.serial_number.length; i++) {
            this.serial_number[i] = payload.getByte();
        }
                
        
        for (int i = 0; i < this.device_name.length; i++) {
            this.device_name[i] = payload.getByte();
        }
                
        
        if (isMavlink2) {
             this.charging_maximum_voltage = payload.getUnsignedShort();
             this.cells_in_series = payload.getUnsignedByte();
             this.discharge_maximum_current = payload.getUnsignedInt();
             this.discharge_maximum_burst_current = payload.getUnsignedInt();
             
        for (int i = 0; i < this.manufacture_date.length; i++) {
            this.manufacture_date[i] = payload.getByte();
        }
                
            
        }
    }

    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_smart_battery_info() {
        this.msgid = MAVLINK_MSG_ID_SMART_BATTERY_INFO;
    }

    /**
     * Constructor for a new message, initializes msgid and all payload variables
     */
    public msg_smart_battery_info( int capacity_full_specification, int capacity_full, int cycle_count, int weight, int discharge_minimum_voltage, int charging_minimum_voltage, int resting_minimum_voltage, short id, short battery_function, short type, byte[] serial_number, byte[] device_name, int charging_maximum_voltage, short cells_in_series, long discharge_maximum_current, long discharge_maximum_burst_current, byte[] manufacture_date) {
        this.msgid = MAVLINK_MSG_ID_SMART_BATTERY_INFO;

        this.capacity_full_specification = capacity_full_specification;
        this.capacity_full = capacity_full;
        this.cycle_count = cycle_count;
        this.weight = weight;
        this.discharge_minimum_voltage = discharge_minimum_voltage;
        this.charging_minimum_voltage = charging_minimum_voltage;
        this.resting_minimum_voltage = resting_minimum_voltage;
        this.id = id;
        this.battery_function = battery_function;
        this.type = type;
        this.serial_number = serial_number;
        this.device_name = device_name;
        this.charging_maximum_voltage = charging_maximum_voltage;
        this.cells_in_series = cells_in_series;
        this.discharge_maximum_current = discharge_maximum_current;
        this.discharge_maximum_burst_current = discharge_maximum_burst_current;
        this.manufacture_date = manufacture_date;
        
    }

    /**
     * Constructor for a new message, initializes everything
     */
    public msg_smart_battery_info( int capacity_full_specification, int capacity_full, int cycle_count, int weight, int discharge_minimum_voltage, int charging_minimum_voltage, int resting_minimum_voltage, short id, short battery_function, short type, byte[] serial_number, byte[] device_name, int charging_maximum_voltage, short cells_in_series, long discharge_maximum_current, long discharge_maximum_burst_current, byte[] manufacture_date, int sysid, int compid, boolean isMavlink2) {
        this.msgid = MAVLINK_MSG_ID_SMART_BATTERY_INFO;
        this.sysid = sysid;
        this.compid = compid;
        this.isMavlink2 = isMavlink2;

        this.capacity_full_specification = capacity_full_specification;
        this.capacity_full = capacity_full;
        this.cycle_count = cycle_count;
        this.weight = weight;
        this.discharge_minimum_voltage = discharge_minimum_voltage;
        this.charging_minimum_voltage = charging_minimum_voltage;
        this.resting_minimum_voltage = resting_minimum_voltage;
        this.id = id;
        this.battery_function = battery_function;
        this.type = type;
        this.serial_number = serial_number;
        this.device_name = device_name;
        this.charging_maximum_voltage = charging_maximum_voltage;
        this.cells_in_series = cells_in_series;
        this.discharge_maximum_current = discharge_maximum_current;
        this.discharge_maximum_burst_current = discharge_maximum_burst_current;
        this.manufacture_date = manufacture_date;
        
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     *
     */
    public msg_smart_battery_info(MAVLinkPacket mavLinkPacket) {
        this.msgid = MAVLINK_MSG_ID_SMART_BATTERY_INFO;

        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.isMavlink2 = mavLinkPacket.isMavlink2;
        unpack(mavLinkPacket.payload);
    }

                         
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setSerial_Number(String str) {
        int len = Math.min(str.length(), 16);
        for (int i=0; i<len; i++) {
            serial_number[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<16; i++) {            // padding for the rest of the buffer
            serial_number[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getSerial_Number() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 16; i++) {
            if (serial_number[i] != 0)
                buf.append((char) serial_number[i]);
            else
                break;
        }
        return buf.toString();

    }
                          
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setDevice_Name(String str) {
        int len = Math.min(str.length(), 50);
        for (int i=0; i<len; i++) {
            device_name[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<50; i++) {            // padding for the rest of the buffer
            device_name[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getDevice_Name() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 50; i++) {
            if (device_name[i] != 0)
                buf.append((char) device_name[i]);
            else
                break;
        }
        return buf.toString();

    }
                                  
    /**
    * Sets the buffer of this message with a string, adds the necessary padding
    */
    public void setManufacture_Date(String str) {
        int len = Math.min(str.length(), 11);
        for (int i=0; i<len; i++) {
            manufacture_date[i] = (byte) str.charAt(i);
        }

        for (int i=len; i<11; i++) {            // padding for the rest of the buffer
            manufacture_date[i] = 0;
        }
    }

    /**
    * Gets the message, formatted as a string
    */
    public String getManufacture_Date() {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < 11; i++) {
            if (manufacture_date[i] != 0)
                buf.append((char) manufacture_date[i]);
            else
                break;
        }
        return buf.toString();

    }
                         
    /**
     * Returns a string with the MSG name and data
     */
    @Override
    public String toString() {
        return "MAVLINK_MSG_ID_SMART_BATTERY_INFO - sysid:"+sysid+" compid:"+compid+" capacity_full_specification:"+capacity_full_specification+" capacity_full:"+capacity_full+" cycle_count:"+cycle_count+" weight:"+weight+" discharge_minimum_voltage:"+discharge_minimum_voltage+" charging_minimum_voltage:"+charging_minimum_voltage+" resting_minimum_voltage:"+resting_minimum_voltage+" id:"+id+" battery_function:"+battery_function+" type:"+type+" serial_number:"+serial_number+" device_name:"+device_name+" charging_maximum_voltage:"+charging_maximum_voltage+" cells_in_series:"+cells_in_series+" discharge_maximum_current:"+discharge_maximum_current+" discharge_maximum_burst_current:"+discharge_maximum_burst_current+" manufacture_date:"+manufacture_date+"";
    }

    /**
     * Returns a human-readable string of the name of the message
     */
    @Override
    public String name() {
        return "MAVLINK_MSG_ID_SMART_BATTERY_INFO";
    }
}
        