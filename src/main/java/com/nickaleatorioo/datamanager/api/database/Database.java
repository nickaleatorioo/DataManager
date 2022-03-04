package com.nickaleatorioo.datamanager.api.database;

import com.nickaleatorioo.datamanager.api.data.Data;

import java.util.UUID;

public interface Database {
    Data queryData(UUID uuid);

    void insert(Data data);

    void update(Data data);

    void delete(Data data);
}
