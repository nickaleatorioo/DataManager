package com.nickaleatorioo.datamanager.api;

import com.nickaleatorioo.datamanager.api.manager.CacheManager;
import com.nickaleatorioo.datamanager.api.manager.DatabaseManager;

public final class DataManagerProvider implements DataManager {
    private CacheManager cacheManager;
    private DatabaseManager databaseManager;

    /*
    * Ideia principal da API é gerenciar a parte burocrata de dados de um projeto completo ou
    * auxiliar com vários métodos de leitura e gravação de dados mais simples porem poderosos
    *
    * A ideia da dessa classe é juntar todas as funcionalidades funcionando como uma só,
    * porém também ter a possibilidade de usar apenas algumas funcionalidades do projeto em si
    * */

    public DataManagerProvider() {
    }

    @Override
    public CacheManager getCacheManager() {
        return cacheManager;
    }

    @Override
    public DatabaseManager getDatabaseManager() {
        return databaseManager;
    }
}
