package com.pratice.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class RoomService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;
    private Long userId;
    private String serviceDescription;
    private Double servicePrice;

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }

    public Double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(Double servicePrice) {
        this.servicePrice = servicePrice;
    }

    @Entity
    public static class RoomManagement {
        @Id
        private int roomno;
        private String roomType;
        private int roomStatus=0;

        public int getRoomStatus() {
            return roomStatus;
        }

        public void setRoomStatus(int roomStatus) {
            this.roomStatus = roomStatus;
        }

        private Date availableDate;
        public int getRoomno() {
            return roomno;
        }
        public void setRoomno(int roomno) {
            this.roomno = roomno;
        }


        public Date getAvailableDate() {
            return availableDate;
        }
        public void setAvailableDate(Date availableDate) {
            this.availableDate = availableDate;
        }
        public String getRoomType() {
            return roomType;
        }
        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }


    }
}
