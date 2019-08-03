package com.ethan.and.db.room.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.ethan.and.db.room.entity.IpMessage;

import java.util.List;

@Dao
public interface IpMessageDao {
    @Query("SELECT * FROM ip_message ORDER BY _id DESC")
    List<IpMessage> getAllMessage();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(IpMessage sms);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void update(IpMessage sms);
}
