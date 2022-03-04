package com.nickaleatorioo.datamanager.api;

import com.nickaleatorioo.datamanager.api.manager.CacheManager;
import com.nickaleatorioo.datamanager.api.manager.DatabaseManager;

/* Instancia principal do projeto */
public interface DataManager {
    CacheManager getCacheManager();

    DatabaseManager getDatabaseManager();
}
