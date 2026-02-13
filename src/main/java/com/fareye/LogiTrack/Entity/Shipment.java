package com.fareye.LogiTrack.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Shipment")
public class Shipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String TrackingNumber;
    private String SenderName;
    private String Receivername;
    private String ShipmentWeight;

    public Shipment() {
    }

    public Shipment(Long ID, String trackingNumber, String senderName, String receivername, String shipmentWeight) {
        this.ID = ID;
        TrackingNumber = trackingNumber;
        SenderName = senderName;
        Receivername = receivername;
        ShipmentWeight = shipmentWeight;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getTrackingNumber() {
        return TrackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        TrackingNumber = trackingNumber;
    }

    public String getSenderName() {
        return SenderName;
    }

    public void setSenderName(String senderName) {
        SenderName = senderName;
    }

    public String getReceivername() {
        return Receivername;
    }

    public void setReceivername(String receivername) {
        Receivername = receivername;
    }

    public String getShipmentWeight() {
        return ShipmentWeight;
    }

    public void setShipmentWeight(String shipmentWeight) {
        ShipmentWeight = shipmentWeight;
    }
}
