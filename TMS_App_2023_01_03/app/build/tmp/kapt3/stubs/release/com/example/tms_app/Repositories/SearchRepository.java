package com.example.tms_app.Repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J!\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/tms_app/Repositories/SearchRepository;", "", "movieDao", "Lcom/example/tms_app/DataBase/Dao/MovieDao;", "tvDao", "Lcom/example/tms_app/DataBase/Dao/TvDao;", "(Lcom/example/tms_app/DataBase/Dao/MovieDao;Lcom/example/tms_app/DataBase/Dao/TvDao;)V", "getMovieDao", "()Lcom/example/tms_app/DataBase/Dao/MovieDao;", "getTvDao", "()Lcom/example/tms_app/DataBase/Dao/TvDao;", "Search", "", "api_key", "", "query", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public final class SearchRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.tms_app.DataBase.Dao.MovieDao movieDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.tms_app.DataBase.Dao.TvDao tvDao = null;
    
    public SearchRepository(@org.jetbrains.annotations.NotNull()
    com.example.tms_app.DataBase.Dao.MovieDao movieDao, @org.jetbrains.annotations.NotNull()
    com.example.tms_app.DataBase.Dao.TvDao tvDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.DataBase.Dao.MovieDao getMovieDao() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tms_app.DataBase.Dao.TvDao getTvDao() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object Search(@org.jetbrains.annotations.NotNull()
    java.lang.String api_key, @org.jetbrains.annotations.NotNull()
    java.lang.String query, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}