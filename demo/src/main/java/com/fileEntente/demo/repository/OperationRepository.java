package com.fileEntente.demo.repository;

import com.fileEntente.demo.model.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OperationRepository extends JpaRepository<Operation,Long> {
    @Query("SELECT min(id) FROM Operation u  WHERE u.status = 0 and u.dateOperation=:date")
    int getMin(@Param("date") String date);
    @Query("SELECT u FROM Operation u WHERE u.status = 0 and u.id = :id")
    Operation minOperation(
            @Param("id") Integer id);
    @Query("SELECT u FROM Operation u WHERE u.status = 0 and u.id = :id and u.dateOperation=:date")
    Operation rappellOperation(
            @Param("id") Integer id,
            @Param("date") String date);
}
