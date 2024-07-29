package com.pratice.demo.repository;

import org.springframework.stereotype.Repository;
import com.pratice.demo.entity.RoomManagement;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
public class CustomRoomManagementRepositoryImpl implements CustomRoomManagementRepository{
	@PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public void updateTable() {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaUpdate<RoomManagement> update = cb.createCriteriaUpdate(RoomManagement.class);
        Root<RoomManagement> root = update.from(RoomManagement.class);

        update.set(root.get("room_status"), 0);
        update.where(cb.lessThan(root.get("availableDate"), cb.currentTimestamp()));

        entityManager.createQuery(update).executeUpdate();
        
    }
}
